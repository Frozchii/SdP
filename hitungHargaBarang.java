import java.util.Scanner;

public class hitungHargaBarang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double hargaBarang, hargaAkhir;

        System.out.println("Masukan Harga Barang");
        hargaBarang = input.nextDouble();

        hargaAkhir = hargaBarang - (hargaBarang * 25/100);

        System.out.println("harga Asli barang : " + hargaBarang );
        System.out.println("harga Akhir barang setelah diskon : " + hargaAkhir);
        

        
    }
}
