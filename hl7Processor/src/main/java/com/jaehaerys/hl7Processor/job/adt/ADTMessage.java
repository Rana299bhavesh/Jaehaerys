package com.jaehaerys.hl7Processor.job.adt;

import lombok.Data;

@Data
public class ADTMessage {
    private String messageBlob;
    private String messageType;
}
