import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLockExample {
	private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	private int sharedData = 0;

	// Method to read data
	public int readData() {
		lock.readLock().lock(); // Acquire the read lock
		try {
			return sharedData;
		} finally {
			lock.readLock().unlock(); // Release the read lock
		}
	}

	// Method to write data
	public void writeData(int value) {
		lock.writeLock().lock(); // Acquire the write lock
		try {
			sharedData = value;
		} finally {
			lock.writeLock().unlock(); // Release the write lock
		}
	}

	public static void main(String[] args) {
		ReentrantReadWriteLockExample example = new ReentrantReadWriteLockExample();

		// Thread to read data
		Thread reader = new Thread(() -> {
			System.out.println("Read: " + example.readData());
		});

		// Thread to write data
		Thread writer = new Thread(() -> {
			example.writeData(42);
			System.out.println("Written: 42");
		});

		reader.start();
		writer.start();
	}
}
