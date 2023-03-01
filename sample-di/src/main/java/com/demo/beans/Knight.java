package com.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Priority;
import java.util.List;
import java.util.Optional;

@Component
public class Knight {

    //private RescuingDimselQuest quest = new RescuingDimselQuest();

//    private SlayingDragonQuest quest = new SlayingDragonQuest();

//    private SingYoYeYo quest = new SingYoYeYo();


    //    @QuestType(type = QuestType.Type.Dimsel)
    private Quest quest;

    private MyClass myClass;

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public Knight(Optional<MyClass> myClass, Quest quest) {
        this.quest = quest;
    }

    public String goQuest() {
        return quest.goQuest();
    }

    @Autowired
    public void setSpringBean(List<MyInterface> list){

    }

}
