package lviv.lgs.uaMin;

import java.util.Scanner;

public class Main extends Thread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Enter the number of Fibonacci numbers you want to see:");
		Scanner s = new Scanner(System.in);

		int fibanachiNum = s.nextInt();
		
		MyThread myThread = new MyThread("Thread Stream: ", 1000, fibanachiNum);
		myThread.start();
		myThread.join();
		
		System.out.println();

		MyRunnable myRunnable = new MyRunnable("Runnable Stream: ", 1000, fibanachiNum);
		myRunnable.run();
		myThread.join();
	}

}



