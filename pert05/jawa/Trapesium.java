public class Trapesium extends BangunDatar {

    private final double sisiAtas;
    private final double sisiBawah;
    private final double tinggi;
    private final double sisiKiri;
    private final double sisiKanan;

    public Trapesium(double sisiAtas, double sisiBawah, double tinggi, double sisiKiri, double sisiKanan) {
        super("Trapesium");
        // TODO 1: tolak sisi <= 0.
/*         if (sisiAtas <= 0 || sisiBawah <= 0 || tinggi <= 0 || sisiKiri <= 0 || sisiKanan <= 0) {
            throw new IllegalArgumentException("Sisi dan tinggi harus lebih besar dari 0");
        }*/
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.tinggi = tinggi;
        this.sisiKiri = sisiKiri;
        this.sisiKanan = sisiKanan;
    }

    // TODO 2: lengkapi luas() dan keliling().
    @Override
    public double luas() {
        return ((sisiAtas + sisiBawah) / 2) * tinggi;
    }

    @Override
    public double keliling() {
        // Asumsi trapesium sama kaki untuk menghitung keliling
        return sisiAtas + sisiBawah + sisiKiri + sisiKanan;
    }

    @Override 
    public String toString() { return getNama() + "(Atas=" + sisiAtas + ", Bawah=" + sisiBawah + "sisi Kiri=" + sisiKiri + "sisi Kanan=" + sisiKanan + ") luas=" + luas(); }

}
