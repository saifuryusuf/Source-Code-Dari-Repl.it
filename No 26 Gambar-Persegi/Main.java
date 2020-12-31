import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int batas = input.nextInt();
     for(int i=0; i < batas; i++){
       for(int j=0; j< batas; j++){
            System.out.print("*");
        }
        System.out.println();
     }
  }
}