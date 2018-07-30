package org.vaadin.diego;


import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.shared.Registration;

public class LabelComponent extends Label {
    public Registration addClickListener(
            ComponentEventListener<ClickEvent> listener) {
        return addListener(ClickEvent.class, listener);
    }
}
