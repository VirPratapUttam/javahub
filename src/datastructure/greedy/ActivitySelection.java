package datastructure.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ActivitySortByEndTime implements Comparator<Activity> {

	@Override
	public int compare(Activity a1, Activity a2) {
		return a1.getEndTime() > a2.getEndTime() ? 1 : 0;
	}

}

public class ActivitySelection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Activity a1 = new Activity(10, 20);
		Activity a2 = new Activity(5, 22);
		Activity a3 = new Activity(20, 30);
		List<Activity> activityList = new ArrayList<Activity>();
		activityList.add(a1);
		activityList.add(a2);
		activityList.add(a3);
		selectActivity(activityList);
		
		int s[] =  {1, 3, 0, 5, 8, 5};
	    int f[] =  {6, 5, 8, 7, 9, 9};
	    Arrays.sort(f);
	    for(int i:f)
	    	System.out.println(i);
	    int n = s.length;
	        
	    printMaxActivities(s, f, n);
	}
	
	public static void printMaxActivities(int s[], int f[], int n)
    {
    int i, j;
      
    System.out.print("Following activities are selected : ");
      
    i = 0;
    System.out.print(i+" ");
      
    for (j = 1; j < n; j++)
    {
         // If this activity has start time greater than or
         // equal to the finish time of previously selected
         // activity, then select it
         if (s[j] >= f[i])
         {
              System.out.print(j+" ");
              i = j;
          }
     }
    }

	/*
	 * 1) Sort the activities according to their finishing time 2) Select the
	 * first activity from the sorted array and print it. 3) Do following for
	 * remaining activities in the sorted array. …….a) If the start time of this
	 * activity is greater than or equal to the finish time of previously
	 * selected activity then select this activity and print it.
	 */
	private static void selectActivity(List<Activity> activities) {
		Collections.sort(activities, new ActivitySortByEndTime());
		System.out.println(activities.get(0).getStartTime() + "-----"
				+ activities.get(0).getEndTime());
		int size = activities.size();
		int j = 0;
		for (int i = 1; i < size; i++) {

			if (activities.get(i).getStartTime() >= activities.get(j)
					.getEndTime()) {
				System.out.println(activities.get(i).getStartTime() + "---"
						+ activities.get(i - 1).getEndTime());
				j=i;
			}

		}

	}

}
