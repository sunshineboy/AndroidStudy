package com.sun.callback;

public class TestCallback {


	public static void main(String[] args) {

		Li li = new Li();
		
		Wang wang = new Wang(li);
		
		wang.askQuestion("小李:1+1=?");
		
	}

}
