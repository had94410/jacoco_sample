package com.example.test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class HogeTest {

	@Test
	public void ふつうのたしざん() {
		Hoge hoge = new Hoge();
		assertThat(hoge.sum("1", "2"), is(3));
	}
}
