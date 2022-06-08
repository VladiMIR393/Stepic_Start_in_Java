import java.util.Scanner;
class Step3_5_5 {
    public static void main(String[] args){
        Scanner NumForCompare = new Scanner(System.in);
        int a = NumForCompare.nextInt();
        int b = NumForCompare.nextInt();
        if(a == b){
            System.out.println("=");
        }else{
            System.out.println((a > b)? ">" : "<");
        }
        NumForCompare.close();
    }
}
