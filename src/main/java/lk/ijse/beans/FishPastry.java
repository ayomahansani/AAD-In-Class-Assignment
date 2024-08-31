package lk.ijse.beans;

import lk.ijse.contract.Food;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FishPastry implements Food {
    @Override
    public void eat() {
        System.out.println("2nd like - Fish Pastry");
    }
}
