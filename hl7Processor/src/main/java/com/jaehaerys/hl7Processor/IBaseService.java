package com.jaehaerys.hl7Processor;

public interface IBaseService {
    <T> void execute(String[] segments, T message) throws Exception;
}
