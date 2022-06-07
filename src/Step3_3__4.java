import java.util.Scanner;

class Step3_3__4 {
    public static void main(String[] args) {
        Scanner pr = new Scanner(System.in);
        int a1 = pr.nextInt(), b1 = pr.nextInt();
        int a2 = pr.nextInt(), b2 = pr.nextInt();

        // для двух случаев
        // 1) a1___b1  a2___b2
        // 2) a2___b2  a1___b1
        if ((a1 - b2) * (b1 - a2) > 0) {
            System.out.println("Пересечения нет");
        }
        // для двух случаев
        // 1) a2___b2/a1___b1
        // 2) a2/b2/a1___b1 - тривиальный, но пусть будет
        if ((a1>=a2) & (b2 == a1)){
            System.out.println(b2);
        }
        // для двух случаев
        // 1) a1___b1/a2___b2
        // 2) a1___b1/a2/b2 - тривиальный, но пусть будет
        if ((a1<a2) & (b1 == a2)){
            System.out.println(a2);
        }
        // для двух случаев
        // 1) a1/a2___b1___b2
        // 2) a1/a2___b1/b2
        if ((a1 == a2) & (b1 <= b2)){
            System.out.println(a1 + " " + b1);
        }
        // для двух случаев
        // 1) a1__a2__b1/b2
        // 2) a1__a2___b1____b2
        if (a1 > a2 & b1 <= b2){
            System.out.println(a1 + " " + b1);
        }
        //  для трех случаев
        // 1) a1___a2__b2___b1
        // 2) a1___a2_____b1/b2
        if (a1 < a2 & b1 > a2){
            if (b1>=b2){
                System.out.println(a2 + " " + b2);
            } else{
                //3) a1___a2_____b1___b2
                System.out.println(a2 + " " + b1);
            }
        }

        pr.close();
    }
}
