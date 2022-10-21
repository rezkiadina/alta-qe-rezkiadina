public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        segitiga sg = new segitiga();
        sg.setData(3.0 , 4.0);
        sg.setLuas();
        double luas = sg.getLuas();
        System.out.println("Luas segitiga = "+luas);
        sg.setKeliling();
        double keliling = sg.getKeliling();
        System.out.println("Keliling segitiga = "+keliling);

        persegi pr = new persegi();
        pr.getData(4);
        pr.setLuas();
        int luaspersegi = pr.getLuas();
        System.out.println("Luas persegi = "+ luaspersegi);
        pr.setKeliling();
        int kelilingpersgi = pr.getKeliling();
        System.out.println("Keliling persegi = "+ kelilingpersgi);

        PPanjang pp = new PPanjang();
        pp.setData(7,8);
        pp.setLuas();
        pp.setKeliling();
        int luasPPanjang = pp.getLuas();
        System.out.println("Luas persegi panjang = "+luasPPanjang);
        int kelilingPPanjang = pp.getKeliling();
        System.out.println("Keliling persegi panjang = "+kelilingPPanjang);

    }
}