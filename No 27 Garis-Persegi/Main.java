import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int luas = input.nextInt();
    
        for(int i=0;i<luas;i++){
            System.out.print("#");
          }
          System.out.println();
        for(int i=0;i<luas-2;i++){
            System.out.print("#");
        for(int j=0;j<luas-2;j++){
            System.out.print(" ");
            }
            System.out.println("#");
        }
        for (int i=0;i<luas;i++){
            System.out.print("#");
        }
        System.out.println();
     }
  }