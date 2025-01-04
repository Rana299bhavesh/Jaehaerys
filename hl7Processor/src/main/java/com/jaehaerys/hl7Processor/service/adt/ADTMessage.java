package com.jaehaerys.hl7Processor.service.adt;

import lombok.Data;

@Data
public class ADTMessage {
    private String messageBlob;
    private String messageType;
}
