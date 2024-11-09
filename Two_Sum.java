package com.learning.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum {
	public static void main(String[] args) {
		
		int[] arr = {2,7,11,15};
		int target = 9;
		System.out.println(Arrays.toString(Two_sum(arr,target)));
	}

	private static int[] Two_sum(int[] arr, int target) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i =0;i<arr.length;i++) {
			int check = target- arr[i];
			if(map.containsKey(check)) {
				int[] arr1 = {map.get(check),i};
				return arr1;
			}
			else {
				map.put(arr[i],i);
			}
		}
		return null;
		
	}

}
