
import java.util.Arrays;
import java.util.HashMap;

/*
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSum11 {
    public static int[] twosm(int[] nums,int target){
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int remaining = target - nums[i];
            if(map.containsKey(remaining)){
                return new int[] {map.get(remaining),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,18};
        int target = 9;
        TwoSum11 s = new TwoSum11();
        int[] result = s.twosm(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
