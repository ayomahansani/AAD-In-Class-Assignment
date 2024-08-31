package lk.ijse.beans;

import lk.ijse.contract.Food;
import org.springframework.stereotype.Component;

@Component
public class FishBun implements Food {
    @Override
    public void eat() {
        System.out.println("01 like - Fish Bun");
    }
}
