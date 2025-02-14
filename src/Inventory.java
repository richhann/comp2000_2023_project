import java.util.ArrayList;
import java.util.Optional;

public class Inventory {
    protected ArrayList<ItemInterface> stock;

    public Inventory() {
        stock = new ArrayList<>();
    }

    public Inventory(ArrayList<ItemInterface> startingStock) {
        stock = startingStock;
    }

    /**
     * Create an Inventory that is a view of `copy`. The held "stock" of the resulting
     * Inventory will be references to the instances referred to by the `copy` constructor.
     * @param copy
     */
    public Inventory(Inventory copy) {
        stock = new ArrayList<>(copy.stock.size());
        for (ItemInterface item : copy.stock) {
            stock.add(item);
        }
    }

    public ArrayList<ItemInterface> getStock() {
        return stock;
    }

    /**
     * Adds an Item instance to the inventories stock.
     * Sort is called using the current/existing sort strategy.
     * @param item
     */
    public void addOne(ItemInterface item) {
        stock.add(item);
    }

    /**
     * Remove and return an item with a specified name.
     * @param itemName
     * @return An Item matching the `itemName`
     */
    public Optional<ItemInterface> removeOne(String itemName) {   
        int removeFromIdx = indexOfItemByName(itemName);
        if (removeFromIdx == -1) {
            return Optional.empty();
        }

       return Optional.ofNullable(stock.remove(removeFromIdx));
        //return stock.remove((int) removeFromIdx);
    }

    /**
     * Find the index of an item by name.
     * @param itemName
     */
    private int indexOfItemByName(String itemName) {
        for (int i = 0; i < stock.size(); i++) {
            ItemInterface cur = stock.get(i);
            
            if (cur.getInventoryTableRow().getColumnOne().equals(itemName)) {
                return i;
            }
        }
        return -1; //Optional<Integer>
    }

}
