import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int lar=arr[0];
        int seclar=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lar){
                seclar=lar;
                lar=arr[i];
            }
            else if(arr[i]>seclar && arr[i]!=lar){
                seclar=arr[i];
            }
        }
        System.out.println(seclar);
    }
}