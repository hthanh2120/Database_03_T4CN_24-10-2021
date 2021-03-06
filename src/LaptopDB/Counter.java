package LaptopDB;

public class Counter {
    private String maker;
    private Integer quantity;

    public Counter() {
    }

    public Counter(String maker, Integer quantity) {
        this.maker = maker;
        this.quantity = quantity;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "\n Counter{" +
                "maker='" + maker + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
