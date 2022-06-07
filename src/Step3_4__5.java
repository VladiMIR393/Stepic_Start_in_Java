import java.util.Scanner;

class Step3_4__5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            //System.out.println("Введите название команды:");
            String comanda = sc.nextLine();
            sc.close();
            switch (comanda) {
                case "System.out.println()":
                    System.out.println("Это команда вывода на печать");
                    break;
                case "if":
                    System.out.println("Это условный оператор");
                    break;
                case "else":
                    System.out.println("Это альтернативная конструкция условного оператора");
                    break;
                default:
                    System.out.println("Раздел в разработке");
            }
        }
    }

