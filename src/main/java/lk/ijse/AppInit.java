package lk.ijse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

public class AppInit {
    public static void main(String[] args) {

        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(Configuration.class);
        ctx.refresh();
        ctx.registerShutdownHook();
    }
}