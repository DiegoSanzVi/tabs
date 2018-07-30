package org.vaadin.diego;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.shared.Registration;

public class MyTabs extends Tabs{

    @DomEvent("click")
    public static class SelectedEvent extends ComponentEvent<Tabs> {
        public SelectedEvent(Tabs source, boolean fromClient) {
            super(source, fromClient);
        }
    }



    public Registration addSelectedListener(
            ComponentEventListener<SelectedEvent> listener) {
        return addListener(SelectedEvent.class, listener);
    }
}
