package datastructure.dp;

public class LCSLength<T> {

	public static void main(String[] args) {
		String s1="ABCBDAB";
		String s2="BDCABA";
		LCSLength<Character> lcs=new LCSLength<>();
		//int len=lcs.lcsLength(s1.toCharArray(),0,s1.length(),s2.toCharArray(),0,s2.length());
		
		int len=lcs.lcsLengthRecursion(s1.toCharArray(),0,s1.length(),s2.toCharArray(),0,s2.length());
		System.out.println("Length is: "+len);
	}
	private int lcsLengthDP(char[] x,int i,int m,char[] y,int j,int n)
	{
		int[][] lcsTable;
		if(i==m || j==n)
			return 0;
		
		
	}
	
	private int lcsLengthRecursion(char[] x,int i,int m,char[] y,int j,int n)
	{
		if(i==m || j==n)
			return 0;
		if(x[i]==y[j])
			return 1+lcsLengthRecursion(x, i+1, m, y, j+1, n);
		else
			return lcsLengthRecursion(x, i+1, m, y, j, n)>lcsLengthRecursion(x, i, m, y, j+1, n)?lcsLengthRecursion(x, i+1, m, y, j, n):lcsLengthRecursion(x, i, m, y, j+1, n);
		
	}
	/*private int lcsLength(char[] x,int m,char[] y,int n)
	{
		int maxSum=0;
		for(int i=0;i<m;i++)
		{
			int currentSum=0;
			for(int j=i+1;j<n;j++)
			{
				if(x[i]==y[j])
				{
					currentSum++;
					continue;
				}
			}
			if(maxSum<currentSum)
			{
				maxSum=currentSum;
			}
		}
		return maxSum;
	}*/

}
