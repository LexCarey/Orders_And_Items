import java.util.ArrayList;

public class Item {
    
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // NAME GET/SET
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    // PRICE GET/SET
    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }
}
