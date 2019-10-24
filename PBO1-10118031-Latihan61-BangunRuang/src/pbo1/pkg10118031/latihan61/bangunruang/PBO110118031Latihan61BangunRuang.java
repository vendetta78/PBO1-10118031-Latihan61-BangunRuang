package pbo1.pkg10118031.latihan61.bangunruang;

/**
 *
 * @author Vendetta 
 * NAMA : RIZKI ARIA PUTRA 
 * KELAS : PBO1 
 * NIM : 10118031
 * Deskripsi Program : Program ini berisi program untuk menghitung volume bangun ruang.
 */
public class PBO110118031Latihan61BangunRuang {

    public static void main(String[] args) {

        Bola bola = new Bola();
        bola.setR(7);
        System.out.println("Hasil : V = " + Math.ceil(bola.HitungVolume()));

        Tabung tabung = new Tabung();
        tabung.setR(10);
        tabung.setT(21);
        System.out.println("Hasil V = " + Math.ceil(tabung.HitungVolume()));

        Kerucut kerucut = new Kerucut();
        kerucut.setR(14);
        kerucut.setT(9);
        System.out.println("Hasil : V = " + Math.ceil(kerucut.HitungVolume()));
    }

}
