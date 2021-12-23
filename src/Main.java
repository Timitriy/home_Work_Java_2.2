public class Main {
    public static void main(String[] args) {
        int currentAccount = 100;
        int replenishment = 1500;
        int balance = replenishment + currentAccount;
        boolean isBonus = true;

        int receivedBonus;
        if (balance >= 1000){
            receivedBonus = (replenishment + currentAccount) / 100;
        } else {
            receivedBonus = 0;
        }
        System.out.println("Ваш счет = "+ balance + " "+"руб." + " + " + receivedBonus + " " + "бонусных руб.");
    }
}
