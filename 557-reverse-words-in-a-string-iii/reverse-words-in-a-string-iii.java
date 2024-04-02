class Solution {

    public  String revString(String Str)
    {
        StringBuilder sb = new StringBuilder(Str);
        String revString=sb.reverse().toString();
        return revString;
    }

    public String reverseWords(String s) 
    {
        String Stri="";
        String[] words=s.split("\\s");
        for (String sp:words)
        {
           Stri=Stri+" "+revString(sp);
        }
        return Stri.trim();
    }
}