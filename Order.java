import java.util.ArrayList;

public class Order {
    
    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    public void orderStatus(){
        System.out.println(this.getName() + "'s Order:");
            System.out.println(this.itemsToString(this.getItems()));
        System.out.println("$" + this.getTotal());
        System.out.println(this.getReady());
    }

    public String itemsToString(ArrayList<Item> items) {
        String allItems = "";
        for(int i=0; i<this.getItems().size(); i++) {
            allItems += this.getItems().get(i).getName();
            allItems += " ";
        }
        return allItems;
    }

    // NAME GET/SET
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    // TOTAL GET/SET
    public void setTotal(double total){
        this.total += total;
    }

    public double getTotal(){
        return this.total;
    }

    // READY GET/SET
    public void setReady(boolean ready){
        this.ready = ready;
    }

    public boolean getReady(){
        return this.ready;
    }

    // ITEM GET/SET
    public void setItems(Item items){
        this.items.add(items);
    }

    public ArrayList<Item> getItems(){
        return this.items;
    }
}
