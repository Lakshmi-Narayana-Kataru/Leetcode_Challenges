package com.learning.leetcode;

import java.util.Scanner;

class palindrome {
    public String longestPalindrome(String s) {

        int n = s.length();
        String palindrome ="";
        if(n<=1){
            return s;
        }
        for(int i =1;i<n;i++){
            int low=i;
            int high=i;
            while(s.charAt(low)== s.charAt(high)){
                low--;
                high++;
                if(low==-1 || high==n){
                    break;
                }
            }
            String dummmy = s.substring(low+1,high);
            if(palindrome.length() < dummmy.length()){
                palindrome=dummmy;
            }

            low = i-1;
            high = i;
            while(s.charAt(low)==s.charAt(high)){
                low--;
                high++;
                if(low==-1 || high==n){
                    break;
                }
            }
            dummmy = s.substring(low+1,high);
            if(palindrome.length() < dummmy.length()){
                palindrome=dummmy;
            }
        }
        return palindrome;
    }
}


public class longest_Palindrome_substring
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String : ");
		String s = sc.nextLine();
		
		String res = new palindrome().longestPalindrome(s);
		System.out.println(res);
		
	}
}