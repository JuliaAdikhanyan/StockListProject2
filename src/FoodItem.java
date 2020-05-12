import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class FoodItem extends GenericItem { // наследуем класс FoodItem от класса GenericItem

    private short expires; // срок годности
    private GregorianCalendar dateOfIncome; // дата производства через Календарь

    private SimpleDateFormat dateFormat = new SimpleDateFormat(" dd MMMM yyyy"); // формат даты

    // конструктор №1
    public FoodItem(String tempName) {
        this(tempName, 0, null, new GregorianCalendar(), (short) 0);
    }

    // констуруктор №2
    public FoodItem(String tempName, float tempPrice, short tempExpires) {
        this(tempName, tempPrice, null, new GregorianCalendar(), tempExpires);
    }

    // конструктор №3
    public FoodItem(String tempName, float tempPrice, FoodItem tempAnalog, GregorianCalendar tempDateOfIncome, short tempExpires) {
        super(tempName, tempPrice, tempAnalog);
        this.dateOfIncome = tempDateOfIncome;
        this.expires = tempExpires;
    }

    public short getExpires() {
        return expires;
    }

    public void printAll() {
        System.out.println("*****");
        System.out.println(" ---Name: " + getName() + " ---Price: " + getPrice()
                + " ---Expires: " + expires + " days");
    }

    public GregorianCalendar getDateOfIncome() {
        return dateOfIncome;
    }
}
