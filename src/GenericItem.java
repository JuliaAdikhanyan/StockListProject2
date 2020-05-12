public class GenericItem implements Cloneable {
    private static int currentID; // поле, хранящее максимальный назначенный ID товара в текущей сессии
    protected int id; // ID товара
    protected String name; // наименование товара
    protected float price; // цена товара
    protected GenericItem analog; // аналог товара по id
    protected Category category = Category.GENERAL; // категория товара // GENERAL - по умолчанию

    public GenericItem() {
        GenericItem.currentID++;
        this.id = currentID;
    }

    public GenericItem(String name, float price, GenericItem analog, Category category) {
        this.id = currentID++;
        this.name = name;
        this.price = price;
        this.analog = analog;
        this.category = category;
    }

    // конструктор №2
    public GenericItem(String tempName, float tempPrice) {

        this(tempName, tempPrice, null, Category.GENERAL);
    }

    // конструктор №3
    public GenericItem(String tempName, float tempPrice, GenericItem tempAnalog) {
        this(tempName, tempPrice, tempAnalog, Category.GENERAL);
    }

    // конструктор №4
    public GenericItem(String tempName, float tempPrice, Category tempCategory) {
        this(tempName, tempPrice, null, tempCategory);
    }

    public int getId() {
        return id;
    }

    public GenericItem getAnalog() {
        return analog;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }
}
