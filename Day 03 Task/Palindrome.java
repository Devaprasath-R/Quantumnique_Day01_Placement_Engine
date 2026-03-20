import java.util.Scanner;
public class palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int reverse = 0;
        int temp=n;
        while(n!= 0){
            int x = n % 10;
            reverse = reverse * 10+x;
            n = n/10;
        }
        if(reverse == temp){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}