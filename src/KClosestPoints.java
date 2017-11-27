import java.util.*;

public class KClosestPoints {
	
	ArrayList<Point3d> myList = new ArrayList<Point3d>();
	ArrayList<Point3d> outList = new ArrayList<>();
	int kPoints;
	
	public KClosestPoints(int k) {
		kPoints = k;
	}
	
	void init() {
		myList.add(new Point3d(1, 1));
		myList.add(new Point3d(2, 3));
		myList.add(new Point3d(0.5f, 0.5f));
		myList.add(new Point3d(4, 4));
		myList.add(new Point3d(-1.5f, -1));
	}
	
	void printArrayList(ArrayList<Point3d> list) {
		System.out.println("KClosestPoints ");
		for(int i = 0; i < list.size(); i++) {
			System.out.print("[" + list.get(i).x + " " + list.get(i).y + "]");
		}
		System.out.println();
	}
	
	ArrayList<Point3d> func() {
		float epsilon = 0.000001f;
		
		//sort
		Collections.sort(myList);
//		Collections.sort(myList, new Comparator<Point3d>() {
//			@Override
//			public int compare(Point3d o1, Point3d o2) {
//				if(o1.length - o2.length > epsilon) return 1;
//				else if(o1.length - o2.length < epsilon) return -1;
//				return 0;
//			}
//		});
		
		for(int j = 0; j < kPoints; j++) {
			outList.add(myList.get(j));
		}
		
		printArrayList(outList);
		
		return outList;
	}
	
	class Point3d implements Comparable<Point3d>{
		float x;
		float y;
		float length;
		final float epsilon = 0.00001f;

		Point3d(float x, float y) {
			this.x = x;
			this.y = y;
			length = (float)Math.sqrt(x*x + y*y);
		}

		@Override
		public int compareTo(Point3d p1) {
			if(this.length - p1.length > epsilon) return 1;
			if(this.length - p1.length < epsilon) return -1;
			return 0;
		}
	}
	
}
