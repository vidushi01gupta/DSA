class Solution {
    public static int lengthOfLastWord(String s) {
        s=s.trim();
        int lastspace=s.lastIndexOf(' ');
        return s.length()-lastspace-1;
        
    }
    public static void main(String[] args){
        String s="Hello World";
        lengthOfLastWord(s);
    }
}