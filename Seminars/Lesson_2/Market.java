package Seminars.Lesson_2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Market implements MarketBehaviour, QueueBehaviour {

    private List<Actor> actors = new ArrayList<Actor>();
    Queue<Actor> actorsQueue = new ArrayDeque<>();
    private Actor actor;

    @Override
    public void acceptToMarket(Actor actor) {
        actors.add(actor);
        System.out.println(actor.getName() + " посетил магазин");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        actors.remove(0);
        System.out.println(actor.getName() + " покинул магазин");
    }

    @Override
    public void update() {
        int ordersCount = 0;
        for (Actor actor : actors) {
            if (actor.isMakeOrder()) {
                ordersCount++;
            }
        }
        System.out.println("Количество заказов: " + ordersCount);
    }

    @Override
    public void giveOrders() {
        actorsQueue.peek().setMakeOrder(true);
        System.out.println(actorsQueue.peek().getName() + " сделал заказ");
    }

    @Override
    public void releaseFromQueue() {
        System.out.println(actorsQueue.peek().getName() + " покинул очередь");
        actorsQueue.poll();
    }

    @Override
    public void takeInQueue(Actor actor) {
        actorsQueue.add(actor);
        System.out.println(actor.getName() + " встал в очередь");
    }

    @Override
    public void takeOrders() {
        actorsQueue.peek().setTakeOrder(true);
        System.out.println(actorsQueue.peek().getName() + " забрал заказ");
    }

}
