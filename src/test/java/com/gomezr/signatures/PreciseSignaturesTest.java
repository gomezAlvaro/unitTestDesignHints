package com.gomezr.signatures;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class PreciseSignaturesTest {

    @Test
    public void test_emailContent() {
        String emailContent = PreciseSignatures.getEmailContent("This is a test");

        assertEquals("There is an active alert: This is a test", emailContent);
    }
}