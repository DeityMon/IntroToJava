package Chapter20;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.offer("�人");
		queue.offer("����");
		queue.offer("����");
		queue.offer("����");
		queue.offer("����");

		while (queue.size() > 0)
			System.out.println(queue.remove() + " ");
	}
}
