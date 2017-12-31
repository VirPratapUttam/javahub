package com.ds.triplet;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class MrXAndHisShots {
	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
			int[][] shotRanges;
	        int[][] fielderRanges;

	            int N = in.nextInt();
	            int M = in.nextInt();

	            shotRanges = new int[N][2];
	            fielderRanges = new int[M][2];

	            for (int i = 0; i < N; i++){
	                shotRanges[i][0] = in.nextInt();
	                shotRanges[i][1] = in.nextInt();
	            }
	            for (int i = 0; i < M; i++){
	                fielderRanges[i][0] = in.nextInt();
	                fielderRanges[i][1] = in.nextInt();
	            }
	            in.close();
	            int sum=solve(shotRanges, fielderRanges);
	            System.out.println(sum);
	            
	}

   public static int solve(int[][] shotRanges, int[][] fielderRanges){
        int total = 0;
        int startPos = 0;
        boolean found;
        int fieldLength = fielderRanges.length;
        int shotLength = shotRanges.length;

        Arrays.sort(shotRanges, new MyComparator());
        Arrays.sort(fielderRanges, new MyComparator());

        for (int i = 0; i < fieldLength; i++) {
            int start1 = fielderRanges[i][0];
            int end1 = fielderRanges[i][1];
            int end3 = Integer.MAX_VALUE;
            if (i < fieldLength - 1) {
                end3 = fielderRanges[i + 1][1];
            }
            found = false;
            for (int j = startPos; j < shotLength; j++) {
                int start2 = shotRanges[j][0];
                int end2 = shotRanges[j][1];

                if (start1 <= end2) {
                    if (end1 >= start2) {
                        if (!found && (end3 >= start2)) {
                            startPos = j;
                            found = true;
                        }
                        total++;
                    } else {
                        break;
                    }
                }

            }
        }
        return total;
    }

}

class MyComparator implements Comparator<int[]>{

    @Override
    public int compare(int[] o1, int[] o2) {
        int result = o1[0] - o2[0];
        if (result == 0) {
            result = o1[1] - o2[1];
        }
        return result;
    }
}