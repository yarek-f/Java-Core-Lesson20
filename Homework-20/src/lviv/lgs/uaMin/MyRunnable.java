package lviv.lgs.uaMin;

class MyRunnable implements Runnable {
	
	private String name;
	private int delay;
	private int fibanachiNum;

	

	public MyRunnable(String name, int delay, int fibanachiNum) {
		super();
		this.name = name;
		this.delay = delay;
		this.fibanachiNum = fibanachiNum;
		
	}

	@Override
	public void run() {
		
		System.out.print(name);
		for (int i = fibanachiNum; i >= 1; i--) {
			System.out.print(Math.round(Math.pow((1 + Math.sqrt(5)) / 2, i) / Math.sqrt(5)) + "; ");
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace(); 
			}
		}

	}

}