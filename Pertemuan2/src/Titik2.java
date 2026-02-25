/*Nama File: Titik.Java
 *Deskripsi: berisi atribut dan method class Titik
 *Pembuat: Muhammad Ibrahim Alghifari
 *Tanggal: 19 Februari 2026 */

public class Titik2 {

    /* ATRIBUT */
    double absis;
    double ordinat;

    /* Method */
    Titik2(){
        absis = 0;
        ordinat = 0;
    }

    Titik2(double x, double y){
        this.absis = x;
        this.ordinat = y;
    }
    double getAbsis() {
        return absis;
    }
    double getordinat(){
        return ordinat;
    }
    
    void setAbsis(double x){
        absis = x;
    }

    void setOrdinat(double x){
        ordinat = x;
    }

    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    double getkuadran(){
        if (absis > 0 && ordinat >0) {
            return 1;
        }else if (absis > 0 && ordinat < 0) {
                return 4;
            }else if (absis < 0 && ordinat < 0) {
                  return 3;  
                }else if (absis < 0 && ordinat > 0) {
                        return 2;
                    }else
                        return 0;
                }

    double getjarakpusat(){
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    double getjarak(Titik2 T){
        return Math.sqrt(Math.pow(this.absis - T.getAbsis(), 2) + Math.pow(this.ordinat - T.getordinat(), 2));
    }
    
    void refleksiX(){
        ordinat = ordinat * -1;
    }

    void refleksiY(){
        absis = absis * -1;
    }

    Titik2 getrefleksiX(){
        Titik2 temp = new Titik2(this.absis, this.ordinat * -1); 
        return temp;
    }

    Titik2 getrefleksiY(){
        Titik2 temp = new Titik2(this.absis * -1, this.ordinat); 
        return temp;
    }
    }
        
    





