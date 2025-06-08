import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
	private int capacity;

	private Map<Integer, Integer> cache = null;
	private LinkedHashMap<Integer, Long> hscache = null;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		cache = new LinkedHashMap<>();
		hscache = new LinkedHashMap<>();
	}

	public int get(int key) {
		if (cache.containsKey(key)) {
			hscache.put(key, System.nanoTime());
			return cache.get(key);
		}
		return -1;

	}

	public void put(int key, int value) {
		if (cache.size() >= capacity) {
			evict();

		}
		cache.put(key, value);
		hscache.put(key, System.nanoTime());

	}

	private void evict() {

		int oldkey = -1;
		long oldTime = Long.MAX_VALUE;

		for (Map.Entry<Integer, Long> entry : hscache.entrySet()) {

			if (entry.getValue() < oldTime) {
				oldkey = entry.getKey();
				oldTime = entry.getValue();

			}

		}
		cache.remove(oldkey);
		hscache.remove(oldkey);

	}

	public static void main(String[] args) {

		LRUCache cache = new LRUCache(2);
		cache.put(1, 1);
		cache.put(2, 2);
		System.out.println(cache.get(1));
		cache.put(3, 3);
		System.out.println(cache.get(2));
		cache.put(4, 4);
		System.out.println(cache.get(1));
		System.out.println(cache.get(3));
		System.out.println(cache.get(4));
	}

}
