class Twitter {
    int time = 0;

    class Twit {
        int twitTime;
        int twitId;

        public Twit(int twitTime, int twitId){
            this.twitTime = twitTime;
            this.twitId = twitId;
        }
    }

    class User{
        List<Twit> tweetList;
        Set<Integer> followee;

        public User(){
            tweetList = new ArrayList<Twit>();
            followee = new HashSet<Integer>();
        }
    }

    Map<Integer,User> map;
    PriorityQueue<Integer> pq;

    public Twitter() {
        map = new HashMap<Integer,User>();
      
    }
    
    public void postTweet(int userId, int tweetId) {
        Twit twit = new Twit(time++, tweetId);
        if(map.containsKey(userId)){
            if(map.get(userId).tweetList.size() >= 10)
                map.get(userId).tweetList.remove(0);      
        }else
            map.put(userId, new User());
        map.get(userId).tweetList.add(twit);   
    }
    
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> list = new ArrayList<>();
        if(!map.containsKey(userId)) return list;
        
        PriorityQueue<Twit> pq = new PriorityQueue<Twit>((a1, a2) -> a1.twitTime - a2.twitTime);
        for(Twit twit : map.get(userId).tweetList)
        {
            if(pq.size() > 10 && pq.peek().twitTime > twit.twitTime) continue;
            if(pq.size() > 10)
                pq.remove();
            pq.add(twit);
        }
        for(int followee: map.get(userId).followee){
            if(map.containsKey(followee)){
                for(Twit twit : map.get(followee).tweetList)
                    {
                        if(pq.size() > 10 && pq.peek().twitTime > twit.twitTime) continue;
                        if(pq.size() > 10)
                            pq.remove();
                        pq.add(twit);
                    }
            }
        }
        while(pq.size() != 0){
            if(pq.size() > 10) pq.remove();
            list.add(0, pq.poll().twitId);
        }
        return list;
        
    }

    public void follow(int followerId, int followeeId) {
        if( !map.containsKey(followerId))
            map.put(followerId, new User());
        map.get(followerId).followee.add(followeeId);

        
    }
    
    public void unfollow(int followerId, int followeeId) {
        if( map.containsKey(followerId))
            map.get(followerId).followee.remove(Integer.valueOf(followeeId));
        
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */