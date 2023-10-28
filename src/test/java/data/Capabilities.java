package data;

public enum Capabilities {
    DEVICE_NAME("appium:deviceName", "Andersaurio Wifi"),
    PLATFORM_VERSION("appium:platformVersion", "9"),
    APP_PACKAGE("appium:appPackage", "com.simplemobiletools.calendar"),
    APP_ACTIVITY("appium:appActivity", "com.simplemobiletools.calendar.activities.MainActivity"),
    AUTOMATION_NAME("appium:automationName", "uiautomator2"),
    PLATFORM_NAME("appium:platformName", "Android"),
    UDID("appium:udid", "RFXNW18B02001493");

    private final String capabilityName;
    private final String capabilityValue;

    Capabilities(String capabilityName, String capabilityValue) {
        this.capabilityName = capabilityName;
        this.capabilityValue = capabilityValue;
    }

    public String getCapabilityName() {
        return capabilityName;
    }

    public String getCapabilityValue() {
        return capabilityValue;
    }
}