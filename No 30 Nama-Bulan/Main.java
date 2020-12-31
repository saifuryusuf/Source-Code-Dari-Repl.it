import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] namaBulan = {
        "Januari",
        "Februari",
        "Maret",
        "April",
        "Mei",
        "Juni",
        "Juli",
        "Agustus",
        "September",
        "Oktober",
        "November",
        "Desember",
    };
    int urutan = input.nextInt();
    if (urutan > 0 && urutan < 13){
      System.out.print(namaBulan[urutan-1]);
  } else {
      System.out.print("Nomor tidak valid");
  }
}
}