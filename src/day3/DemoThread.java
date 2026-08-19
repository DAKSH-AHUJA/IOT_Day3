package day3;

import java.util.Iterator;

public class DemoThread extends Thread { //1. extend thread class
	
	public void run() {   // 2.override run class
		for(int i =0 ; i<5 ; i++) {
			System.out.println(" method" + i);
			
		}	
	}
	
	
	public static void main(String[] args) {
		
		DemoThread bb = new DemoThread();
		bb.start(); // 3. starting a thread
//		bb.run(); // normal class
		
		for(int i =0 ; i<5 ; i++) {
			System.out.println("main method" + i);
			
		}
	}
}
