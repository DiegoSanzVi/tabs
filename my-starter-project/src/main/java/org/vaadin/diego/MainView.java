package org.vaadin.diego;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.router.Route;

/**
 * The main view contains a button and a template element.
 */
@HtmlImport("styles/shared-styles.html")
@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        LabelComponent label = new LabelComponent();
        label.setText("Diego Label");

        label.addClickListener(event -> {
            System.out.println("Click");
        });

        MyTabs myTabs = new MyTabs();
        myTabs.addSelectedListener(event -> {
            System.out.println("MyTabs");
        });
        myTabs.addSelectedChangeListener(event -> {
            System.out.println("Change");
        });


        MyTab t1 = new MyTab("tab1");
        MyTab t2 = new MyTab("tab2");

        t1.addClickListener(event -> {
            System.out.println("Click on tab 1");
        });

        t2.addClickListener(event -> {
            System.out.println("Click on tab 2");
        });

        myTabs.add(t1,t2);


        add( label, myTabs );
    }
}
