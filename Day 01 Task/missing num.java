import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
     int t=n+1;
     int max=t*(t+1)/2;
     int sum=0;
     for(int i=0;i<n;i++){
        sum+=arr[i];
    }
      int result = max-sum;
      System.out.println(res);
    }
}