package com.demo.beans;

import org.springframework.stereotype.Component;

@Component("demsil") //@QuestType(type = QuestType.Type.Dimsel)
public class RescuingDimselQuest implements Quest{
    public String goQuest() {
        return "Kinght is going to rescue Dimsel.";
    }
}
