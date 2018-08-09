import java.util.Scanner;

public class Main1000 {
    //a+b问题
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a=-1,b=11;
        int cnt = 0;
        while (s.hasNextInt()){
            if(cnt == 0){
                a = s.nextInt();
            }else {
                b = s.nextInt();
            }
            if(a>=0 || b <= 10){
                cnt++;
            }
            if(cnt==2){
                break;
            }
        }
        System.out.println(a+b);
    }
}
