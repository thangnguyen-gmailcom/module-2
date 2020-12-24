public class AccountExampleTest {

    private static AccountExample ax;
    private static final String[] validAccount = {"123abc_", "_abc123", "______", "123456","abcdefgh" };
    private static final String[] invalidAccount = {".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        ax = new AccountExample();
        for (String account : validAccount){
            boolean isValid = ax.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isValid);
        }

        for (String account : invalidAccount){
            boolean isValid = ax.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isValid);
        }
    }
}
