class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0){
            return new int[0][];
        }
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]); // sort array first based on head
        int head=intervals[0][0];
        int tail=intervals[0][1];
        ArrayList<int[]> list=new ArrayList<>();
        
        //sorting the given interval array based on starting point
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        
        for(int[] i:intervals){
            if(i[0]<=tail){ // if current interval start is less than or equal to the tail of the previous interval merge by making tail of prev as tail of current
                tail=Math.max(tail,i[1]); 
            }
            else{
                list.add(new int[]{head,tail}); // if not just add the interval to the list
                head=i[0];
                tail=i[1];
            }
        }
        list.add(new int[]{head,tail}); // add last interval
        return list.toArray(new int[0][]); // return the array list
        
    }
}