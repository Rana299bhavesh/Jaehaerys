package com.jaehaerys.hl7Processor.job.adt;

import com.jaehaerys.hl7Processor.IBaseService;

public class ADTService implements IBaseService {
    @Override
    public <T> void execute(String[] segments, T message) throws Exception {
        if (message instanceof ADTMessage) {
            System.out.println("Processing ADTMessage...");
            // Custom processing logic
        }
    }
}
