import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //7) WAP to check whether entered number is prime or not.
        System.out.println("enter a numeber n : ");
        int n = sc.nextInt();
        int factor = 0;
        int i=1;
        while(i<=n){
            if(n%i==0) factor++;
            i++;
        } 
        if(factor == 2){
            System.out.println("Prime number");
        }else{
            System.out.println("Not Prime number");
        }
    }
}