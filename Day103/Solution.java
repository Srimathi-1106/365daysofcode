// LEETCODE PROBLEM - 1845. Seat Reservation Manager

class SeatManager {
    PriorityQueue<Integer> r;
    
    public SeatManager(int n) {
        r=new PriorityQueue<Integer>();
        for(int i=1;i<=n;i++)
        r.offer(i);
    }
    
    public int reserve() {
        return r.poll();
    }

    public void unreserve(int seatNumber) {
        r.offer(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */