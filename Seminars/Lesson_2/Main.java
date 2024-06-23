package Seminars.Lesson_2;

public class Main {
    public static void main(String[] args) {

        Human hm = new Human("Sergey");

        Market market = new Market();

        market.acceptToMarket(hm);
        market.takeInQueue(hm);
        market.giveOrders();
        market.takeOrders();
        market.releaseFromQueue();
        market.update();

    }
}
