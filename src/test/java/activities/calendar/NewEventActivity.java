package activities.calendar;

import control.TextBox;
import org.openqa.selenium.By;

public class NewEventActivity {

    public TextBox inputTitle = new TextBox(By.id("com.simplemobiletools.calendar:id/event_title"));
    public TextBox inputLocation = new TextBox(By.id("com.simplemobiletools.calendar:id/event_location"));
    public TextBox inputDescription = new TextBox(By.id("com.simplemobiletools.calendar:id/event_description"));

    public TextBox saveButton = new TextBox(By.id("com.simplemobiletools.calendar:id/save"));
    public TextBox okButton = new TextBox(By.id("android:id/button1"));

}
