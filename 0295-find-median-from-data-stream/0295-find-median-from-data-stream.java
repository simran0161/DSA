class MedianFinder {
    PriorityQueue<Integer>max;
    PriorityQueue<Integer> min;

    public MedianFinder() {
        max=new PriorityQueue<>(Collections.reverseOrder());
        min=new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(!max.isEmpty() && num>max.peek()){
            min.offer(num);
        }
        else{
            max.offer(num);
        }

        if(max.size() > min.size() + 1){
            min.offer(max.poll());
        }

        if(min.size() > max.size()){
            max.offer(min.poll());
        }
    }
    
    public double findMedian() {
        if(min.size()==max.size()){
            int first=min.peek();
            int second=max.peek();
            return (double)(first+second)/2;
        }
        else{
            return max.peek();
        }

    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */