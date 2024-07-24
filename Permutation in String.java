class Solution {
    public boolean checkInclusion(String s1, String s2) {
        boolean goal=false;
        char ch1[]=s1.toCharArray();
        Arrays.sort(ch1);
        String ss1=new String(ch1);
        for(int i=0;i<=s2.length()-s1.length();i++)
        {
            char ch2[]=new char[s1.length()];
            for(int j=0;j<s1.length();j++)
            {
             ch2[j]=s2.charAt(i+j);
            }
            Arrays.sort(ch2);
            String ss2=new String(ch2);
            if(ss1.equals(ss2))
            goal=true;
        }
       return goal;
    }
}
