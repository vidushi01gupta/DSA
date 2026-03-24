class Solution {
    public static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));
        char[] result = new char[s.length()];
        int index = 0;
        for (char c : list) {
            int freq = map.get(c);
            for (int i = 0; i < freq; i++) {
                result[index] = c;
                index++;
            }
        }
        return new String(result);
        
    }
}