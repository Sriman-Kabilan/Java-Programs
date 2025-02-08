import java.util.*;
class SICalculator
{
    double principal;
    double time;
    double rate;
    
    double Calculate(){
        return (principal*time*rate)/100;
    }
    
    void display(){
        System.out.println("Principal: "+principal);
        System.out.println("Time(yrs): "+time);
        System.out.println("Rate: "+rate);
        System.out.println("Simple interest: "+Calculate());
    }
}
public class Main{
    public static void main(String[] args){
        int t=1;
        while(t==1){
            
            SICalculator s =new SICalculator();
            
            Scanner in=new Scanner(System.in);
            System.out.println("Enter the Principal:");
            s.principal=in.nextDouble();
            System.out.println("Enter the Time:");
            s.time=in.nextDouble();
            System.out.println("Enter the Rate:");
            s.rate=in.nextDouble();
            s.display();
            
            System.out.println("\n\nIf you want to continue:\nPress 1 continue\n     or\nPress 0 exit");
            t=in.nextInt();
        }
    }
}
