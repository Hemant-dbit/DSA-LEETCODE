class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int min = Integer.MAX_VALUE;
        int sum =0;

        for(int right=0;right<nums.length;right++){
            sum += nums[right];

            while(sum >= target){
                if(right-left+1 < min){
                    min = right-left+1;
                }
                sum -= nums[left];
                left++;
                
            }
        }
        return min != Integer.MAX_VALUE ? min : 0;
    }
}