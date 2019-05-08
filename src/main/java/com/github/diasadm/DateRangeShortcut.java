package com.github.diasadm;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.contextmenu.ContextMenu;
import com.vaadin.flow.component.contextmenu.MenuItem;

public class DateRangeShortcut extends ContextMenu {

    public DateRangeShortcut(Component target) {
        this.setTarget(target);
    }

    public void addShortcut(String label, ComponentEventListener<ClickEvent<MenuItem>> clickListener) {
        this.addItem(label, clickListener);
    }
    public void addShortcut(MenuItem item) {
        this.add(item);
    }

}
