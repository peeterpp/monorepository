package com.example.pasir_polinski_piotr.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AppInfo {
    public String appName;
    private static final String appVersion = "1.0.0"; // Example version
    private static final String message = "Welcome to the application!"; // Example message

    public static String getAppVersion() {
        return appVersion;
    }

    public static String getMessage() {
        return message;
    }
}

