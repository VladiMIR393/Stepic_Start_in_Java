import java.util.Scanner;
class Step3_5__6 {
    public static void main(String[] args){
        Scanner NumOfMonth = new Scanner(System.in);
        int mnth = NumOfMonth.nextInt();
        switch (mnth){
            case 2:
            case 12:
            case 1 :
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5 :
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8 :
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11 :
                System.out.println("Осень");
                break;
            default: System.out.println("error");
        }
    }
}
