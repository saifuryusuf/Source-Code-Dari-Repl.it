import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] array = new int[input.nextInt()];
    
    for (int i = 0;i < array.length; i++) {
            array[i] = input.nextInt();
        }
    for (int i = array.length-1;i >= 0; i--){
      System.out.print(array[i]+" ");
    }
  }
}