import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        int maxAttempts = 7;
        int attempts = 0;
        boolean correct = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("🎯Digite um valor de 1 a 100. Você tem 7 tentativas! ");

        while (attempts < maxAttempts && !correct)
        {
            System.out.printf("Tentativa %d: Digite um número: ", attempts + 1);
            int value = sc.nextInt();
            attempts++;

            if(value == randomNumber) {
                System.out.println("Parabéns! Você acertou em cheio ✅");
                correct = true;
            }
            else if (value < randomNumber) {
                System.out.println("🔼 Dica: o número é maior! ");
            }
            else {
                System.out.println("🔼 Dica: o número é menor! ");
            }
        }

            if (!correct) {
                System.out.println("❌ \n Suas tentativas acabaram! Tente na próxima 🦾");
                System.out.println("O número correto era: " + randomNumber);
            }


        sc.close();

    }
}
