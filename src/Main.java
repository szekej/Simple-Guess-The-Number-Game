import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nWitaj graczu w\nGuess The Number Game!\nWybierz dolny zakres: ");
        Scanner scanner = new Scanner(System.in);
        int lowerRange = scanner.nextInt();
        //System.out.println(lowerRange);
        System.out.println("Wybierz gorny zakres:");
        int upperRange = scanner.nextInt();
        //System.out.println(upperRange);
        if(lowerRange>upperRange){
            System.out.println("Dolny zakres nie moze byc wiekszy od gornego!");
        } else if (lowerRange==upperRange) {
            System.out.println("Zakresy nie moga byc takie same!");
        }else{
            Number number = new Number();
            number.generateNumber(upperRange,lowerRange);
        }

    }
}