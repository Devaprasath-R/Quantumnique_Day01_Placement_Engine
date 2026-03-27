import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int lar=Integer.MIN_VALUE;
        int seclar=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>lar){
                seclar=lar;
                lar=arr[i];
            }
            else if(arr[i]>seclar&& arr[i]!=lar){
                seclar=arr[i];
            }
        }
        System.out.println(seclar);
    }
}