import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TUGAS3 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Input jumlah mata kuliah
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = Integer.parseInt(reader.readLine());

        // Input nilai dan sks tiap mata kuliah
        double totalNilai = 0;
        int totalSKS = 0;

        for (int i = 1; i <= jumlahMatkul; i++) {
            System.out.println("\nMata kuliah ke-" + i);

            System.out.print("Masukkan nilai: ");
            double nilai = Double.parseDouble(reader.readLine());

            System.out.print("Masukkan jumlah SKS: ");
            int sks = Integer.parseInt(reader.readLine());

            totalNilai += nilai * sks;
            totalSKS += sks;
        }

        // Hitung IPS
        double ips = totalNilai / totalSKS;

        // Tampilkan hasil IPS
        System.out.println("\nIndeks Prestasi Semester (IPS) Anda: " + ips);

        // Tentukan SKS maksimal
        int sksMaksimal;

        if (ips >= 3.5) {
            sksMaksimal = 24;
        } else if (ips >= 3.0) {
            sksMaksimal = 21;
        } else if (ips >= 2.5) {
            sksMaksimal = 18;
        } else if (ips >= 2.0) {
            sksMaksimal = 15;
        } else {
            sksMaksimal = 12;
        }

        // Tampilkan hasil SKS maksimal
        System.out.println("Jumlah SKS maksimal yang dapat diambil pada semester depan: " + sksMaksimal);
    }
}
