package problemsolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

//we can keep a max heap of size k where we check each incoming element vs the top and if it's smaller we replace it. After we've gone through the list of N points we pop our heap into a list and reverse that list. Running time O(N*log(K)) extra space O(K).
public class ClosestPairToOrigin {
	public static void main(String[] args) {
		Point pt1 = new Point(0, 1);
		Point pt2 = new Point(0, 2);
		Point pt3 = new Point(99, 99);
		List<Point> lst = new ArrayList<Point>();
		lst.add(pt1);
		lst.add(pt2);
		lst.add(pt3);
		List<Point> results = ClosestPairToOrigin.findClosestToOrigin(lst, 1);
		for (Point point : results) {
			System.out.println(point.x + " " + point.y);

		}

	}

	static List<Point> findClosestToOrigin(List<Point> points, int numToFind) {
		PriorityQueue<Point> closestPoints = new PriorityQueue(Collections.reverseOrder());
		for (Point point : points) {
			if (closestPoints.size() < numToFind) {
				closestPoints.add(point);
			} else if (point.compareTo(closestPoints.peek()) < 0) {
				closestPoints.poll();
				closestPoints.add(point);
			}
		}
		List<Point> closeList = new ArrayList();
		while (!closestPoints.isEmpty()) {
			closeList.add(closestPoints.poll());
		}
		Collections.reverse(closeList);
		return closeList;
	}

}
