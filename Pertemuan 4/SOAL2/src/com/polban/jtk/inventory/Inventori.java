package com.polban.jtk.inventory;

public class Inventori {
    Barang[] barangs;

    // Method untuk inisialisasi barang
    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }

    // Method untuk menampilkan barang
    void showBarang() {
        System.out.println(barangs[0].getNamaBarang() + "(" + barangs[0].getStok() + ")");
        System.out.println(barangs[1].getNamaBarang() + "(" + barangs[1].getStok() + ")");
    }

    // Method untuk pengadaan barang (hanya bisa menambah stok)
    void pengadaan() {
        initBarang();
        barangs[0].tambahStok(20);  // Penambahan stok dengan benar
        // barangs[0].stok -= 30; // Tidak bisa lagi karena stok diakses secara private
        // barangs[0].stok *= 30; // Tidak bisa lagi karena stok diakses secara private

        showBarang();
    }

    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();
    }
}
