import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    System.out.println("Enter the Number :");
	    int n = sc.nextInt();
	    System.out.println("Enter the choice:\n1.Natural Number\n2.Reverse Natural Number\n3.Sum Natural Number");
	    int c = sc.nextInt();
	    int sum=0;
	    if(c==1){
	        for(int i=1;i<=n;i++){
	            System.out.printf(i+" ");
	        }
	        
	    }
	    else if(c==2){
	        for(int i=n;i>=1;i--){
	            System.out.printf(i+" ");
	        }
	    }
	    else if(c==3){
	        for(int i=1;i<=n;i++){
	            sum+=i;
	            
	        }
	        System.out.print("Sum Natural Number:"+sum);
	    }
	} 

}
