package com.erudika.para.client;

public interface Email {
    /**
     * {@value #EMAIL_PATTERN}.
     */
    String EMAIL_PATTERN = "[A-Za-z0-9.%'+_\\-]+@[A-Za-z0-9.\\-]+\\.[A-Za-z\\S]{2,6}$";
}
