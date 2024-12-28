package com.jaehaerys.hl7Processor;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

@Component
public class MessageProcessor {
    private static final ObjectMapper oMapper = ObjectMapperUtility.getObjectMapper();

    public message process(String jsonString) throws Exception {
        var serializedJsonNode = parseStringIntoJsonNode(jsonString);
        message messageRe = new message();
        messageRe.setMessageBlob(serializedJsonNode.get("messageBlob").textValue());
        return messageRe;
    }


    private JsonNode parseStringIntoJsonNode(String message) throws JsonProcessingException {
        return oMapper.readTree(message);
    }

}


