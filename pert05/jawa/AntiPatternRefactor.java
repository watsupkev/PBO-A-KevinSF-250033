public class AntiPatternRefactor{
    interface bangun {
        double luas();
    }

    record LingkaranData(double r) implements bangun{
        @Override
        public double luas() {
            return Math.PI * (r * 2);
        }
    }
    record PersegiData(double sisi) implements bangun{
        @Override
        public double luas() {
            return sisi * sisi;
        }
    }
    record SegitigaData(double alas, double tinggi) implements bangun{
        @Override
        public double luas() {
            return 0.5 * alas * tinggi;
        }
    }
    public static void main(String[] args) {
        bangun[] daftar = {
            new LingkaranData(7),
            new PersegiData(5),
            new SegitigaData(4, 3)
        };

        double total=0;
        for (bangun b : daftar){
            total += b.luas();
        }
        System.out.printf("Total luas (cara polimorfik: %.2f%n", total);
    }
}