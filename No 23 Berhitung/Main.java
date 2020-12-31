import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int nilai = input.nextInt();
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while ( i <= nilai );
    }
}