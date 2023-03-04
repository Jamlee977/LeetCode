import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int subtracted = target - nums[i];
            if(map.containsKey(subtracted)) {
                return new int[] {map.get(subtracted), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}