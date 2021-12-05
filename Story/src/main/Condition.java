package main;

public enum Condition {
    NORMAL(null),
    EXCITED("взволнованное"),
    TIRED("усталое"),
    BUSY("занятое");
    private final String sost;
    Condition(final String sost){
        this.sost = sost;
    }
    public String getSost(){
        return sost;
    }
}
