class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer>nums=new ArrayList<>();
        int num=n;
        while(num!=0){
            nums.add(num%10);
            num=num/10;
        }

        int size=nums.size();
        Collections.sort(nums);
        int res=Integer.MIN_VALUE;
        int product1=nums.get(0)*nums.get(1);
        int product2=nums.get(size-1)*nums.get(size-2);
        return Math.max(product1,product2);

    }
}