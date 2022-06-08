import java.util.Scanner;
import java.math.MathContext;
class Step3_5__4 {
    public static void main(String[] args){
        Scanner chislo_zifra = new Scanner(System.in);
        int ch = chislo_zifra.nextInt();
        int zf = chislo_zifra.nextInt();
        ch = Math.abs(ch);
        if (ch < 99 || ch > 999 || zf < 0 ){
            System.out.println("error");
        }else{
            System.out.println((((ch % 100)/10) == zf)? "true" : "false");
        }
        chislo_zifra.close();
    }
}
