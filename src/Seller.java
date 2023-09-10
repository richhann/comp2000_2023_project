import java.util.Optional;

public class Seller extends Trader{
    
    public Seller(String storeName, Inventory startingInventory) {
        super(storeName, startingInventory);
    }

    /**
     * Purchases an item. As the Seller does not have a money attribute,
     * the item will always be "bought".
     */
    public void buy(ItemInterface item) {
        super.addItem(item);
    }

    /**
     * Attempt to sell an item by name. If an item with a matching name is
     * found, the item is removed and returned.
     * @param itemName
     * @return The sold item.
     */
    @Override
    public Optional<ItemInterface> sell(String itemName) {
        return super.removeItem(itemName);
    }

}
