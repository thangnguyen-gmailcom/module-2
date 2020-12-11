public class Human {
    private String name;
    private int amount;

    public Human(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount ;
    }

    public void recharge(int amount){
        this.amount += amount;
    }

    public void withdrawMoney(int amount){
        this.amount -= amount;
    }
    
}
