package Helsinki.moocifi;

public class ProductOOP {
    private String name;
    private double price;
    private int quantity;

    //constructor
    public ProductOOP(String initialName, double initailPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initailPrice;
        this.quantity = initialQuantity;

    }

    //Method to print product details
    public void printProduct() {
        System.out.println(name + ", price" + price + ", " + quantity + " pcs");
    }

    //Main method to test
    public static void main(String[] args) {
        ProductOOP bannana = new ProductOOP("Bannana",  2,21);
        bannana.printProduct();

        ProductOOP apple = new ProductOOP("Apple", 0.9, 25);
        apple.printProduct();
        

    }
}
