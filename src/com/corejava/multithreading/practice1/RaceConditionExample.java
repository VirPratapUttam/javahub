package com.corejava.multithreading.practice1;

class TicketBooking implements Runnable {
	int ticketAvailable = 1;

	public void run() {
		synchronized (this) {
			System.out.println("Waiting for book ticket for " + Thread.currentThread().getName());
			if (ticketAvailable > 0) {
				System.out.println("Booking Ticket for " + Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				ticketAvailable--;
				System.out.println("Ticket Booked for " + Thread.currentThread().getName());
				System.out.println("Available Ticket " + ticketAvailable);
			} else {
				System.out.println("Ticket not booked for " + Thread.currentThread().getName());
			}
		}
	}
}

public class RaceConditionExample {

	public static void main(String[] args) {
		TicketBooking tb = new TicketBooking();
		Thread t1 = new Thread(tb, "Thread 1");
		Thread t2 = new Thread(tb, "Threaad 2");

		t1.start();
		t2.start();
	}

}
