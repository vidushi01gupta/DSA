class Solution {
     public static int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i <= chars.length; i++) {
            if (i < chars.length && chars[i] == chars[i - 1]) {
                count++;
            } else {
                sb.append(chars[i - 1]); 
                if (count > 1) {
                    sb.append(count);
                }
                count = 1; 
            }
        }

        // Copy back into chars[]
        for (int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }

        return sb.length();
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int newLength = compress(chars);
        System.out.println("New length: " + newLength);
        System.out.print("Compressed array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i] + " ");
        }
    }
}
   