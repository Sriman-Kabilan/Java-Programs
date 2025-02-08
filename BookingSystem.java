import java.util.*;
public class BookingSystem{
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of rows in the cinema: ");
        int rows = in.nextInt();

        System.out.print("Enter the number of seats per row: ");
        int cols = in.nextInt();

        char[][] seats = new char[rows][cols];
        boolean a=true;
        while (a){
            System.out.println("Enter your choice:\n1.Available seats\n2.Booking Ticket\n3.Display\n4.Exit Booking\n");
            int op=in.nextInt();
            switch(op){
                case 1:
                
                    for (int i=0;i<rows;i++){
                        for (int j=0;j<cols;j++){
                            seats[i][j]= 'A';
                        } 
                    }
                    for (int i=0;i<rows;i++){
                        for (int j=0;j<cols;j++){
                            System.out.printf(seats[i][j]+" ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                
                    System.out.println("Enter how many seats you want to Reserved:");
                    int res=in.nextInt();
                    for (int i=0;i<res;i++){
                        System.out.println("Enter the Row:"); 
                        int r=in.nextInt();
                        System.out.println("Enter the Column:"); 
                        int c= in.nextInt();
                        if (r<=rows&&c<=cols){
                            seats[r-1][c-1]='R';
                        } 
                        else{
                            System.out.println("You enter wrong seats..!!!"+r+" "+c+"\n");
                        }
                    }
                    break;
                
                case 3:
                
                    for (int i=0;i<rows;i++){
                        for (int j=0;j<cols;j++){
                            System.out.printf(seats[i][j]+"  ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                
                    System.out.println("Exicting the Booking..!!!");
                    a=false;
                    break;
                
            }
        }
        
    }
}
