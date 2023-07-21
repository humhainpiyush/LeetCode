class Solution {
    public static int[] decompressRLElist(int[] nums) {
        int size = 0;
        for(int i = 0; i<nums.length; i+=2){
            size += nums[i];
        }

        int[] arr = new int[size];

        int index = 0;
        for(int i = 0; i<nums.length; i += 2){
            for(int j = 0; j<nums[i]; j++){
                arr[index++] = nums[i+1];
            }
        }
        return arr;
    }
}