
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner f = new Scanner(System.in);
    int jumlah = 0;
    
    int[]A= new int[10];
    for(int i = 0; i < A.length; i++) {
      try{
      A[i]=f.nextInt();
      if (A[i]%2!=0){
        
        jumlah++;
      }
  
      }catch(Exception exception) {
        
      }
    }
    System.out.print("");
    System.out.print(""+jumlah);
  }
}