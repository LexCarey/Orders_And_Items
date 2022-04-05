public class TestOrders {

    public static void main(String[] args) {

        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();

        item1.setName("mocha");
        item2.setName("latte");
        item3.setName("drip coffee");
        item4.setName("capuccino");

        item1.setPrice(3.00);
        item2.setPrice(3.50);
        item3.setPrice(4.50);
        item4.setPrice(6.00);

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        order1.setName("Cindhuri");
        order2.setName("Jimmy");
        order3.setName("Noah");
        order4.setName("Sam");

        order1.setItems(item3);
        order1.setTotal(item3.getPrice());

        order2.setItems(item1);
        order2.setTotal(item1.getPrice());

        order3.setItems(item4);
        order3.setTotal(item4.getPrice());

        order4.setItems(item2);
        order4.setTotal(item2.getPrice());

        order1.setReady(true);

        order4.setItems(item2);
        order4.setTotal(item2.getPrice());
        order4.setItems(item2);
        order4.setTotal(item2.getPrice());

        order2.setReady(true);

        order1.orderStatus();
        order2.orderStatus();
        order3.orderStatus();
        order4.orderStatus();
    }
}
