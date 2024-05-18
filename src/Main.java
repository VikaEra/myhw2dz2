public class Main {
    public static void main(String[] args) {
        int startScore = 100; // на счету у клиента
        int replenishment = 1200; // пополнение счета
        int totalAmount; // итоговый счет
        int bonus; // количество бонусных рублей
        boolean refill = (replenishment > 1000); // пополнение счета более, чем на 1000 рублей (принимается за true)

        if (refill) {
            bonus = replenishment / 100; // бонусные рубли
            totalAmount = startScore + replenishment + bonus; // итоговый счет
        } else {
            bonus = 0; // бонусные рубли = 0, бонусов нет
            totalAmount = startScore + replenishment; // итоговый счет
        }

        System.out.println("Итоговый счет: " + totalAmount);
        System.out.println("Бонусные рубли: " + bonus);

    }
}

