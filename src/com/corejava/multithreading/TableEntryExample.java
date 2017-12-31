package com.corejava.multithreading;
class Entry<T>
{
	private T key;
	private T value;
	private Entry next;
	private Entry after;
	private Entry before;
	public Entry(T key,T value,Entry next,Entry before,Entry after)
	{
		this.key=key;
		this.value=value;
		this.next=next;
		this.after=after;
		this.before=before;
		
	}
	public T getKey() {
		return key;
	}
	public void setKey(T key) {
		this.key = key;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public Entry getNext() {
		return next;
	}
	public void setNext(Entry next) {
		this.next = next;
	}
	public Entry getAfter() {
		return after;
	}
	public void setAfter(Entry after) {
		this.after = after;
	}
	public Entry getBefore() {
		return before;
	}
	public void setBefore(Entry before) {
		this.before = before;
	}
}
class MyRunnable1 implements Runnable
{

	@Override
	public void run() {
		Entry e1=new Entry(1,"Vir",null,null,null);
		Entry e2=new Entry(3,"Rphit",null,null,null);
		Entry e3=new Entry(2,"Twin",null,null,null);
		Entry e4=new Entry(4,"Mon",null,null,null);
		Entry e5=new Entry(5,"Laddu",null,null,null);
		Entry[] entryAr=new Entry[5];
		entryAr[0]=e1;
		entryAr[1]=e2;
		entryAr[2]=e3;
		entryAr[3]=e4;
		entryAr[4]=e5;
		synchronized (entryAr[2]) {
			for(int i=0;i<5;i++)
			{
				System.out.println("Running:- "+Thread.currentThread().getName());
				System.out.println(entryAr[i].getKey()+" "+entryAr[i].getValue());
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
	
}

public class TableEntryExample {

	public static void main(String[] args) {
		Entry e1=new Entry(1,"Vir",null,null,null);
		System.out.println(e1.getKey()+" "+e1.getValue());
		
		MyRunnable1 r1=new MyRunnable1();
		for(int i=0;i<5;i++)
		{
			Thread t=new Thread(r1,"Thread"+i);
			t.start();
		}
	}

}
