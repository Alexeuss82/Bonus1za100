public class Main {
    public static void main(String[] args) {
        int startbalance = 100;
        int paytobalance = 1100;
        int paybonus = paytobalance/100;
        if (paytobalance < 1000) {
            paybonus = 0;
        } else {
            paybonus = paytobalance/100;
        }
        int itogobalance = startbalance + paytobalance + paybonus;
        System.out.println("Итоговый балансе " + itogobalance + " руб");
        System.out.println("Количество бонусных рублей " + paybonus + " руб");
    }
}