package com.demo.beans;

public class Knight {

    //private RescuingDimselQuest quest = new RescuingDimselQuest();

//    private SlayingDragonQuest quest = new SlayingDragonQuest();

//    private SingYoYeYo quest = new SingYoYeYo();

    private Quest quest;

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public String goQuest() {
        return quest.goQuest();
    }
}
