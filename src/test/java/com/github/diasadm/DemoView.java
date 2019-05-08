package com.github.diasadm;

import com.vaadin.flow.component.HtmlComponent;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.time.LocalDate;

@Route("")
public class DemoView extends VerticalLayout {

    public DemoView() {
        DateRangePicker dateRangePicker = new DateRangePicker("Select the range", "Start date", "End date", true);
        dateRangePicker.addValueChangeListener(valueChangeEvent -> {
            DateRange dateRangeField = valueChangeEvent.getValue();
            dateRangePicker.setValue(dateRangeField);
            new Notification("Select the range: " + dateRangeField.getBeginDate() + " " + dateRangeField.getEndDate(), 5000, Notification.Position.BOTTOM_CENTER).open();
        });
        add(dateRangePicker, new HtmlComponent(Tag.HR));

        //DateRangePicker with init dates
        DateRangePicker dateRangePickerWithInitDate = new DateRangePicker("Date range with default dates", "Start date", LocalDate.now(), "End date", LocalDate.now().plusWeeks(1), true);
        dateRangePickerWithInitDate.addValueChangeListener(valueChangeEvent -> new Notification("Select the range: " + valueChangeEvent.getValue().getBeginDate() + " " + valueChangeEvent.getValue().getEndDate(), 5000, Notification.Position.BOTTOM_CENTER).open());
        add(dateRangePickerWithInitDate, new HtmlComponent(Tag.HR));

        //DateRangePicker without shortcut
        DateRangePicker dateRangePickerwithoutShortcut = new DateRangePicker("DateRangePicker without Shortcut", "Start date", LocalDate.now(), "End date", LocalDate.now().plusWeeks(2), false);
        dateRangePickerwithoutShortcut.addValueChangeListener(valueChangeEvent -> new Notification("Select the range: " + valueChangeEvent.getValue().getBeginDate() + " " + valueChangeEvent.getValue().getEndDate(), 5000, Notification.Position.BOTTOM_CENTER).open());
        add(dateRangePickerwithoutShortcut, new HtmlComponent(Tag.HR));
    }
}
