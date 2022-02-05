public class TransactionArray {

    //Стандартная реализация массива нам не подходит
    //Делаем свою реализацию динамического массива

    private Transaction[] array;
    private int count;

    public TransactionArray(int length) {
        array = new Transaction[length];
    }

    public void printArray() {
        System.out.println(array.length);
    }

    public void insert(Transaction element) {
        if (array.length == count) {
            Transaction[] newArray = new Transaction[2 * count];
            for (int i = 0; i < count; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[count++] = element;
    }
}