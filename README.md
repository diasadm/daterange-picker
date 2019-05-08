# daterange-picker

DataangePicker integration of Vaadin flow 

## Development instructions

DateRangePicker dateRangePicker = new DateRangePicker("Select the range", "Start date", "End date", true);
dateRangePicker.addValueChangeListener(valueChangeEvent -> {
      DateRange dateRangeField = valueChangeEvent.getValue();
      new Notification("Select the range: " + dateRangeField.getBeginDate() + " " + dateRangeField.getEndDate(), 5000, Notification.Position.BOTTOM_CENTER).open();
});
       
     
Starting the test/demo server:
```
mvn jetty:run
```

This deploys demo at http://localhost:8080

### Branching information
