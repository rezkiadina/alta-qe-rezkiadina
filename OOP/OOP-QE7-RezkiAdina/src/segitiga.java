public class segitiga{
    private double  alas, tinggi;
    public double luas, keliling;

    public void setData (double a, double t){
        this.alas = a;
        this.tinggi = t;
    }
    public void setLuas(){

        this.luas = 0.5*this.alas*this.tinggi;
    }
    public double getLuas(){

        return this.luas;
    }
    public void setKeliling(){
        double sisi2 = (this.alas*this.alas) + (this.tinggi*this.tinggi);
        double sisi = Math.sqrt(sisi2);
        this.keliling = this.alas+this.tinggi+sisi;
    }
    public double getKeliling(){

        return this.keliling;
    }
}
