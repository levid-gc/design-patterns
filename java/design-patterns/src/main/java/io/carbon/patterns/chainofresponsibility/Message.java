package io.carbon.patterns.chainofresponsibility;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Message {

  private String text;

  private MessagePriority priority;

}
