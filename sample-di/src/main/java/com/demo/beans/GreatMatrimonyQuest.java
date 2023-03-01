package com.demo.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.Priority;


@Component("matrimony") @Primary //@QuestType(type = QuestType.Type.Matrimony)
public class GreatMatrimonyQuest implements Quest{

    @Override
    public String goQuest() {
        return "Kinght and Princess performs a great wedding";
    }
}
