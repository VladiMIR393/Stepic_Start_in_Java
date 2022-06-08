import java.util.Scanner;
class Step3_5__9 {
    public static void main(String[] args){
        Scanner slovo = new Scanner(System.in);
        String word = slovo.nextLine();
        switch (word.length()){
            case 0:
                System.out.println("Нет букв");
                break;
            case 1:
                System.out.println("Одна буква");
                break;
            case 2:
                System.out.println("Две буквы");
                break;
            case 3:
                System.out.println("Три буквы");
                break;
            case 4:
                System.out.println("Четыре буквы");
                break;
            case 5:
                System.out.println("Длинное слово");
                break;
            case 6:
            default:
                System.out.println("Длинное слово");
        }
        slovo.close();
    }
}
