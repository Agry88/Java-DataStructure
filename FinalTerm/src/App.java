// 在一系列的商品中，使用MergeSort排序對商品按照價格进行排序

public class App {
    public static void main(String[] args) throws Exception {
        Product[] products = initData();
        mergeSort(products, 0, products.length - 1);
        for (Product product : products) {
            System.out.println(product);
        }
    };

    public static void mergeSort(Product[] products, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(products, left, mid);
        mergeSort(products, mid + 1, right);
        merge(products, left, mid, right);
    }

    public static void merge(Product[] products, int left, int mid, int right) {
        Product[] temp = new Product[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= right) {
            if (products[i].price <= products[j].price) {
                temp[k++] = products[i++];
            } else {
                temp[k++] = products[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = products[i++];
        }
        while (j <= right) {
            temp[k++] = products[j++];
        }
        for (int p = 0; p < temp.length; p++) {
            products[left + p] = temp[p];
        }
    }
    
    public static Product[] initData() {
        Product[] products = new Product[30];
        products[0] = new Product(1, "iPhone 12", 1000000, "iPhone 12 128GB");
        products[1] = new Product(2, "iPhone 12 Pro", 1200000, "iPhone 12 Pro 128GB");
        products[2] = new Product(3, "iPhone 12 Pro Max", 1400000, "iPhone 12 Pro Max 128GB");
        products[3] = new Product(4, "iPhone 12 Mini", 900000, "iPhone 12 Mini 128GB");
        products[4] = new Product(5, "iPhone 11", 700000, "iPhone 11 128GB");
        products[5] = new Product(6, "iPhone 11 Pro", 800000, "iPhone 11 Pro 128GB");
        products[6] = new Product(7, "iPhone 11 Pro Max", 900000, "iPhone 11 Pro Max 128GB");
        products[7] = new Product(8, "iPhone XS", 600000, "iPhone XS 64GB");
        products[8] = new Product(9, "iPhone XS Max", 700000, "iPhone XS Max 64GB");
        products[9] = new Product(10, "iPhone XR", 500000, "iPhone XR 64GB");
        products[10] = new Product(11, "iPhone X", 500000, "iPhone X 64GB");
        products[11] = new Product(12, "iPhone 8", 400000, "iPhone 8 64GB");
        products[12] = new Product(13, "iPhone 8 Plus", 500000, "iPhone 8 Plus 64GB");
        products[13] = new Product(14, "iPhone 7", 300000, "iPhone 7 32GB");
        products[14] = new Product(15, "iPhone 7 Plus", 400000, "iPhone 7 Plus 32GB");
        products[15] = new Product(16, "iPhone 6s", 200000, "iPhone 6s 32GB");
        products[16] = new Product(17, "iPhone 6s Plus", 300000, "iPhone 6s Plus 32GB");
        products[17] = new Product(18, "iPhone SE", 200000, "iPhone SE 32GB");
        products[18] = new Product(19, "iPhone 5s", 100000, "iPhone 5s 16GB");
        products[19] = new Product(20, "iPhone 5c", 100000, "iPhone 5c 16GB");
        products[20] = new Product(21, "iPhone 5", 100000, "iPhone 5 16GB");
        products[21] = new Product(22, "iPhone 4s", 100000, "iPhone 4s 16GB");
        products[22] = new Product(23, "iPhone 4", 100000, "iPhone 4 16GB");
        products[23] = new Product(24, "iPhone 3GS", 100000, "iPhone 3GS 16GB");
        products[24] = new Product(25, "iPhone 3G", 100000, "iPhone 3G 16GB");
        products[25] = new Product(26, "iPhone 3", 100000, "iPhone 3 16GB");
        products[26] = new Product(27, "iPhone 2G", 100000, "iPhone 2G 16GB");
        products[27] = new Product(28, "iPhone 1G", 100000, "iPhone 1G 16GB");
        products[28] = new Product(29, "iPhone 12", 1000000, "iPhone 12 128GB");
        products[29] = new Product(30, "iPhone 12 Pro", 1200000, "iPhone 12 Pro 128GB");
        return products;
    }

};

class Product {
    int id;
    String name;
    int price;
    String description;

    public Product(int id, String name, int price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
}

