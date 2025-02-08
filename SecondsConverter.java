import java.util.*;
import java.io.*;
public class SecondsConverter
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Seconds Converter>>>");
	    System.out.print("Enter the Seconds: ");
		int totaltime= sc.nextInt();
		System.out.println();
		int hour =(totaltime/3600);
		int min =(totaltime % 3600) / 60;
		int sec =(totaltime%60);
		System.out.println("Time Format: "+hour+" hrs: "+min+" min: "+sec+" sec");
	}
}
