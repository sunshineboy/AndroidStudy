package com.sun.thread;

public class Test1 {
	public static void main(String argv[]) {
		Test1 a = new Test1();
		a.go();
	}

	public void go() {
		DSRoss ds1 = new DSRoss("one");
		ds1.start();
	}
}

class DSRoss extends Thread {
	private String sTname = "";

	DSRoss(String s) {
		sTname = s;
	}

	public void run() {
		notwait();
		System.out.println("finished");
	}

	public void notwait() {
		while (true) {
			try {
				System.out.println("waiting");
				wait();
			} catch (InterruptedException ie) {
			}
			System.out.println(sTname);
			notifyAll();
		}
	}
}
