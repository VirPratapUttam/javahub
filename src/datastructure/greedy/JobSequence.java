package datastructure.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class JobComparator implements Comparator<Job>
{

	@Override
	public int compare(Job job1, Job job2) {
		return job1.getProfit()>job2.getProfit()?1:0;
	}
	
}

/*
 * 1) Sort all jobs in decreasing order of profit.
2) Initialize the result sequence as first job in sorted jobs.
3) Do following for remaining n-1 jobs
.......a) If the current job can fit in the current result sequence 
          without missing the deadline, add current job to the result.
          Else ignore the current job.
 */

public class JobSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Job> jobs=new ArrayList<Job>();
		jobs.add(new Job('a',4,20));
		jobs.add(new Job('b',1,10));
		jobs.add(new Job('c',1,40));
		jobs.add(new Job('d',1,30));
		Collections.sort(jobs, new JobComparator());
		jobSequence(jobs);

	}
	
	private static void jobSequence(List<Job> jobs)
	{
		int n=jobs.size();
		//List<Job> result=new ArrayList<Job>();
		int[] result=new int[n];
		boolean slot[]=new boolean[n];
		
		for (int i=0; i<n; i++)
	        slot[i] = false;
	 
		for (int i=0; i<n; i++)
	    {
			 for (int j=findMin(jobs.size(),jobs.get(i).getDeadline())-1; j>=0; j--)
		       {
		          // Free slot found
		          if (slot[j]==false)
		          {
		        	  result[j] = i;
		        	  //result.set(j, jobs.get(i));
		             slot[j] = true; // Make this slot occupied
		             break;
		          }
		       }
		}
		for (int i=0; i<n; i++)
		       if (slot[i])
		    	   System.out.println(result[i]);
		//print(result);
	}
	private static void print(int[] result)
	{
		for(int j:result)
		{
			System.out.println(j);
		}
	}
	private static int findMin(int a,int b)
	{
		return a>b?a:b;
	}

}
