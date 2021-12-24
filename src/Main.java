public class Main {
    public static void main(String[] args) {
        int currentAccount = 100;
        int replenishment = 1500;
        int balance = replenishment + currentAccount;
        boolean isBonus = true;

        int receivedBonus;
        if (balance > 1000){
            receivedBonus = (replenishment / 100);
        } else {
            receivedBonus = 0;
        }
        System.out.println("Вы пополнили счет на сумму "+ replenishment + " " + "руб." + " вам доступно " + receivedBonus + " " + "бонусных руб.");
        System.out.println("Ваш счет = " + (balance + receivedBonus) + " руб.");
    }
}
