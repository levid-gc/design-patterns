package io.carbon.patterns.chainofresponsibility;

public class EmailErrorHandler implements Receiver {

  private Receiver nextReceiver;

  public EmailErrorHandler(Receiver nextReceiver) {
    this.nextReceiver = nextReceiver;
  }

  @Override
  public Boolean processMessage(Message msg) {
    if (msg.getText().contains("Email")) {
      System.out.println("EmailErrorHandler processed " + msg.getPriority() + " priority issue: " + msg.getText());
      return true;
    } else {
      if (nextReceiver != null) {
        nextReceiver.processMessage(msg);
      }
    }
    
    return false;
  }
  
}
