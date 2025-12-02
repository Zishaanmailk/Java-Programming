public class Account {
    final long accountNumber = 123456789L;

    final void bankPolicy() {
        System.out.println("Bank policy cannot be changed.");
    }

    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        System.out.println("Account number (final): " + s.accountNumber);
        s.bankPolicy();

    }
}

class SavingsAccount extends Account {
  
}


final class CentralBankRules {
}
