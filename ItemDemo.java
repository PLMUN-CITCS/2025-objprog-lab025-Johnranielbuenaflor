// Item class definition
class Item {
    // Static variable to keep track of the number of objects created
    static int objectCount = 0;

    // Instance variable for item name
    String itemName;

    // Constructor
    public Item(String itemName) {
        this.itemName = itemName;
        objectCount++; // Increment object count when a new object is created
    }

    // Instance method to display item name
    public void displayItem() {
        System.out.println("Item: " + itemName);
    }

    // Static method to display the total number of objects created
    public static void displayObjectCount() {
        System.out.println("Total objects created: " + objectCount);
    }
}

// Main class
public class ItemDemo {
    public static void main(String[] args) {
        // Creating three Item objects
        Item item1 = new Item("Laptop");
        Item item2 = new Item("Smartphone");
        Item item3 = new Item("Tablet");

        // Display item names
        item1.displayItem();
        item2.displayItem();
        item3.displayItem();

        // Display total number of objects created
        Item.displayObjectCount(); // Calling static method using class name
    }
}
