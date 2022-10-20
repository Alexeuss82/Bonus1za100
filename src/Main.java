public class Main {
    public static void main(String[] args) {
        int startBalance = 100;
        int payToBalance = 100;
        int payBonus = payToBalance / 100;
        if (payToBalance < 1000) {
            payBonus = 0;
        } else {
            payBonus = payToBalance / 100;
        }
        int totalBalance = startBalance + payToBalance + payBonus;
        System.out.println("Итоговый балансе " + totalBalance + " руб");
        System.out.println("Количество бонусных рублей " + payBonus + " руб");
    }
}