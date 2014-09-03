package kr.co.leehana.example.exception.rejectedexecutionexception;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class RejectedExecutionExceptionExample2 {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = new ThreadPoolExecutor(3, 3, 0L,
				TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(15));

		exceptionRun(executor);
	}

	private static void exceptionRun(ExecutorService executor) {
		Worker tasks[] = new Worker[10];
		for (int i = 0; i < 10; i++) {
			tasks[i] = new Worker(i);
			executor.execute(tasks[i]);
		}

		executor.shutdown();
		executor.execute(tasks[0]);
	}
}
