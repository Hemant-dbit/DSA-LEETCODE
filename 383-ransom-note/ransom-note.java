class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> Set = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            Set.put(c, Set.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!Set.containsKey(c) || Set.get(c) <= 0) {
                return false;
            }
            Set.put(c, Set.get(c) - 1);
        }

        return true;
    }
}