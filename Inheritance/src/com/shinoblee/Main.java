package com.shinoblee;

import org.w3c.dom.Text;

public class Main {

    public static void main(String[] args) {

//        var control = new TextBox();
//        control.disable();
//        System.out.println(control.isEnabled());

//        var box1 = new TextBox();
//        var box2 = new TextBox();
//        System.out.println(box1.toString());

//        var textBox = new TextBox();
//        textBox.setText("Hello World");
//        System.out.println(textBox);

//        var control = new UIControl(true);
//        var textBox = new TextBox();
//        show(control);

//        var point1 = new Point(1,2);
//        var point2 = new Point(1,2);
//        System.out.println(point1.hashCode());
//        System.out.println(point2.hashCode());


        //POLYMORPHISM
        UIControl[] controls = { new TextBox(), new CheckBox() };
        for (var control : controls) {
            control.render();
        //SAME AS WRITING THIS BUT ALLOWING THE OBJECTS TO @OVERRIDE THE PARENT METHOD
            //if control is TextBox
            //  renderTextBox
            //else if it is a CheckBox
            //  renderCheckBox
        }

    }

    //UPCASTING/DOWNCASTING
//    public static void show(UIControl control) {
//        if (control instanceof TextBox) {
//            var textBox = (TextBox) control;
//            textBox.setText("Hello World");
//        }
//        System.out.println(control);
//    }
}
