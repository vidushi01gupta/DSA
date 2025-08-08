class Solution {
    public static String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            int index = s.indexOf(part); // Find leftmost occurrence
            s = s.substring(0, index) + s.substring(index + part.length());
        }
        return s;
    }

    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";
        System.out.println(removeOccurrences(s, part)); 
    }
}