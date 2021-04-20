package ro.ase.cts.assignment.refactor;

public class Account implements AccountInterface {
    private double loanValue;
    private double rate;
    private int daysActive;
    private AccountTypes accountType;
    public static final double BROKER_FEE = .0125;
    public static final int RATEABLE_ANNUAL_DAYS = 365;

    public Account(double loanValue, double rate, int daysActive, AccountTypes accountType) throws InvalidLoanException {
        if (loanValue > 0) {
            this.rate = rate;
            this.loanValue = loanValue;
            this.daysActive = daysActive;
            this.accountType = accountType;
        } else {
            throw new InvalidLoanException();
        }

    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setDaysActive(int daysActive) {
        this.daysActive = daysActive;
    }

    public void setAccountType(AccountTypes accountType) {
        this.accountType = accountType;
    }

    public double getLoan() {
        return this.loanValue;
    }

    public double getRate() {
        return this.rate;
    }

    public double calculateActiveDaysProportion() {
        return this.daysActive / RATEABLE_ANNUAL_DAYS;
    }

    public boolean isAccountPremium() {
        return accountType == AccountTypes.PREMIUM;
    }

    public boolean isAccountSuperPremium() {
        return accountType == AccountTypes.SUPER_PREMIUM;
    }


    public static double calculateTotalFee(Account[] accounts) {
        double totalFee = 0.0;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].isAccountPremium() || accounts[i].isAccountSuperPremium())
                totalFee += BROKER_FEE * (accounts[i].loanValue
                        * Math.pow(accounts[i].rate, (accounts[i].calculateActiveDaysProportion())) - accounts[i].loanValue);    //	interest-principal
        }
        return totalFee;
    }

    public int getDaysActive() {
        return daysActive;
    }

    public AccountTypes getAccountType() {
        return accountType;
    }

    @Override
    public double getMonthlyRate() {
        return loanValue * rate;
    }

    public void setLoanValue(double value) throws InvalidLoanException {
        if (value < 0) {
            throw new InvalidLoanException();
        } else {
            this.loanValue = value;
        }
    }

    @Override
    public String toString() {
        return "This is an account. Loan: " + this.loanValue +
                "; rate: " + this.rate +
                "; days active:" + this.daysActive +
                "; Type: " + this.accountType +
                ";";
    }
}
