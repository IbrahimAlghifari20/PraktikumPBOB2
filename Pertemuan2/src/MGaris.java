public class MGaris {
    public static void main(String[] args) {
        Titik2 T1 = new Titik2();
        T1.setAbsis(3);
        T1.setOrdinat(5);
        Titik2 T2 = new Titik2();
        T2.setAbsis(10);
        T2.setOrdinat(10);
        Garis G1 = new Garis(T1, T2);
        G1.getAwal().printTitik();
        G1.printGaris();

    }
}
