package lk.ijse.beans;

import lk.ijse.contract.Food;
import lk.ijse.customAnnotaion.FinallyLike;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("This is Yummy")
@FinallyLike
public class ChickenRoll implements Food {
    @Override
    public void eat() {
        System.out.println("Finally Like ChickenRoll");
    }
}
