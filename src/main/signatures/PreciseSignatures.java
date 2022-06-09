package signatures;

import lombok.Data;

public class PreciseSignatures {
    public static String getEmailContent(Alert alert) {
        return "There is an active alert: " + alert.getMessage();
    }
}

@Data
class Alert {
    private String message;
    private int errorCode;
    private int severity;
    private String owner;
}