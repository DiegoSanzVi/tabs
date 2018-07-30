package org.vaadin.diego;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.NativeButton;

@DomEvent("click")
public class ClickEvent extends ComponentEvent<Label> {

    public ClickEvent(Label source, boolean fromClient) {
        super(source, fromClient);
    }
}