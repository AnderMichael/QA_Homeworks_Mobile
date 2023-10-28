package testSuite;

import activities.calendar.MainCalendar;
import activities.calendar.NewEventActivity;
import control.Label;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import session.Session;

public class CalendarTest {
    MainCalendar calendarMainActivity = new MainCalendar();
    NewEventActivity eventActivity = new NewEventActivity();

    @BeforeEach
    public void initCalendar() {
        calendarMainActivity.startFreeTrial.click();
    }

    @Test
    public void verifyAddCalculator() {
        String eventName = "Ander's Event";
        enteringNewActivity();
        creatingNewEvent(eventName, "La Paz", "Innova Emprende EVENT!");
        searchingEvent(eventName);
    }

    public void enteringNewActivity() {
        calendarMainActivity.addNew.click();
        calendarMainActivity.addNewEvent.click();
    }

    public void creatingNewEvent(String eventName, String location, String description) {
        eventActivity.inputTitle.setText(eventName);
        eventActivity.inputLocation.setText(location);
        eventActivity.inputDescription.setText(description);

        eventActivity.saveButton.click();
        eventActivity.okButton.click();
    }

    public void searchingEvent(String eventName) {
        calendarMainActivity.searchButton.click();
        calendarMainActivity.searchInput.setText(eventName);
        Label labelEvent = new Label(By.xpath(String.format("//android.widget.TextView[@resource-id=\"com.simplemobiletools.calendar:id/event_item_title\" and @text=\"%s\"]", eventName)));
        Assertions.assertTrue(labelEvent.findControls() >= 1, "ERROR! No se creo el evento correctamente");
    }

    @AfterEach
    public void closeApp() {
        Session.getSession().closeApp();
    }
}
