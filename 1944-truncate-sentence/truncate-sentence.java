class Solution {
    public String truncateSentence(String s, int k) 
    {
        String output="";
        String [] StrArray = s.split(" ");
          for (int i =0 ; i < k ;i++)  
          {
              
              if (i==k-1)
              {
                  output=output+StrArray[i];
              }
              else{
                  output=output+StrArray[i]+" ";
              }
                
          }
          return output;
    }
}