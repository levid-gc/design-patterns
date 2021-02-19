type RequestType = "help" | "feedback";

interface Request {
  type: RequestType;
};

class Handler {
  private successor!: Handler;

  handle(request: Request): void {
    this.successor.handle(request);
  }
}

class HelpHandler extends Handler {
  handle(request: Request): void {
    if (request.type === "help") {
      // Show help information
    } else {
      super.handle(request);
    }
  }
}

class FeedbackHandler extends Handler {
  handle(request: Request): void {
    if (request.type === "feedback") {
      // Prompt for feedback
    } else {
      super.handle(request);
    }
  }
}



export {};