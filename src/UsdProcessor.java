public class UsdProcessor implements TransactionProcessor {

    @Override
    public Transaction sendTransaction(Transaction transaction) {
        if (transaction.getAmount() <= 0) {
            System.out.println("Нельзя отправить транзакцию с 0 или отрицательной суммой");
            return transaction;
        } else if (transaction.getAmount() < 10.0) {
            System.out.println("Минимальная сумма для перевода в USD - 10.0");
            return transaction;
        } else {
            transaction.setSend(true);
            return transaction;
        }
    }
}
