public class RubProcessor implements TransactionProcessor {

    @Override
    public Transaction sendTransaction(Transaction transaction) {
        if (transaction.getAmount() <= 0) {
            System.out.println("Нельзя отправить транзакцию с 0 или отрицательной суммой");
            return transaction;
        } else {
            transaction.setSend(true);
            return transaction;
        }
    }
}
