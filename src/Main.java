import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Jenis Kelamin (P/L): ");
        String jenisKelaminInput = scanner.nextLine();
        char jenisKelamin;
        if (jenisKelaminInput.equalsIgnoreCase("P")) {
            jenisKelamin = 'P';
        } else if (jenisKelaminInput.equalsIgnoreCase("L")) {
            jenisKelamin = 'L';
        } else {
            System.out.println("Input jenis kelamin tidak valid");
            return;
        }
        System.out.print("Tanggal Lahir (yyyy-MM-dd): ");
        String tanggalLahirInput = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirInput, formatter);
        LocalDate sekarang = LocalDate.now();
        Period umur = Period.between(tanggalLahir, sekarang);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin == 'P' ? "Perempuan" : "Laki-laki"));
        System.out.println("Umur Anda: " + umur.getYears() + " tahun " + umur.getMonths() + " bulan " + umur.getDays() + " hari");
    }
}