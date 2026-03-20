import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String s1=s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int t=0;
        int r=s1.length()-1;
        boolean isPalin=true;
        while(t<r){
            if (s1.charAt(t)!=s1.charAt(r)) {
                isPalin=false;
                break;
            }
            t++;
            r--;
        }
        if(isPalin){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }
}