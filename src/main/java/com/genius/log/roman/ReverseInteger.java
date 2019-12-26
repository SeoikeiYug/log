package com.genius.log.roman;

/**
 * @类名 ReverseInteger
 * @描述 ReverseInteger
 * @作者 shuaiqi
 * @创建日期 2019/12/26 20:18
 * @版本号 1.0
 * @参考地址
 **/
public class ReverseInteger {

	public static void main(String[] args) {
		final int reverse = reverse(101);
		System.out.println(reverse);
	}

	public static int reverse(int x) {
		int sum = 0;
		while (x != 0) {
			if ((sum * 10L) > Integer.MAX_VALUE || (sum * 10L) < Integer.MIN_VALUE) {
				return 0;
			}
			sum = sum * 10 + x % 10;
			x = x / 10;
		}
		return sum;
	}

}