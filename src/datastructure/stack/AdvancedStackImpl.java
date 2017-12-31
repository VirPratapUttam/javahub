package datastructure.stack;

public class AdvancedStackImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdvancedStack advStack=new AdvancedStack();
		advStack.push(10);
		advStack.push(20);
		advStack.push(3);
		System.out.println(advStack.getMinimum());
		
		
		ModifiedAdvancedStack modAdvStack=new ModifiedAdvancedStack();
		modAdvStack.push(10);
		modAdvStack.push(9);
		modAdvStack.push(13);
		System.out.println(modAdvStack.getMinimum());

	}

}
