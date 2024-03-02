public class Buku {
    private String penulis;
    private String judul;
    private double harga;
    private int nomorPenerbit;

    public Buku(String penulis, String judul, double harga, int nomorPenerbit) {
        this.penulis = penulis;
        this.judul = judul;
        this.harga = harga;
        this.nomorPenerbit = nomorPenerbit;
    }

    public double getHarga() {
        return harga;
    }

    public static void main(String[] args) {
        // Membuat beberapa objek buku
        Buku buku1 = new Buku("James Freeman Clarke", "Nineteenth Century Questions Sejarah Dunia Abad Ke-19", 100.0, 123);
        Buku buku2 = new Buku("Saut Pasaribu", "History Of The World War, Sejarah Perang Dunia", 75.5, 456);
        Buku buku3 = new Buku("Yanter Wilve Baly Woda, ST., M.Kom", "Buku Ajar", 90.25, 789);

        // Menghitung total harga semua buku yang dibeli
        double totalHarga = buku1.getHarga() + buku2.getHarga() + buku3.getHarga();

        // Menampilkan total harga
        System.out.println("Total harga semua buku yang dibeli: " + totalHarga);
    }
}