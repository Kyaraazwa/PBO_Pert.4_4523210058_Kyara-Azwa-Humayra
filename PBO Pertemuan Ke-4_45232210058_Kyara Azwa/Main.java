public class Main {
    public static void main(String[] args) {
        // Membuat array dari Handphone
        Handphone[] daftarHandphone = new Handphone[2];

        // Mengisi array dengan objek Smartphone dan FeaturePhone
        daftarHandphone[0] = new Smartphone("Samsung", "Z Flip");
        daftarHandphone[1] = new FeaturePhone("Apple", "13 Pro max");

        // Menggunakan loop untuk memanggil metode secara polimorfik
        for (Handphone hp : daftarHandphone) {
            hp.nyalakan();
            hp.kirimPesan("08123456789", "Halo dari " + hp.merk + " " + hp.model);
            hp.matikan();
            System.out.println();
        }

        // Mengakses metode khusus dengan casting
        for (Handphone hp : daftarHandphone) {
            if (hp instanceof Smartphone) {
                ((Smartphone) hp).aksesInternet();
                ((Smartphone) hp).kirimPesan("kyaraaz@gmail.com", "dari yaya.",  "helloww, apa kabar?");
            } else if (hp instanceof FeaturePhone) {
                ((FeaturePhone) hp).mainGameSnake();
            }
        }
    }
}