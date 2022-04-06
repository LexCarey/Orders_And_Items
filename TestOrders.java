public class TestOrders {

    public static void main(String[] args) {

        Item item1 = new Item("mocha", 3.00);
        Item item2 = new Item("latte", 3.50);
        Item item3 = new Item("drip coffee", 4.50);
        Item item4 = new Item("capuccino", 6.00);

        Order order1 = new Order("Cindhuri");
        order1.addItems(item3);
        order1.addItems(item2);
        order1.setReady(true);

        Order order2 = new Order("Jimmy");
        order2.addItems(item1);
        order2.setReady(true);

        Order order3 = new Order("Noah");
        order3.addItems(item4);

        Order order4 = new Order("Sam");
        order4.addItems(item2);
        order4.addItems(item2);
        order4.addItems(item3);

        Order order5 = new Order();
        order5.addItems(item2);
        order5.addItems(item4);
        order5.addItems(item1);

        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    }
}
