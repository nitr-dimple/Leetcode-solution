class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int start = 0;
        // int prevstart = -1;
        int current =0;

        for(int i=0; i< gas.length; i++){
            // gas[i] = gas[i] - cost[i];
            // total += gas[i];

            // if(current + gas[i] < 0){
            //     current = 0;
            //     prevstart = start;
            // }
            // else{
            //     if(prevstart == start) start = i;
            //     current = current + gas[i];
            // }
            int sum = gas[i] - cost[i];
            current += sum;
            total += sum;
            if(current < 0){
                start = i+1;
                current = 0;
            }
        }
        if(total < 0) return -1;
        
        // for(int i=0; i< gas.length; i++){
        //     if(current + gas[i] < 0){
        //         current = 0;
        //         prevstart = start;
        //     }
        //     else{
        //         if(prevstart == start) start = i;
        //         current = current + gas[i];
        //     }
        //     // if(gas[i] > 0){
        //     //     if(prevstart == start)
        //     //         start = i;
        //     //     current = current + gas[i];
        //     // }
        //     // else{
        //     //     if(current + gas[i] < 0){
        //     //         current = 0;
        //     //         prevstart = start;
        //     //     }
        //     //     else{
        //     //         current = current + gas[i];
        //     //     }
        //     // }
            
        // }
        return start;

        
    }
}