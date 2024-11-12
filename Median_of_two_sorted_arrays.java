package com.learning.leetcode;

import java.util.Arrays;

public class Median_of_two_sorted_arrays {
	public static void main(String[] args) {
		
		int[] nums1 = {1,2,3};
		int[] nums2 = {9};
		
		float res = Median_of_two_sorted_arrays(nums1,nums2);
		System.out.println(res);
	}

	private static float Median_of_two_sorted_arrays(int[] nums1, int[] nums2) {
		// TODO Auto-generated method stub
		
		int[] sort = new int[nums1.length+nums2.length];
		int i=0;int j =0;int k=0;
		float result=0;
		while(i<nums1.length && j<nums2.length) {
			
			if(nums1[i]<nums2[j]) {
				sort[k]=nums1[i];
				i++;
				k++;
			}
			else {
				sort[k]=nums2[j];
				j++;
				k++;
			}
		}
		while(i<nums1.length) {
			sort[k]=nums1[i];
			i++; k++;
		}
		while(j<nums2.length) {
			sort[k]=nums2[j];
			j++; k++;
		}
		System.out.println(Arrays.toString(sort));
		if(sort.length%2==0) {
			result =(float) ((sort[sort.length/2]) + (sort[(sort.length/2)-1]));
			result = (float)result/2;
		}else {
			result = sort[sort.length/2];
		}
		
		return result;
	}

}
