public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        penjumlahan h1 = new penjumlahan();
        h1.setData(3, 4);
        h1.setPenjumlahan();
        int hasilPenjumlahan = h1.getPenjumlahan();
        System.out.println("Hasil Penjumlahan = "+hasilPenjumlahan);

        pengurangan h2 = new pengurangan();
        h2.setData(15, 4);
        h2.setPengurangan();
        int hasilPengurangan = h2.getPengurangan();
        System.out.println("Hasil pengurangan = "+hasilPengurangan);

        perkalian h3 = new perkalian();
        h3.setData(10,10);
        h3.setPerkalian();
        int hasilPerkalian = h3.getPerkalian();
        System.out.println("Hasil perkalian = "+hasilPerkalian);

        pembagian h4 = new pembagian();
        h4.setData(12,3);
        h4.setPembagian();
        double hasilPembagian = h4.getPembagian();
        System.out.println("Hasil Pembagian = "+hasilPembagian);
    }
}