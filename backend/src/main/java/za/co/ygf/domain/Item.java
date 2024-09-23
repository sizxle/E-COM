package za.co.ygf.domain;

public class Item {

    private String itemNum;

    private String itemName;

    private String itemDesc;

    private String img;

    private String price;

    public Item() {
    }

    public Item(String itemNum, String itemName, String itemDesc, String img, String price) {
        this.itemNum = itemNum;
        this.itemName = itemName;
        this.itemDesc = itemDesc;
        this.img = img;
        this.price = price;
    }
}
