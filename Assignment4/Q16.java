import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int i = -n; 
        while(i<=n){
            System.out.println(i);
            i=i+3;
        }
    }
}