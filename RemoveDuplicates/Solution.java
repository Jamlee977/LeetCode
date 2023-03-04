import java.util.LinkedHashMap;
public class Solution {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(new Solution().removeDuplicates(nums));
    }
    public int removeDuplicates(int[] nums) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else continue;
        }

        int[] newNums = new int[map.size()];
        int i = 0;
        for (int key : map.keySet()) {
            newNums[i] = key;
            i++;
        }

        for (int j = 0; j < newNums.length; j++) {
            nums[j] = newNums[j];
        }
        
        return newNums.length;
    }
}
