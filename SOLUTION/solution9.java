import stores.*;
import java.util.*;
public class itemlist{
    public static void main(String[] args) {
        ArrayList<stock> items = new ArrayList<stock>();
        items.add(new stock(1, "Mango", 10, 20.0));
        items.add(new stock(2, "Apple", 20, 30.0));
        items.add(new stock(3, "Banana", 30, 40.0));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nCurrent Stock:");
            for (stock item : items) {
                System.out.println(item);
            }

            System.out.print("\nEnter the item no. to add stock, or 0 to exit:");
            int itemno = scanner.nextInt();
            if (itemno == 0) {
                break;
            }

            stock item = items.stream().filter(i -> i.getItem_no() == item_no).findFirst().orElse(null);
            if (item == null) {
                System.out.println("Invalid item no.");
            } else {
                System.out.print("\nEnter the quantity to add:");
                int qty = scanner.nextInt();
                item.setStock_available(item.getStock_available() + qty);
                System.out.println("Stock added successfully.");
            }
        }
    }
}