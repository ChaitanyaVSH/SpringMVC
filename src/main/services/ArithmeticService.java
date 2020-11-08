package main.services;

import org.springframework.stereotype.Component;
import java.util.logging.Logger;

@Component
public class ArithmeticService {

    private final static Logger LOGGER = Logger.getLogger(ArithmeticService.class.getName());

    public int add(int i, int j){
        LOGGER.info("Service call to the Addition");
        return i+j;
    }

    public int subtract(int i, int j){
        LOGGER.info("Service call to the Subtraction");
        return i-j;
    }
}
