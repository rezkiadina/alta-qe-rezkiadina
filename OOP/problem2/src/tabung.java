public class tabung {
    private double jejari;
    public double tinggi, volume;

    public void setData(double r, double t){
        this.jejari = r;
        this.tinggi = t;
    }
    public void setVolume(){
        this.volume = (22*this.jejari*this.jejari*this.tinggi)/7;
    }
    public double getVolume(){
        return this.volume;
    }
}
