import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        int res=-1;
        for(int num:arr){
            if(set.contains(num)){
                res=num;
                break;
            }
            set.add(num);
        }
        System.out.println(res);
    }
}