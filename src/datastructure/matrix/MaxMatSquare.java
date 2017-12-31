package datastructure.matrix;

public class MaxMatSquare {
	
	// return value
	private static class Square {
		int top;
		int left;
		int size;
	}

	public static void main(String[] args) {
		int[][] mat = 
				{ 
					{1,1,1,1,0,0},
					{1,1,1,1,0,0},
					{1,1,1,1,0,0},
					{1,1,1,1,1,1},
					{0,0,0,0,1,1},
				};
		Square s2 = findMaxSquare2(mat);
		System.out.println("top: " + s2.top + " left: " + s2.left + " size:" + s2.size);
		
	}
	
	public static Square findMaxSquare2(int[][] mat) {
		int m = mat.length;
		int n = m > 0 ? mat[0].length : 0;
		int[] counters = new int[n];  // This count the number of consecutive rows with 1 in each col
		                              // If there's on in the cur row in mat, increase the counter, otherwise zero it
		
		int maxS = 0;  // Every row try to search for a square with bigger size than the last found one
		               // to serach for a square of size N there should be N consecutive counts each with >= N counts
		               // size N square can only exist if N-1 square was found before, therefore it's increased one by one
		int tryS, tryCons;
		Square s = new Square();
		
		for (int i=0; i<m; i++) {
			tryS = maxS+1;
			tryCons = 0;
			for (int j=0; j<n; j++) {
				if (mat[i][j] == 1) counters[j]++;
				else counters[j]=0;
				if (counters[j]>=tryS) tryCons++;
				else tryCons = 0;  // Try again
				if (tryCons == tryS) {  // Square found
					maxS = tryS;
					s.size = tryS;
					s.left = j-tryS+1;
					s.top = i-tryS+1;
				}
			}
		}
		return s;
	}
}
