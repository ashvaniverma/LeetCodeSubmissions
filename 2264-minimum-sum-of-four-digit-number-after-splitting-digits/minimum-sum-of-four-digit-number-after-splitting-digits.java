class Solution {
    public int minimumSum(int num) 
    { 
        String s1="";
        String s2="";
        int digit=0;

        int[] arr= new int[4];
        int i=-1;
        while (num>0)
        {    i++;
            digit=num%10;
            
            arr[i]=digit;
            
            num=num/10;
        }
        Arrays.sort(arr);
        s1=s1+arr[0]+arr[2];
        s2=s2+arr[1]+arr[3];
        System.out.println(s1); 
        return Integer.parseInt(s1)+Integer.parseInt(s2);
        
        
    }
}