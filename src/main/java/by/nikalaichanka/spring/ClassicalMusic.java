package by.nikalaichanka.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("musicBean")
public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Four seasons";
    }

    @PostConstruct
    public void init (){
        System.out.println("Initialization");
    }

    @PreDestroy
    public void PreDestroy (){
        System.out.println("Destruction");
    }
}
