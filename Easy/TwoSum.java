/**
 *
 * Name :		Lang, Wesley
 * Task :		TwoSum
 * Date : 		December 1, 2016
 * Course : 	LeetCode - Algorithms - Easy
 * Description: Given an array of integers, return indices of the two numbers such that 
 * 				they add up to a specific target.
 * 
 * 				**You may assume that each input would have exactly one solution.**
 * 
 */	

import java.util.*;

public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
	
		Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        map.put(nums[i], i);
	    }
	    for (int i = 0; i < nums.length; i++) {
	    	
	        int complement = target - nums[i];
	        if (map.containsKey(complement) && map.get(complement) != i) {
	            return new int[] { i, map.get(complement) };
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
}