package lviv.lgs.uaMin;

class MyThread extends Thread {

	private String name;
	private int delay;
	private int fibanachiNum;

	public MyThread(String name, int delay, int fNum) {

		this.name = name;
		this.delay = delay;
		this.fibanachiNum = fNum;
	}

	@Override
	public void run() {

		int n0 = 1;
		int n1 = 1;
		int n2;

		System.out.print(name + n0 + "; " + n1 + "; ");

		for (int i = 3; i <= fibanachiNum; i++) {
			n2 = n0 + n1;
			System.out.print(n2 + "; ");
			n0 = n1;
			n1 = n2;
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		

	}
}