public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        ongkir or = new ongkir();
        or.setOngkos(5,2,4,1);
        or.setHarga();
        int ongkoskirim = or.getHarga();
        System.out.println("Harga = "+ongkoskirim);
    }
}