import java.util.*;
public class SumOfDivisor
{
	public static void main(String[] args) {
	    int sum=0;
		Scanner in =new Scanner(System.in);
		System.out.println("Sum of the Divisor");
		System.out.println("Enter the Number:");
		int n =in.nextInt();
		for(int i=1;i<n;i++){
		    if(n%i == 0){
		        System.out.print(i+" ");
		        sum+=i;
		    }
		}
		System.out.println();
		if (sum == n){
		      System.out.println(sum+" = "+n+" Perfect Number");
		}
		else if(sum>n){
		      System.out.println(sum+" != "+n+" Abundant Number");
		 }
		 else{
		      System.out.println(sum+" != "+n+" Deficient Number");
		  }
	}
}
