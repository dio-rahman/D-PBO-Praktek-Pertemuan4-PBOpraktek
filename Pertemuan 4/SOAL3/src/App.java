import com.polban.jtk.sales.*;

public class App {
    public static void main(String[] args) {
        // 1. Buatlah object Product dengan quantity produk 10
        Product product = new Product("Contoh Produk", 100.00, 10);

        // 2. Buat package com.polban.jtk.sales dan simpan class-class ke dalam package tersebut
        // (File sudah berada di folder yang benar)

        // 3. Buatlah object Sales
        Sales sales = new Sales(product);

        // 4. Lakukan penjualan produk dengan quantity 5
        sales.sellProduct(5);

        // 5. Lakukan restock produk
        sales.restockProduct(20);

        // 6. Lakukan memperbaharui harga produk
        sales.updateProductPrice(150.00);

        // 7. Coba lakukan memperbaharui harga produk dengan nilai negative
        sales.updateProductPrice(-50.00);

        // 8. Modifikasi agar output harga baru dalam format string tidak menggunakan format ilmiah
        // (Sudah dimodifikasi dalam metode updateProductPrice dengan String.format)

        // java -cp ".;saleslib.jar" App

    }
}
