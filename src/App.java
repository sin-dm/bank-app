public class App {

    //Реализуем банковский процессинг
    //Принимаем список транзакций - Долларовые, Евро, Рублевые
    //Отправляем транзакции в нужный процессор
    //Условия выборки
    // - если бик начинается с 1 - Рубли
    // - если бик начинается с 2 - Евро
    // - если бик начинается с 3 - Доллары
    // - если иное - ошибка.
    // В конце печатаем сколько куда.
    public static void main(String[] args) {
        TransactionRouter router = new TransactionRouter();
        Transaction[] transactions = new Transaction[4];
        transactions[0] = new Transaction("12", 10.0, "Mr", "Bean");
        transactions[1] = new Transaction("21", 200.0, "Mr", "Bean");
        transactions[2] = new Transaction("31", 10.0, "Mr", "Bean");
        transactions[3] = new Transaction("44", 10.0, "Mr", "Bean");
        router.processTransactions(transactions);
    }

}
