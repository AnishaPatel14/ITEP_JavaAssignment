import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a numeber between 1 to 7");
        int n = sc.nextInt();
        if(n==1) System.out.print("Monday");
        else if(n==2) System.out.print("Tuesday");
        else if(n==3) System.out.print("Wednesday");
        else if(n==4) System.out.print("Thrusday");
        else if(n==5) System.out.print("Friday");
        else if(n==6) System.out.print("Saturday");
        else if(n==7) System.out.print("Sunday!");
        else System.out.print("Wrong number");
    }
}