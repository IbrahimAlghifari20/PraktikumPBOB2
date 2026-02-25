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
        }else{
            if (absis > 0 && ordinat < 0) {
                return 4;
            }else{
                if (absis < 0 && ordinat < 0) {
                  return 3;  
                }else{
                    if (absis < 0 && ordinat > 0) {
                        return 2;
                    }else
                        return 0;
                }
            }
        }
    }

    // double getjarakpusat(){

    // }
}



