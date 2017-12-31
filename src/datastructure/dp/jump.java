package datastructure.dp;

public class jump {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={2,3,1,1,2,4,2,0,1,1};
		System.out.println("Min Jump "+minJump(a,a.length));
		

	}
	public static int minJump(int[] a, int n)
	{
		int[] minJump=new int[n];
		int[] s=new int[n];
		minJump[0]=0;
		s[0]=0;
		for(int i=1;i<n;i++)
		{
			minJump[i]=Integer.MAX_VALUE;
			for(int j=0;j<i;j++)
			{
				if(a[j]>=(i-j))
				{
					if(minJump[j]+1<minJump[i])
					{
						minJump[i]=minJump[j]+1;
						s[i]=j;
					}
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(s[i]);
		}
		return minJump[n-1];
	}

}
