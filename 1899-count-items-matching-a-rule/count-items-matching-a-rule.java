class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) 
    {
        int count=0;
           switch (ruleKey) 
           {
               case "type" :
                            for (List<String> x : items )
                            {int i=0;
                                if (x.get(0).equalsIgnoreCase(ruleValue))
                                {
                                    count=count+1;
                                }
                            }
                    break;        
               case "color" :     
                            for (List<String> x : items )
                            {
                                if (x.get(1).equalsIgnoreCase(ruleValue))
                                {
                                    count=count+1;
                                }
                            }
                            break;
               case "name" :
                            for (List<String> x : items )
                            {
                                if (x.get(2).equalsIgnoreCase(ruleValue))
                                {
                                    count=count+1;
                                }
                            }
                            break;
        }
        return count;
    }
}