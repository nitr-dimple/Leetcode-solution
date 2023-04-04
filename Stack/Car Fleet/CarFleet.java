class Car {
    public int pos;
    public double reachtime;

    public Car(int pos, double time){
        this.pos = pos;
        this.reachtime = time;
    }
}
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        int res = 0;
        Car car[] = new Car[position.length];

        for(int i = 0; i<position.length; i++){
            car[i] = new Car(position[i] , (double)(target - position[i])/speed[i]);
        }

        Arrays.sort(car, (x, y) -> y.pos - x.pos);
        double max = 0;
        for(Car c: car){
            if(c.reachtime > max){
                max = c.reachtime;
                res++;
            }
        }
        return res;
        
    }
}