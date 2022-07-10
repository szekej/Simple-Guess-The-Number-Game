import java.util.Random;
import java.util.Scanner;

public class Number {
    public void generateNumber(int upperRange, int lowerRange){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(upperRange-lowerRange+1) + lowerRange;
        int i =0,j=3;
        do {
            System.out.println("----------------------------------");
            System.out.println("Masz "+j+" zycia\nWybierz liczbe: ");
            //System.out.println(randomNumber);
            i++;
            j--;
            int chosenNumber = scanner.nextInt();
            if(chosenNumber>randomNumber){
                System.out.println("Twoja liczba jest za duza");
            } else if (chosenNumber<randomNumber) {
                System.out.println("Twoja liczba jest za mala");
            } else {
                System.out.println("Gratulacje uzytkowniku!\nYOU WIN!");
                return;
            }
        }while (i-2<j);
        System.out.println("YOU LOSE!\nPoszukiwana liczba to "+randomNumber);
    }
}
