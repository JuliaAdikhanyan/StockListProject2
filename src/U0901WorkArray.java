public class U0901WorkArray<T extends Number>  { // ограничение по типу Number
    private T[] arrNum; // массив с типом, указанным в ограничении

    // конструктор
    public U0901WorkArray(T[] numP) {
        arrNum = numP; // присваивание ссылки входного параметра
    }

    public T[] getArrNum() {
        return arrNum;
    }

    // метод суммирования чисел массива
    public double sum() {
        double doubleWork = 0;
        for (T number : arrNum) {
            doubleWork += number.doubleValue();
        }
        return doubleWork;
    }
}
