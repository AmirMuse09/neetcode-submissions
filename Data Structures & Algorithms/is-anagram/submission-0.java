class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }


        HashMap<Character, Integer> sString = new HashMap<>();
        

        for(int i = 0; i < s.length(); i++){
            sString.put(s.charAt(i), sString.getOrDefault(s.charAt(i), 0) + 1);
            sString.put(t.charAt(i), sString.getOrDefault(t.charAt(i), 0) - 1);
        }

        for(int count : sString.values()){
            if(count != 0){
                return false;
            }
        }
        return true;

    }
}