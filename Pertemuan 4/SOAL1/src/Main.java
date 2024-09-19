import com.polban.jtk.sales.Product;
import com.polban.jtk.sales.Sales;

public class Main {
    public static void main(String[] args) {
            // Buat object Product dan object Sales(quantity produk 10)
        Product product = new Product("Contoh Produk", 100.00, 10);
        Sales sales = new Sales(product);
            // Lakukan penjualan produk (quantity 5), restock produk dan memperbarui harga produk
        sales.sellProduct(5);
        sales.restockProduct(20);
        sales.updateProductPrice(150.00);
            // memperbaharui harga produk dengan nilai negative
        sales.updateProductPrice(-50.00);
            // memodifikasi metode updateProductPrice dengan String.format
    }
}