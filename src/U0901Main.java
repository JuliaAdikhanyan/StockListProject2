import java.util.Arrays;

public class U0901Main {

    public static void main(String[] args) {

        Integer[] intArr = {10, 20, 15}; // создаём и заполняем массив

        Float[] floatArr = new Float[10]; // создаём массив
        for (int i = 0; i < floatArr.length; i++) { // заполняем массив рандомными числами типа float
            floatArr[i] = (float) (Math.random() * 10);
        }

        // создание экземпляров класса U0901WorkArray
        U0901WorkArray<Integer> insWorkArrayInt = new U0901WorkArray<>(intArr);
        System.out.println(insWorkArrayInt.sum());

        U0901WorkArray<Float> insWorkArrayFloat = new U0901WorkArray<>(floatArr);
        System.out.println(insWorkArrayFloat.sum());

        String line = "Конфеты 'Маска'; 45; 120";

        // разбиваем строку на поля с помощью split
        String[] itemFld = line.split("; ");

        // инициализирование входных данных
        String name = itemFld[0];
        float price = Float.parseFloat(itemFld[1]);
        short expires = Short.parseShort(itemFld[2]);

        // создание экземпляра класса FoodItem
        FoodItem food = new FoodItem(name, price, expires);
        // вывод полученных данных
        food.printAll();

    }
}
