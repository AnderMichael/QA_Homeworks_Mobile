package activities.calendar;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class MainCalendar {
    public Button startFreeTrial = new Button(By.id("com.simplemobiletools.calendar:id/dialog_trial_start_free_trial"));

    public Button addNew = new Button(By.id("com.simplemobiletools.calendar:id/calendar_fab"));
    public Button addNewEvent = new Button(By.id("com.simplemobiletools.calendar:id/calendar_fab"));

    public Button searchButton = new Button(By.id("com.simplemobiletools.calendar:id/search"));
    public TextBox searchInput = new TextBox(By.id("com.simplemobiletools.calendar:id/search_src_text"));

}
