class Solution {
    public int[] rearrangeArray(int[] nums) 
    {
       int [] arr = new int [nums.length];
        int posIndex=0;
        int NegIndex=1;
       for (int i=0;i<nums.length;i++)
       {
            if (nums[i]>0)
            {
                arr[posIndex]=nums[i];
                posIndex +=2;
            }
            else
            {
                arr[NegIndex]=nums[i];
                NegIndex +=2;
            }
       }
       return arr;
    }
}