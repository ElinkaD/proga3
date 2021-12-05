package main;

public class Pooh extends Person implements HabbitPooh{
    Pooh (String name, State state,Condition condition) {
        super(name, state, condition);
        setState(State.BEGIN);
    }
    public boolean equals(Object obj){
        if (this == obj) return true;
        else return false;
    }
    @Override
    public void hear(Person person) {
        System.out.format("%s слышит сообщение персонажа %s.\n",name, person);
        setCondition(Condition.EXCITED);
        offer("Восточному Полюсу", person);
    }

    @Override
    public void offer(String place, Person person) {
        System.out.format( "%s предлагает устроить искледицию к %s персонажу %s.\n",name,place,person);
    }

    @Override
    public void sit(String subject) {
        System.out.println(name + " садиться за " + subject + ".");
    }

    @Override
    public void go(String place, KristoferRobin kristoferRobin) {
        if (flagKrist == false) {
            System.out.println(name + " отправляется открывать " + place +" c Кристофером Робином");
        } else {
            System.out.println(name + " отправляется открывать " + place +" сам.");
            setState(State.TRAVEL);
            setCondition(Condition.TIRED);
        }
    }

    @Override
    public void sleeping(String time) {
        System.out.println("*Проходит "+time);
        System.out.println(name + " засыпает в самый разгар ужина.");
        sleep();
    }

    @Override
    public void sleep() {
        System.out.println(name + " спит.");
    }

}
