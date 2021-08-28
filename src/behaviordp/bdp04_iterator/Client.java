package behaviordp.bdp04_iterator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu menu = new Menu();
        menu.addItem(new Item("Home", "/home"));
        menu.addItem(new Item("Java", "/java"));
        menu.addItem(new Item("Spring Boot", "/spring-boot"));
 
        ItemIterator<Item> iterator = menu.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            System.out.println(item);
        }
	}

}
