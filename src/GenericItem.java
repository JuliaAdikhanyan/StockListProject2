public class GenericItem implements Cloneable {
    private static int currentID; // поле, хранящее максимальный назначенный ID товара в текущей сессии
    protected int id; // ID товара
    protected String name; // наименование товара
    protected float price; // цена товара
    protected GenericItem analog; // аналог товара по id
    protected Category category = Category.GENERAL; // категория товара // GENERAL - по умолчанию

    //конструктор №1
    public GenericItem() {
        id = currentID++;
    }

    // конструктор №2
    public GenericItem(String tempName, float tempPrice) {
        this();
        name = tempName;
        price = tempPrice;
    }

    // конструктор №3
    public GenericItem(String tempName, float tempPrice, GenericItem tempAnalog) {
        this(tempName, tempPrice);
        analog = tempAnalog;
    }

    // конструктор №4
    public GenericItem(String tempName, float tempPrice, Category tempCategory) {
        this(tempName, tempPrice);
        category = tempCategory;
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
