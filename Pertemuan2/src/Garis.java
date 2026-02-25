import java.lang.Math;
public class Garis {
    /* ATRIBUT */
    Titik2 awal;
    Titik2 akhir;
    static int counterGaris;

    /* Method */
    Garis(){
        awal = new Titik2();
        akhir = new Titik2();
        awal.absis = 0;
        awal.ordinat = 0;
        akhir.absis = 1;
        akhir.ordinat = 1;
        counterGaris++;
    }

    Garis(Titik2 awal, Titik2 akhir){
        this.awal = awal;
        this.akhir = akhir;
        counterGaris++;
    }

    Titik2 getAwal(){
        return awal;
    }

    Titik2 getAkhir(){
        return akhir;
    }

    void setAwal(Titik2 x){
        awal = x;
    }

    void setAkhir(Titik2 x){
        akhir = x;
    }
    
    static int getCounterGaris(){
        return counterGaris;
    }

    double Panjang(){
        return Math.sqrt(Math.pow((akhir.getAbsis() - awal.getAbsis()),2) + (Math.pow(akhir.getordinat() - awal.getordinat(), 2)));
    }

    double gradien(){
        return (akhir.getordinat() - awal.getordinat())/(akhir.getAbsis() - awal.getAbsis());
    }

    void Tengah(Titik2 mid){
        mid = new Titik2();
        mid.absis = (akhir.getAbsis() + awal.getAbsis())/2;
        mid.ordinat = (akhir.getordinat() + awal.getordinat())/2;
    }

    void printGaris(){

        System.out.println("(" + awal.getAbsis() + "," + awal.getkuadran() + ")" + "(" + akhir.getAbsis() + "," + akhir.getkuadran() +")");
    }
}
