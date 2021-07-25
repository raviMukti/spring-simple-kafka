package springsimplekafka.consumer.model;

public class Product {
    private Long productId;
    private String productName;
    private String productSku;
    private String productBarcode;

    public Product() {
    }

    public Product(Long productId, String productName, String productSku, String productBarcode) {
        this.productId = productId;
        this.productName = productName;
        this.productSku = productSku;
        this.productBarcode = productBarcode;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductSku() {
        return productSku;
    }

    public void setProductSku(String productSku) {
        this.productSku = productSku;
    }

    public String getProductBarcode() {
        return productBarcode;
    }

    public void setProductBarcode(String productBarcode) {
        this.productBarcode = productBarcode;
    }
}
