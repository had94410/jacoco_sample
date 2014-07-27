package com.example.test;

public class Hoge {

	public int sum(String i, String j) {
		if (i == null || j == null) {
			return 0;
		}

		return Integer.parseInt(i) + Integer.parseInt(j);
	}
}
