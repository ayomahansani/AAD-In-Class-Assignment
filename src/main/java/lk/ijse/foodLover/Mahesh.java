package lk.ijse.foodLover;

import jakarta.annotation.PostConstruct;
import lk.ijse.contract.Food;
import lk.ijse.customAnnotaion.FinallyLike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mahesh {

    // setter injection

    private Food food;

    @Autowired
    @Qualifier("This is Yummy")
    @FinallyLike
    public void setFood(Food food){
        this.food = food;
    }

    @PostConstruct
    public void init(){
        food.eat();
    }


}
