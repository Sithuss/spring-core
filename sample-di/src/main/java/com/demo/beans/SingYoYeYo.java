package com.demo.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Priority;

@Component("yoyeyo")//@QuestType(type = QuestType.Type.YoYeYo)
public class SingYoYeYo implements Quest {
    public String goQuest() {
        return "Knight sings 'YoYeYo'";
    }
}
