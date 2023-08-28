package com.manniedev.firstspringbootapi.model;

public enum EnumStatus {
    ACTIVE("Site is active"),
    NOT_ACTIVE("Site is not active"),
    INVALID_URL("Invalid URL, Please check URL");

    private final String message;

    EnumStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
