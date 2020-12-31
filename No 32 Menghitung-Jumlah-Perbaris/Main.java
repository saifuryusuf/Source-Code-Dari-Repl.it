import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] matriks = new int[5][5];
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < matriks.length; i++){
            for(int j = 0; j < matriks[i].length; j++){
                matriks[i][j] = scan.nextInt();
            }
        }
            System.out.println(matriks[0][0]+matriks[0][1]+matriks[0][2]+matriks[0][3]+matriks[0][4]);
            System.out.println(matriks[1][0]+matriks[1][1]+matriks[1][2]+matriks[1][3]+matriks[1][4]);
            System.out.println(matriks[2][0]+matriks[2][1]+matriks[2][2]+matriks[2][3]+matriks[2][4]);
            System.out.println(matriks[3][0]+matriks[3][1]+matriks[3][2]+matriks[3][3]+matriks[3][4]);
            System.out.println(matriks[4][0]+matriks[4][1]+matriks[4][2]+matriks[4][3]+matriks[4][4]);
    }
}