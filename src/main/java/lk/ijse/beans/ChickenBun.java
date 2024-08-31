package lk.ijse.beans;

import lk.ijse.contract.Food;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("This is Yummy")
public class ChickenBun implements Food {

    @Override
    public void eat() {
        System.out.println("03 like - Chicken Bun");
    }
}
