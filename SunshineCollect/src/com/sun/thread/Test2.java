package com.sun.thread;

public class Test2 extends Thread {
	private String sThreadName;

	public static void main(String argv[]) {
		Test2 h = new Test2();
		h.go();
	}

	Test2() {
	}

	Test2(String s) {
		sThreadName = s;
	}

	public String getThreadName() {
		return sThreadName;
	}

	public void go() {
		Test2 first = new Test2("first");
		Test2 second = new Test2("second");
		first.start();
		second.start();
	}

	public void start() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getThreadName() + i);
			/*try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}*/
		}
	}
}
