package com.genius.log.roman;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @类名 ValidParentheses
 * @描述 ValidParentheses
 * @作者 shuaiqi
 * @创建日期 2019/12/26 22:13
 * @版本号 1.0
 * @参考地址
 **/
public class ValidParentheses {

	final static Map<Character, Character> map = new HashMap<>();

	static {
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
	}

	public static void main(String[] args) {
		final boolean valid = isValid("[{]}");
		System.out.println(valid);
	}

	public static boolean isValid(String s) {
		final Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			final char c = s.charAt(i);
			if (map.containsKey(c)) {
				stack.push(map.get(c));
			} else if (map.containsValue(c)) {
				if (stack.empty() || stack.pop() != c) {
					return false;
				}
			}
		}
		return stack.empty();
	}

}