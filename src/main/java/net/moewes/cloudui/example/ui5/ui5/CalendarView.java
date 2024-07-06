package net.moewes.cloudui.example.ui5.ui5;

import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;
import net.moewes.cloudui.UiEvent;
import net.moewes.cloudui.annotations.CloudUiView;
import net.moewes.cloudui.quarkus.runtime.CloudUi;
import net.moewes.cloudui.ui5.Ui5Calendar;
import net.moewes.cloudui.ui5.Ui5Panel;

import java.time.LocalDate;

@CloudUiView("/ui5/calendar")
public class CalendarView extends Ui5DemoBaseView {

    static final String TITLE = "Calendar";
    @Inject
    CloudUi ui;

    @Inject
    public CalendarView() {

        super(TITLE);
    }

    @PostConstruct
    public void createView() {

        ui.setTitle(TITLE);

        Ui5Panel panel = new Ui5Panel("Basic Calendar", true);
        add(panel);

        Ui5Calendar calendar = new Ui5Calendar();
        calendar.getElement().setAttribute("format-pattern", "yyyy-MM-dd");
        calendar.addEventListener("selected-dates-change", this::handleCalendarEvent);
        panel.add(calendar);

        Ui5Panel panel2 = new Ui5Panel("Calendar with hidden week numbers", true);
        add(panel2);

        Ui5Calendar calendar2 = new Ui5Calendar();
        calendar2.hideWeekNumbers();
        panel2.add(calendar2);

        Ui5Panel panel3 = new Ui5Panel("Calendar with min and max dates", true);
        add(panel3);

        Ui5Calendar calendar3 = new Ui5Calendar();
        calendar3.setMinDate(LocalDate.of(2021, 1, 1));
        calendar3.setMaxDate(LocalDate.of(2021, 12, 31));
        panel3.add(calendar3);

        Ui5Panel panel4 = new Ui5Panel("Calendar with selection type multiple", true);
        add(panel4);

        Ui5Calendar calendar4 = new Ui5Calendar();
        calendar4.setSelection(Ui5Calendar.CalendarSelection.MULTIPLE);
        //calendar4.addEventListener("selected-dates-change", this::handleCalendarEvent); // TODO wait for rc.12
        panel4.add(calendar4);

        Ui5Panel panel5 = new Ui5Panel("Calendar with selection type range", true);
        add(panel5);

        Ui5Calendar calendar5 = new Ui5Calendar();
        //calendar5.addEventListener("selected-dates-change", this::handleCalendarEvent); // TODO wait for rc.12
        calendar5.setSelection(Ui5Calendar.CalendarSelection.RANGE);
        panel5.add(calendar5);
    }

    private void handleCalendarEvent(UiEvent event) {
        /* // FIXME
        Notification notification = new Notification();
        notification.setDuration(2000);
        Optional<Object> dates = event.getParameter("dates");
        String text = "";
        if (dates.isPresent()) {
            List dateList = (List) dates.get();
            text = (String) dateList.stream().map(item -> {
                return LocalDateTime.ofEpochSecond((Integer) item, 0, ZoneOffset.UTC).toString();
            }).collect(Collectors.joining(","));

        }
        notification.setText("Data Selection changed " + text);
        notification.open();
        add(notification);

         */
    }
}
