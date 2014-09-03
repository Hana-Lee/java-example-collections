package kr.co.leehana.example.exception.rejectedexecutionexception;

public class Worker implements Runnable {

	private int id;

	public Worker(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		try {
			Thread currentThread = Thread.currentThread();
			System.out.println(currentThread.getName()
					+ " currently execution the task " + id);

			Thread.sleep(500);
			System.out.println(currentThread.getName()
					+ " just completed the task " + id);
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
