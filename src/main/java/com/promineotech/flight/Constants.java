package com.promineotech.flight;

public class Constants {
    public static final int AIRPORT_CODE_MAX_LENGTH = 3;
    public static final int AIRPORT_CODE_MIN_LENGTH = 3;
    public static final String AIRPORT_CODE_REGEX = "[A-Z]{3}";

    public static final int DATE_MAX_LENGTH = 10;
    public static final int DATE_MIN_LENGTH = 10;
    public static final String DATE_REGEX = "[0-9]{4}-[0-9]{2}-[0-9]{2}";

    public static final int PHONE_MAX_LENGTH = 12;
    public static final int PHONE_MIN_LENGTH = 12;
    public static final String PHONE_REGEX = "[0-9]{3}\\.[0-9]{3}\\.[0-9]{4}";

    private Constants() {
    }
}
