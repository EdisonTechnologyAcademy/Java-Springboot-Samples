package com.edison.prac02less16;

public class MyRunnableThread {
	public static int myCount = 0;

	public MyRunnableThread() {

	}

	public void run() {
		while (MyRunnableThread.myCount <= 10) {
			try {
				System.out.println("Expl Thread: " + (++MyRunnableThread.myCount));
				Thread.sleep(100);
			} catch (InterruptedException iex) {
				System.out.println("Exception in thread: " + iex.getMessage());
			}
		}
	}
}
