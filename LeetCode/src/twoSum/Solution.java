package twoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] differenceArray = new int[nums.length];
        Map<Integer,Integer> indexMap = new HashMap<>(nums.length);
        for(int i=0;i<nums.length;i++){
            int source = nums[i];
            indexMap.put(source,i);
            differenceArray[i] = target - source;
        }
        for(int i=0;i<differenceArray.length;i++){
            if(indexMap.containsKey(differenceArray[i]) && indexMap.get(differenceArray[i]) != i){
                return new int[] {i,indexMap.get(differenceArray[i])};
            }
        }
        throw new IllegalArgumentException("no two sum solution!");
    }

    //优化后的
    public int[] twoSum1(int[] nums,int target){
        Map<Integer,Integer> indexMap = new HashMap<>(nums.length);
        for(int i = 0; i < nums.length; i++){
            int differ = target - nums[i]; //两数差；
            if(indexMap.containsKey(differ)){
                return new int[] {indexMap.get(differ),i};
            }
            indexMap.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution!"); //没有找到
    }


    public static void main(String[] arg){
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum1(nums,target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

}
