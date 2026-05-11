class Solution {
    public static int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            Stack<Integer> st = new Stack<>();
            while (num > 0) {
                st.push(num % 10);
                num /= 10;
            }
            while (!st.isEmpty()) {
                list.add(st.pop());
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
        
    }
}