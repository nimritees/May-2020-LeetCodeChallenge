#Jewels and Stones

#Problem Statement:
#You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
#The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

#Example:
#Input: J = "aA", S = "aAAbbbb"
#Output: 3

#Note
#S and J will consist of letters and have length at most 50.
#The characters in J are distinct.

class Solution {
    public int numJewelsInStones(String J, String S) {
        Set<Character> Jset = new HashSet<>();
        
        for(int j = 0; j < J.length(); j++)
            Jset.add(J.charAt(j));
        
        int ans = 0;
        
        for(int i = 0; i < S.length(); i++)
            if(Jset.contains(S.charAt(i)))
                ans ++;
        return ans;
    }
}
