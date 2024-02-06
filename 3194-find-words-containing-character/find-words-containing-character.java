class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) 
    {
        ArrayList arr= new ArrayList();
        int n= words.length;
        String s=String.valueOf(x);
        for (int i=0;i<n;i++)
        {
            if (words[i].contains(s))
            {
                arr.add(i);
            }
        }
        return arr;
    }
}