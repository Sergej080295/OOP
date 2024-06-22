package Seminars.Lesson_2;

/*
Интерфейс ActorBehavoir,
который будет содержать
описание возможных
действий актора в
очереди/магазине
*/

public abstract class Actor implements ActorBehavoir {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public Actor(String name){
        this.name = name;
    }

    public abstract String getName();
}
