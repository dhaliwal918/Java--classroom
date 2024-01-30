import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome in program of Armstrong number or Not");
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        boolean AnOrNot = AON(num);
        System.out.println("The number is Armstrong - " + AnOrNot);
    }

    public static boolean AON(int num) {
        int com = num;
        int Nod = NOD(num);
        int ans = 0;
        for (int i = 1; i <= Nod; i++) {
            ans = ans + pow(num % 10,Nod);
            num = (int) num / 10;

        }
        if(ans==com){
            return true;
        }else{
            return false;
        }
    }

    public static int pow(int num, int power) {
        int ans = 1;
        for (int i = 1; i <= power; i++) {
            ans *= num;
        }
        return ans;
    }

    public static int NOD(int num) {
        int sum = 0;
        int Nod = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = (int) num / 10;
            Nod++;
        }
        return Nod;
    }
}
