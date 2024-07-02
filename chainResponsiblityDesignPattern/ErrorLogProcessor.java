package chainResponsiblityDesignPattern;

public class ErrorLogProcessor extends LogProcessor {

    ErrorLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(int logLevel, String msg) {
        if (logLevel == ERROR) {
            System.out.println("Error Log: " + msg);
        } else {
            super.log(logLevel, msg);
        }
    }
    
}
