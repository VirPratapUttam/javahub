package datastructure.greedy;

public class Job {
	private char c;
	private int deadline;
	private int profit;
	
	public Job(char c, int deadline, int profit) {
		this.c = c;
		this.deadline = deadline;
		this.profit = profit;
	}
	public char getC() {
		return c;
	}
	public void setC(char c) {
		this.c = c;
	}
	public int getDeadline() {
		return deadline;
	}
	public void setDeadline(int deadline) {
		this.deadline = deadline;
	}
	public int getProfit() {
		return profit;
	}
	public void setProfit(int profit) {
		this.profit = profit;
	}
	
	

}
