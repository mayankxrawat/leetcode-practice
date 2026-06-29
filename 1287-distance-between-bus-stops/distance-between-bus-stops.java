class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int clock= 0;
        int antiClock =0;
        int total = 0;
        if(start == destination ){
            return 0;
        }
        if(start > destination){
            int temp = start; 
            start = destination;
            destination = temp;
        }
        for(int i = start; i < destination;i++){
            clock += distance[i];
        }
        for(int d : distance){
            total += d;
        }
        antiClock = total - clock ;
        return Math.min(clock , antiClock);
    }
}