package com.erudika.scoold.utils;

import java.util.List;

public interface Emailer {
    /**
     * Sends an email.
     * @param emails a list of email addresses (recipients)
     * @param subject the subject of the message
     * @param body the body of the message
     * @return true if the message was sent
     */
    boolean sendEmail(List<String> emails, String subject, String body);
}
