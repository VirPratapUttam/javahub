package datastructure.greedy;

import java.util.Arrays;

public class GreadyAlgoImpl {

	/**
	 * @param args
	 */
	static int[] denomination={5,20,10};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(makingCoin(35));
		System.out.println(makingCoin(0));
		System.out.println(makingCoin(50));
	}
	
	private static int makingCoin(int n)
	{
		Arrays.sort(denomination);
		int count=0;
		for(int i=denomination.length-1;i>=0;i--)
		{
			if(n>=denomination[i])
			{
				n=n-denomination[i];
				count++;
			}
		}
		return count;
	}

}
