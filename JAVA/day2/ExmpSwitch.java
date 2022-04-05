package day2;

import java.util.Scanner;

public class ExmpSwitch {

	public static void main(String[] args) {
		System.out.println("START OF THE PROGRAM");
		System.out.println("ENTER A NUMBER");
		System.out.println("1.monday,2.tuesday,3.wednesday,4.thursday,5.friday");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b;
		switch(a)
		{
		case 1:System.out.println("please select your slot");
				System.out.println("1.10am,2.11am,3.12am");
				b=sc.nextInt();
				switch(b) {
				case 1:System.out.println("your appointment is booked for 10 am on monday");
						break;
				case 2:System.out.println("your appointment is booked for 11 am on monday");
						break;
				case 3:System.out.println("your appointment is booked for 12 am on monday");
						break;
				default:
						System.out.println("invalid output");
						break;
						
				}
				break;
		case 2:System.out.println("please select your slot");
				System.out.println("1.10am,2.11am,3.12am");
				b=sc.nextInt();
				switch(b) {
					case 1:System.out.println("your appointment is booked for 10 am on tuesday");
					break;
					case 2:System.out.println("your appointment is booked for 11 am on tuesday");
					break;
					case 3:System.out.println("your appointment is booked for 12 am on tuesday");
					break;
					default:
						System.out.println("invalid output");
						break;
				
					}
					break;
		case 3:System.out.println("please select your slot");
			System.out.println("1.10am,2.11am,3.12am");
			b=sc.nextInt();
			switch(b) {
				case 1:System.out.println("your appointment is booked for 10 am on wednesday");
					break;
				case 2:System.out.println("your appointment is booked for 11 am on wednesday");
					break;
				case 3:System.out.println("your appointment is booked for 12 am on wednesday");
					break;
				default:
					System.out.println("invalid output");
					break;
		
				}
			break;
			case 4:System.out.println("please select your slot");
				System.out.println("1.10am,2.11am,3.12am");
				b=sc.nextInt();
				switch(b) {
					case 1:System.out.println("your appointment is booked for 10 am on thursday");
						break;
					case 2:System.out.println("your appointment is booked for 11 am on thursday");
						break;
					case 3:System.out.println("your appointment is booked for 12 am on thursday");
						break;
					default:
						System.out.println("invalid output");
						break;
					}
					break;
			case 5:System.out.println("please select your slot");
				System.out.println("1.10am,2.11am,3.12am");
				b=sc.nextInt();
				switch(b) {
					case 1:System.out.println("your appointment is booked for 10 am on friday");
						break;
					case 2:System.out.println("your appointment is booked for 11 am on friday");
						break;
					case 3:System.out.println("your appointment is booked for 12 am on friday");
						break;
					default:
						System.out.println("invalid output");
						break;
						}
				break;
				
		}
		System.out.println("end of the program");
	}

}
