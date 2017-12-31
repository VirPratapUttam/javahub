package datastructure.dp;

public class SubSetSumUsingDP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s={3,2,4,9,3};
		int n=s.length;
		int sum=6;
		System.out.println(isSubSet(s,n,sum));
		

	}

	private static boolean isSubSet(int[] s, int n, int sum) {
		boolean m[][]=new boolean[n+1][sum+1];
		m[0][0]=true;
		for(int i=1;i<=n;i++)
			m[i][0]=true;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sum;j++)
			{
				m[i][j] = m[i][j-1];
		          if (i >= s[j-1])
		            m[i][j] = m[i][j] || 
		                                       m[i - s[j-1]][j-1];	
			}
		}
		
		printMatrix(m,n);
		return m[n][sum];
	}

	private static void printMatrix(boolean[][] m, int n) {
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
	}

}
