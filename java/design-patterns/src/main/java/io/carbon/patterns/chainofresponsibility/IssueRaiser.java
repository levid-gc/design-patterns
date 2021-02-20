package io.carbon.patterns.chainofresponsibility;

public class IssueRaiser {
  
  private Receiver firstReceiver;

  public IssueRaiser(Receiver firstReceiver) {
    this.firstReceiver = firstReceiver;
  }

  public void raiseMessage(Message msg) {
    if (firstReceiver != null) {
      firstReceiver.processMessage(msg);
    }
  }

}
