package main.services;

import org.springframework.stereotype.Component;
import java.util.logging.Logger;

@Component
public class LogicalService {

    private final static Logger LOGGER = Logger.getLogger(LogicalService.class.getName());

    public int logicaland(int i, int j){
        LOGGER.info("Service call to the Logical AND");
        return i & j;
    }

    public int logicalor(int i, int j){
        LOGGER.info("Service call to the Logical OR");
        return i|j;
    }
}
