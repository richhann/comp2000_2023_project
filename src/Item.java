public class Item implements ItemInterface {
    private String name;
    private String description;
    private double value;
    private Integer expiration; 

    public Item(String name, String description, double value, Integer expiration) {
        this.name = name;
        this.description = description;
        this.value = value;
        this.expiration = expiration;
    }

    @Override
    public InventoryTableRow getInventoryTableRow() {
        return new InventoryTableRow(name, description, String.valueOf(value), expiration == null ? "" : String.valueOf(expiration));
    }

    @Override
    public CartTableRow getCartRow(String column3) {
        return new CartTableRow(name, description, column3);
    }

}
