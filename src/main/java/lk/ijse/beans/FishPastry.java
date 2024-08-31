package lk.ijse.beans;

import lk.ijse.contract.Food;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class FishPastry implements Food {

    @Override
    @Primary
    public void eat() {
        System.out.println("02 like - Fish Pastry");
    }
}
