import java.util.Scanner;

class Step3_3__5 {
    public static void main(String[] args) {
        Scanner pr = new Scanner(System.in);
        int a = pr.nextInt(), b = pr.nextInt(), c = pr.nextInt();
        if ((a > b) & (a % 2 == 0)){
            if (a < c & c % 2 == 0){
                System.out.println(c);
            } else {
                System.out.println(a);
            }

        } else if (b > c & b % 2 == 0){
            System.out.println(b);
        } else if (c % 2 == 0){
            System.out.println(c);
        }else if(b % 2 == 0){
            System.out.println(b);
        } else{
            System.out.println("Чётных чисел нет");
        }
        System.out.println("Я оказался в ГитХабе");
    }
}

