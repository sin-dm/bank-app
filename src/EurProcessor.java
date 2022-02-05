public class EurProcessor implements TransactionProcessor {

    @Override
    public Transaction sendTransaction(Transaction transaction) {
        if (transaction.getAmount() <= 0) {
            System.out.println("Нельзя отправить транзакцию с 0 или отрицательной суммой");
            return transaction;
        } else if (transaction.getAmount() < 100.0) {
            System.out.println("Минимальная сумма для перевода в EUR - 100.0");
            return transaction;
        } else {
            transaction.setSend(true);
            return transaction;
        }
    }
}
