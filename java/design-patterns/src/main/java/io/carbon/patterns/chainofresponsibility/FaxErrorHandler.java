package io.carbon.patterns.chainofresponsibility;

public class FaxErrorHandler implements Receiver {

  private Receiver nextReceiver;

  public FaxErrorHandler(Receiver nextReceiver) {
    this.nextReceiver = nextReceiver;
  }

  @Override
  public Boolean processMessage(Message msg) {
    if (msg.getText().contains("Fax")) {
      System.out.println("FaxErrorHandler processed " + msg.getPriority() + " priority issue: " + msg.getText());
      return true;
    } else {
      if (nextReceiver != null) {
        nextReceiver.processMessage(msg);
      }
    }
    
    return false;
  }
  
}
