package day2;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floorAmount = scanner.nextInt();
        if(floorAmount <= 0){
            System.out.println("Ошибка ввода");
        } else if (floorAmount <= 4){
            System.out.println("Малоэтажный дом");
        } else if (floorAmount <= 8){
            System.out.println("Среднеэтажный дом");
        } else {
            System.out.println("Многоэтажный дом");
        }
    }
}
