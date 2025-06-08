package com.example.pasir_polinski_piotr.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AppInfo {
    public String appName;
    private static final String APP_VERSION = "1.0.0"; // Example version
    private static final String MESSAGE = "Welcome to the application!"; // Example message
}

