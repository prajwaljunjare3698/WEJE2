package com.jspider.Thread;

public class MyThreadRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=4;i++) {
			System.out.println("mythread is running");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
