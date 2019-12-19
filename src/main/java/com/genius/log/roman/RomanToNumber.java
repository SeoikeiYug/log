package com.genius.log.roman;

import java.util.HashMap;
import java.util.Map;

/**
 * @类名 RomanToNumber
 * @描述 RomanToNumber
 * @作者 shuaiqi
 * @创建日期 2019/12/18 11:57
 * @版本号 1.0
 * @参考地址
 **/
public class RomanToNumber {

	private static Map<Character, Integer> map = new HashMap<>();

	private static Map<Character, Integer> getMap() {
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		return map;
	}

	private static int romanToInt(String s) {
		getMap();
		Integer value = map.get(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			if (map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
				value = value + map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
			} else {
				value = value + map.get(s.charAt(i));
			}
		}
		return value;
	}

	public static void main(String[] args) {
		final int value = RomanToNumber.romanToInt("MCM");
		System.out.println(value);
	}

}