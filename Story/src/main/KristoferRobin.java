package main;

public class KristoferRobin extends Person implements Message,Busy{
    KristoferRobin (String name, State state, Condition condition){
        super(name, state, condition);
        setState(State.BEGIN);
    }
    public void togetherbusy(Kenga kenga){
        System.out.format("*%s занят с персонажем %s.\n",name, kenga);
        busy();
    }
    @Override
    public void speak() {
        System.out.format("%s говорит: \n \"есть еще Южный Полюс, и где-то есть Восточный Полюс, Западный Полюс, хотя люди не любят говорить о них.\"\n",name);
    }
    @Override
    public void busy() {
        setCondition(Condition.BUSY);
        flagKrist = false;
    }

}
