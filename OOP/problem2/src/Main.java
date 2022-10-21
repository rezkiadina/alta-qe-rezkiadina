public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        kubus kb = new kubus();
        kb.setData(10);
        kb.setVolume();
        int volumekubus = kb.getVolume();
        System.out.println("Volume kubus = "+ volumekubus);

        balok bl = new balok();
        bl.setData(3, 6, 10);
        bl.setVolume();
        int volumebalok = bl.getVolume();
        System.out.println("Volume balok = "+ volumebalok);

        tabung tb = new tabung();
        tb.setData(7,10);
        tb.setVolume();
        double volumetabung = tb.getVolume();
        System.out.println("Volume tabung = "+volumetabung);
    }
}