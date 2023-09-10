import java.util.ArrayList;
import java.util.Optional;

public class Player extends Trader{

    private double money;
    private Basket shoppingBasket;
    private Inventory viewOfStoreInventory;

    public Player(String playerName, double startingMoney, Inventory startingInventory) {
        super(playerName, startingInventory);
        this.money = startingMoney;
        this.shoppingBasket = new Basket();
    }

    /**
     * Attempts to perform a purchase of the parameter item.
     * If the player has enough money for the item, their money is reduced,
     * and the item is purchased. Otherwise, no changes are made.
     * @param item
     */
    @Override
    public void buy(ItemInterface item) {
        double itemValue = Double.valueOf(item.getInventoryTableRow().getColumnThree().trim()); //MAGIC NUMBER fix ?
        if (itemValue <= money) {
            super.addItem(item);
            money -= itemValue;
        }
    }

    /**
     * Attempt to sell an item by name. If an item with a matching name is
     * found, the players money is increased by the value of the item, and
     * the item is removed and returned.
     * @param itemName
     */
    @Override
    public Optional<ItemInterface> sell(String itemName) {
        Optional<ItemInterface> soldItem = super.removeItem(itemName);
        if (soldItem.isPresent()) {
            money += Double.valueOf(soldItem.get().getInventoryTableRow().getColumnThree().trim());
        }
        return soldItem;
    }
    

    /**
     * Adds an item to the held Inventory.
     * @param item
     */
    public void addItem(ItemInterface item) {
        inventory.addOne(item);
    }

    /**
     * Removes and returns an item from the held Inventory that matches
     * the `itemName` parameter.
     * @param itemName
     */
    public Optional<ItemInterface> removeItem(String itemName) {
        return inventory.removeOne(itemName);
    }

    public Inventory getInventory() {
        return inventory;
    }

    public String getName() {
        return name;
    }

    public Basket getShoppingBasket() {
        return shoppingBasket;
    }

    public void addToShoppingBasket(ItemInterface itemDataRow) {
        shoppingBasket.add(itemDataRow);
    }

    public void removeFromShoppingBasket(String itemName) {
        shoppingBasket.remove(itemName);
    }

    public ArrayList<ItemInterface> getStoreInventoryView() {
        return viewOfStoreInventory.getStock();
    }

    public Inventory getStoreView() {
        return viewOfStoreInventory;
    }

    public void setStoreView(Inventory storeInventory) {
        viewOfStoreInventory = storeInventory;
    }

    public double getMoney() {
        return money;
    }
    
}
