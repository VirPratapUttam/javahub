package datastructure.arrays;


public class CanPartionedWithEqualSum {

	public static void main(String[] args) {
		int[] array = {4,2,2,0,-1,1};
		if(canBePartitioned(array)){
			System.out.println("the given array can be partitioned.");
		}else{
			System.out.println("the given array cannot be partitioned.");
		}
		
	}
	
	public static boolean canBePartitioned(int[] array){
		int sum = 0;
		for(int i=0; i<array.length; i++){
			sum += array[i];
		}
		if(sum%1 == 1){
			return false;
		}
		boolean[][] partition = new boolean[sum/2+1][array.length+1];
		for(int i=0;i<array.length+1;i++){
			partition[0][i] = true;
		}
		for(int i=1;i<sum/2+1; i++){
			partition[i][0] = false;
		}
		for(int i=1; i<sum/2+1; i++){
			for(int j=1; j<array.length+1; j++){
				partition[i][j] = partition[i][j-1];
				if(i >= array[j-1])partition[i][j] = partition[i-array[j-1]][j-1] || partition[i][j];
			}
		}
		return partition[sum/2][array.length];
	}
}

