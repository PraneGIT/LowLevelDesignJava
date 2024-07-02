package chainResponsiblityDesignPattern;

public class InfoLogProcessor extends LogProcessor {

    InfoLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(int logLevel, String msg) {
        if (logLevel == INFO) {
            System.out.println("Info Log: " + msg);
        } else {
            super.log(logLevel, msg);
        }
    }
    
}
