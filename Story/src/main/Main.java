package main;

public class Main {

    public static void main(String[] args) {
        KristoferRobin kristoferRobin = new KristoferRobin("Кристофер Робин",State.BEGIN, Condition.NORMAL);
        kristoferRobin.speak();
        Pooh pooh = new Pooh("Пух",State.BEGIN, Condition.NORMAL);
        pooh.hear(kristoferRobin);
        Kenga kenga = new Kenga("Кенга",State.BEGIN, Condition.NORMAL);
        kristoferRobin.togetherbusy(kenga);
        pooh.go("Восточный Полюс",kristoferRobin);
        pooh.sit("стол");
        pooh.sleeping("полчаса");
    }
}
