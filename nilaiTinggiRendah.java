import java.util.Scanner;

public class nilaiTinggiRendah {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int Lulus = 0, tidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >=60) {
                Lulus++;
            } else {
                tidakLulus++;
            }
            
    }
    System.out.println("Nilai tertinggi: " + tertinggi);
    System.out.println("Nilai terendah: " + terendah);
    System.out.println("Jumlah mahasiswa Lulus: " + Lulus);
    System.out.println("Jumlah mahasiswa tidak Lulus: " + tidakLulus);
}
}