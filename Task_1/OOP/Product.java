package OOP;

public class Product {
    private String name;
    private Integer price;
    private Integer volume;
    
    public Product(String name, Integer price, Integer volume) {
        this.name = name;
        this.price = price;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        if (price.compareTo(Integer.valueOf(0)) > 0) this.price = price;
        else System.out.println("Цена не может быть меньше или равна нулю!");
    }

    @Override
    public String toString() {
        return name + " объёмом " + volume + " мл стоит " + price + " руб. ";
    }
}
