package ro.ase.cts.assignment.refactor;

public class AccountTest {
    public static void main(String[] args)  {
        // TODO Auto-generated method stub

        try {
            Account account = new Account(1000,2.5,365,AccountTypes.BUDGET);
            Account account1 = new Account(1000,2.5,700,AccountTypes.STANDARD);
            Account account2 = new Account(1000,2.5,750,AccountTypes.PREMIUM);
            Account account3 = new Account(1000,2.5,800,AccountTypes.SUPER_PREMIUM);


            Account[] accounts = new Account[4];
            accounts[0] = account;
            accounts[1] = account1;
            accounts[2] = account2;
            accounts[3] = account3;

            System.out.println(account.getDaysActive());
            System.out.println(account.getMonthlyRate());

            account.setLoanValue(200);
            System.out.println(account.getLoan());

            System.out.println(account.toString());
            System.out.println(account1.toString());
            System.out.println(account2.toString());
            System.out.println(account3.toString());

            System.out.println(account.calculateActiveDaysProportion());

        } catch (InvalidLoanException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
