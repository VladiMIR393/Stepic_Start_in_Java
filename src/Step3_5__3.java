import java.util.Scanner;

class Step3_5__3 {
    public static void main(String[] args){
        Scanner stroka = new Scanner(System.in);
        String S1 = stroka.nextLine();
        String s2 = stroka.nextLine();
        S1 = S1.toLowerCase();
        s2 = s2.toLowerCase();
        System.out.println((S1.contains(s2))? "true" : "false");
        stroka.close();
    }
}
