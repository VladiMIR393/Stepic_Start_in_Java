import java.util.Scanner;

class Step3_5__2 {
    public static void main(String[] args){
        Scanner chislo = new Scanner(System.in);
        int a = chislo.nextInt();
        /*if (a >= 100 & a < 1000){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }*/
        System.out.println((a >=100 & a < 1000)? "YES" : "NO");
        chislo.close();
    }
}
