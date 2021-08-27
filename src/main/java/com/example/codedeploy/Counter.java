package com.example.codedeploy;

public class Counter {

	private long value;

	public Counter() {
		this.value = 0;
	}

	public long next() {
		this.value = this.value + 2;
		return this.value;
	}
}
