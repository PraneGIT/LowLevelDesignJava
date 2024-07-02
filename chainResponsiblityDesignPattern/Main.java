package chainResponsiblityDesignPattern;

public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new ErrorLogProcessor(new DebugLogProcessor(new InfoLogProcessor(null)));
        logProcessor.log(LogProcessor.INFO, "This is an info message");
        logProcessor.log(LogProcessor.DEBUG, "This is a debug message");
        logProcessor.log(LogProcessor.ERROR, "This is an error message");
    }
}

// The pattern is applicable when there are multiple candidates to process the same request.
// It is also useful when you don’t want the client to choose the receiver as there are multiple objects can handle the request.
// Another useful case is when you want to decouple the client from receivers—the client will only need to know the first element in the chain.