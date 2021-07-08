class Account{

    public Account(String holderName, int accountNumber, String accountType, double currentBalance){
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.currentBalance = currentBalance;

    }

    private String holderName;
    private final int accountNumber;
    private String accountType;
    private double currentBalance;

    public void depositMoney(double amount){
        currentBalance += amount;

    }

    public void withdrawMoney(double amount){

        double balance = currentBalance;
        if (balance > 0){
            currentBalance -= amount;
        } else {
            System.out.println("Insufficient Account Balance");
        }
    }


    public void displayAccountDetails(){
        System.out.println("Account Name: "+ accountNumber);
        System.out.println("Account Type: "+accountType);
        System.out.println("Name: " + holderName);
        System.out.println("Creating " + holderName+"'s Account");
    }

    double checkBalance(){
        return currentBalance;
    }





}
