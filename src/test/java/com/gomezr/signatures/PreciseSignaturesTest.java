package com.gomezr.signatures;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class PreciseSignaturesTest {

    @Test
    public void test_emailContent() {
        Alert alert = new Alert();
        alert.setMessage("This is a test");
        String emailContent = PreciseSignatures.getEmailContent(alert);

        assertEquals("There is an active alert: This is a test", emailContent);
    }
}