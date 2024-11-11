package com.learning.leetcode;

import java.util.ArrayList;
import java.util.Scanner;

public class Length_of_Longest_substring_without_repeting_characters {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String : ");
		String s = sc.nextLine();
		int res = Length_of_Longest_substring_without_repeting_characters(s);
		System.out.println(res);
	}

	private static int Length_of_Longest_substring_without_repeting_characters(String s) {
		// TODO Auto-generated method stub
		
		ArrayList<Character> list = new ArrayList<>();
		int start =0;
		int end =0;
		int Max_length=0;
		while(end<s.length()) {
			if(!list.contains(s.charAt(end))) {
				list.add(s.charAt(end));
				end++;
				Max_length = Math.max(Max_length, list.size());
			}
			else {
				list.remove(Character.valueOf(s.charAt(start)));
				start++;
			}
		}
		return Max_length;
	}
}
