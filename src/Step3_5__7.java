import java.util.Scanner;
import java.lang.Math;
class Step3_5__7 {
    public static void main(String[] args){
        Scanner coordinates = new Scanner(System.in);
        double x = coordinates.nextDouble();
        double y = coordinates.nextDouble();
        double res = 2 - x*x;

        if(x < 0){
            if( y <= res & y >= x){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }else if(y >= 0 & y <= res){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        coordinates.close();
    }
}
