package praktikum3;

import java.util.Scanner;

public class InputOutputScanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nim, nama, jurusan, jenjang;
        int semester;
        System.out.println("############################################");
        System.out.println("Proses Input    : ");
        System.out.print("Masukan NIM       : ");
        nim = scan.nextLine();
        System.out.print("Masukan Nama      : ");
        nama = scan.nextLine();
        System.out.print("Masukan Jurusan   : ");
        jurusan = scan.nextLine();
        System.out.print("Masukan Jenjang   : ");
        jenjang = scan.nextLine();
        System.out.print("Masukan Semester  : ");
        semester = scan.nextInt();
        System.out.println("############################################");
        System.out.println("Hasil Inputan:");
        System.out.println("NIM         : " + nim);
        System.out.println("Nama        : " + nama);
        System.out.println("Jurusan     : " + jurusan);
        System.out.println("Jenjang     : " + jenjang);
        System.out.println("Semester    : " + semester);
        System.out.println("############################################");

    }

}
