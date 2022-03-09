package entitie;

public class Product implements Comparable<Product>{
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.price = price;
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s,%.2f", getName(), getPrice());
    }


    @Override
    public int compareTo(Product o) {
        return price.compareTo(o.getPrice());
    }
}
