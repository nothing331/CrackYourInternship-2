class Solution {
    public void sortColors(int[] nums) {
        int rCount =0;
        int wCount =0;
        int bCount =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                rCount++;
            else if(nums[i]==1)
                wCount++;
            else if(nums[i]==2)
                bCount++;
        }
        int index = 0;
        for (int i = 0; i < rCount; i++) {
            nums[index++] = 0;
        }
        for (int i = 0; i < wCount; i++) {
            nums[index++] = 1;
        }
        for (int i = 0; i < bCount; i++) {
            nums[index++] = 2;
        }
    }
}