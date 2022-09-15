class Solution {
    ArrayList<ArrayList<Integer>> courses;
    boolean visited[];
    boolean stack[];
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        courses = new ArrayList<ArrayList<Integer>>();
        visited = new boolean[numCourses];
        stack = new boolean[numCourses];
        
        for(int i = 0; i< numCourses; i++)
            courses.add(new ArrayList<Integer>());
        
        for(int i = 0; i< prerequisites.length; i++)
            courses.get(prerequisites[i][1]).add(prerequisites[i][0]);
        
        for(int i = 0; i< numCourses; i++){
            if(!visited[i])
                if(isCycle(i))
                    return false;
        }
        
        return true;
    }
    
    public boolean isCycle(int i){
        if(stack[i]) return true;
        if(visited[i]) return false;
        stack[i] = true;
        visited[i] = true;
        
        for(int w : courses.get(i)){
            if(isCycle(w)) return true;
        }
        stack[i] = false;
        return false;
    }
}