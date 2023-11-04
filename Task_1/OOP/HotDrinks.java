package OOP;

public class HotDrinks extends Product {
    private Integer temp;

    public HotDrinks(String name, Integer price, Integer volume, Integer temp) {
        super(name, price, volume);
        this.temp = temp;
    }

    public Integer getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return super.toString() + "Температура напитка = " + temp;
    }
}
