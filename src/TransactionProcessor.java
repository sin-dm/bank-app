public interface TransactionProcessor {

    //Используем полиморфизм, определяем один общий контракт

    Transaction sendTransaction(Transaction transaction);
}
