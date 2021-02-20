package io.carbon.patterns.chainofresponsibility;

public interface Receiver {
  
  Boolean processMessage(Message msg);
  
}
