package chainResponsiblityDesignPattern;

public class DebugLogProcessor extends LogProcessor{

    DebugLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(int logLevel, String msg) {
        if (logLevel == DEBUG) {
            System.out.println("Debug Log: " + msg);
        } else {
            super.log(logLevel, msg);
        }
    }
    
}
