package com.jaehaerys.hl7Processor.service.adt;

import com.jaehaerys.hl7Processor.IBaseService;
import com.jaehaerys.hl7Processor.message;

public class ADTService implements IBaseService {
    @Override
    public <T> void execute(String[] segments, T message) throws Exception {
        if (message instanceof ADTMessage) {
            System.out.println("Processing ADTMessage...");
            // Custom processing logic
        }
    }
}
