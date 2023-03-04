public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLastWord("Hello World"));
        System.out.println(new Solution().lengthOfLastWord("hello word  "));
    }
    public int lengthOfLastWord(String s) {
        int length = 0;
        String temp = s;
        while(temp.charAt(temp.length() - 1) == ' ') {
            temp = temp.substring(0, temp.length() - 1);
        }
        for(int i = temp.length() - 1; i >= 0; i--) {
            if(temp.charAt(i) == ' ') {
                break;
            }
            length++;
        }
        return length;
    }
}
