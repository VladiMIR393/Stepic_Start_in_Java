import java.util.Scanner;

class Step3_5__8 {
    public static void main(String[] args) {
        Scanner fraza = new Scanner(System.in);
        String fr = fraza.nextLine();
        String a = "Джефф Безос";
        String b = "Илон Маск";
        String c = "Марк Цукерберг";
        String d = "Билл Гейтс";
        System.out.println((fr.contains(a) || fr.contains(b) ||fr.contains(c) || fr.contains(d))? "Добро пожаловать!" : "Здесь никого нет, Вы ошиблись дверью");
        fraza.close();
    }
}
