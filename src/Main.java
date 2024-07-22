import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2, ebob=0, ekok=0, smallNum;

        System.out.print("n1 sayısını giriniz: ");
        n1 = input.nextInt();

        System.out.print("n2 sayısını giriniz: ");
        n2 = input.nextInt();

        //küçük sayı hesaplama
        if (n1 < n2){
            smallNum = n1;
        } else {
            smallNum = n2;
        }

        //ebob hesaplama
        for (int i = smallNum; i >=1; i--){
            if(n1 % i == 0 && n2 % i == 0){
                ebob = i;
                break;
            }
        }

        //ekok hesaplama
        ekok = (n1 * n2) / ebob;

        System.out.println("Küçük sayı: " + smallNum);
        System.out.println("ebob: " + ebob);
        System.out.println("ekok: " + ekok);

    }
}