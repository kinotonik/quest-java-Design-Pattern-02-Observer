public class Main {

    public static void main(String[] args) {


        Bank account = new Bank();
        account.setTotal(1000);

        Transactions.withdraw(account, 100, new TransactionListener() {
            @Override
            public void onComplete(Bank account) {
                System.out.println("$ Your balance is: " + account.getTotal());
            }
        });
    }
}
