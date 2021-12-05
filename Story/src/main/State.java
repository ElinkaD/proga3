package main;

public enum State {
    BEGIN("присоединяется к истории", null),
    TRAVEL("отправляется в путешествие", "возвращается домой");
    private final String startPhrase;
    private final String endPhrase;

    State(final String startPhrase, final String endPhrase) {
        this.startPhrase = startPhrase;
        this.endPhrase = endPhrase;
    }
    public String startState() {
        return startPhrase;
    }
    public String endState() {
        return endPhrase;
    }
}