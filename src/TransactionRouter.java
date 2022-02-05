public class TransactionRouter {

    //Класс управляющий распределением транзакций
    //Закрываем приватные данные от внешнего доступа
    private final TransactionArray rubTransactions = new TransactionArray(1);
    private final TransactionArray eurTransactions = new TransactionArray(1);
    private final TransactionArray usdTransactions = new TransactionArray(1);
    private final TransactionArray errorTransactions = new TransactionArray(1);

    public void processTransactions(Transaction[] transactions) {
        TransactionProcessor transactionProcessor;
        for (int i = 0; i < transactions.length; i++) {
            Transaction transaction = transactions[i];
            if (transaction.getBik().startsWith("1")) {
                transactionProcessor = new RubProcessor();
                if (transactionProcessor.sendTransaction(transaction).isSend()) {
                    rubTransactions.insert(transaction);
                } else {
                    errorTransactions.insert(transaction);
                }
            } else if (transaction.getBik().startsWith("2")) {
                transactionProcessor = new EurProcessor();
                if (transactionProcessor.sendTransaction(transaction).isSend()) {
                    eurTransactions.insert(transaction);
                } else {
                    errorTransactions.insert(transaction);
                }
            } else if (transaction.getBik().startsWith("3")) {
                transactionProcessor = new UsdProcessor();
                if (transactionProcessor.sendTransaction(transaction).isSend()) {
                    usdTransactions.insert(transaction);
                } else {
                    errorTransactions.insert(transaction);
                }
            } else {
                errorTransactions.insert(transaction);
            }
        }
        rubTransactions.printArray();
        eurTransactions.printArray();
        usdTransactions.printArray();
        errorTransactions.printArray();
    }
}
