package Seminars.Lesson_2;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {

    private List<Actor> actors = new ArrayList<Actor>();

    @Override
    public void acceptToMarket(Actor actor) {
        actors.add(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        actors.remove(0);
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void giveOrders() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void releaseFromQueue() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void takeInQueue(Actor actor) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void takeOrders() {
        // TODO Auto-generated method stub
        
    }
    
}
