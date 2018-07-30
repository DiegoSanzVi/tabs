package org.vaadin.diego;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.shared.Registration;

public class MyTab extends Tab {

    public MyTab(String s){
        super(s);
    }

    @DomEvent("click")
    public static class ClickTabEvent extends ComponentEvent<Tab> {

        public ClickTabEvent(Tab source, boolean fromClient) {
            super(source, fromClient);
        }
    }

    public Registration addClickListener(
            ComponentEventListener<ClickTabEvent> listener) {
        return addListener(ClickTabEvent.class, listener);
    }
}
