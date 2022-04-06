import java.util.ArrayList;

public class Order {
    
    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();


    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }

    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }


    public void display(){
        System.out.println("\nCustomer's name: " + this.getName());
        for(int i=0; i<this.getItems().size(); i++) {
            System.out.println(this.getItems().get(i).getName() + " - $" + this.getItems().get(i).getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
        System.out.println(this.getStatusMessage());
    }

    public String getStatusMessage() {
        if(this.ready){
            return "Your order is ready.";
        } else{
            return "Thank you for waitng, Your order will be ready soon.";
        }
    }

    public double getOrderTotal() {
        double temp = 0.0;
        for(int i=0; i<this.getItems().size(); i++) {
            temp += this.getItems().get(i).getPrice();
        }
        return temp;
    }

    public void addItems(Item items){
        this.items.add(items);
        this.total += items.getPrice();
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
        this.total = total;
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
    public void setItems(ArrayList<Item> items){
        this.items = items;
    }

    public ArrayList<Item> getItems(){
        return this.items;
    }
}
