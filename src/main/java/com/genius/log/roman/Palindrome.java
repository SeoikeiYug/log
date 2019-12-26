package com.genius.log.roman;

/**
 * @类名 Palindrome
 * @描述 Palindrome
 * @作者 shuaiqi
 * @创建日期 2019/12/26 21:53
 * @版本号 1.0
 * @参考地址
 **/
public class Palindrome {

	public static void main(String[] args) {
		final boolean palindrome = palindrome(11211);
		System.out.println(palindrome);
	}

	public static boolean palindrome(int num) {
		if (num < 0) {
			return false;
		}
		int reverse = 0;
		int remainder;
		int original = num;
		while (num != 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		return reverse == original;
	}

}