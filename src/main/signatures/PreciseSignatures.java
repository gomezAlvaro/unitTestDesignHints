package signatures;

import lombok.Data;

public class PreciseSignatures {
    public static String getEmailContent(String message) {
        return "There is an active alert: " + message;
    }
}

@Data
class Alert {
    private String message;
    private int errorCode;
    private int severity;
    private String owner;
}