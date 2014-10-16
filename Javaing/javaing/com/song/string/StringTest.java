package com.song.string;

public class StringTest {

	public static void main(String[] args) {
		String a = "a"+"b";
		String b = "ab";
		System.out.println(a.hashCode()==b.hashCode());
		System.out.println(a.equals(b));
	}
}
