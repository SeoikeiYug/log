package com.genius.log.roman;

/**
 * @类名 LongestCommonPrefix
 * @描述 TODO
 * @作者 shuaiqi
 * @创建日期 2019/12/26 21:32
 * @版本号 1.0
 * @参考地址
 **/
public class LongestCommonPrefix {

	public static void main(String[] args) {
		final String[] stringArr = {"haha", "hehe"};
		System.out.println(longestCommonPrefix(stringArr));
	}

	public static String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}
		String prefix = strs[0];
		for (int i = 1; i < strs.length; i++) {
			while (strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty()) {
					return "";
				}
			}
		}
		return prefix;
	}

}