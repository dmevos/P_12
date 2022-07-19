import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    protected int num = 1;

    public void log(String msg) {
        var date = new Date();
        SimpleDateFormat f = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
        System.out.println("[" + num++ + " " + f.format(date) + "] " + msg);
    }

    private static Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }
}

