package WorkingWithMathFunctions;

public class Draw {
	public static void main(String[] args) {
		int n = 6;
		
		drawFunction(
			(x, y) -> x != n - y && x != y, 
			n + 1);
		
		drawFunction(
			(x, y) -> x == n - y || x == y, 
			n + 1);
		
		drawFunction(
			(x, y) -> x == y % 2 || y == x % 2, 
			n + 1);
		
		drawFunction(
			(x, y) -> x == 0 || x == y, 
			n + 1);
		
		int m = 10;
		
		drawFunction(
			(x, y) -> y == (x - m / 2) * (x - m / 2), 
			m + 1);
		
		drawFunction(
			(x, y) -> x == (y - m / 2) * (y - m / 2), 
			m + 1);
		
		
	}
	
	public static void drawFunction(PredicateBinary<Integer> p, int scale) {
		for(int i = 0; i < scale; i++) {
			for(int j = 0; j < scale; j++) {
				if(p.test(i, j)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.print("\n\n");
	}
}
