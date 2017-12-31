package datastructure.greedy;

public class Activity {
	
	private int startTime;
	private int endTime;

	public Activity(int i, int j) {
		this.startTime=i;
		this.endTime=j;
	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}

}
