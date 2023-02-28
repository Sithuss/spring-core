package com.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Knight {

    //private RescuingDimselQuest quest = new RescuingDimselQuest();

//    private SlayingDragonQuest quest = new SlayingDragonQuest();

//    private SingYoYeYo quest = new SingYoYeYo();


    //    @QuestType(type = QuestType.Type.Dimsel)
    private Quest demsil;

    private MyClass myClass;

    public void setDemsil(Quest demsil) {
        this.demsil = demsil;
    }

    public Knight(Optional<MyClass> myClass, Quest demsil) {
        this.demsil = demsil;
    }

    public String goQuest() {
        return demsil.goQuest();
    }

    @Autowired
    public void setSpringBean(List<MyInterface> list){

    }

}
