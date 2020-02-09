package com.shinoblee;

public class TextBox extends UIControl {
    private String text = "";

//    public TextBox() {
//        super(true);
////        System.out.println("TextBox");
//    }


    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

    //THIS WILL OVERWRITE METHODS WITH THE STANDARD JAVA COMPILER PACKAGE
    @Override
    public String toString() {
        return text;
    }

    public void setText(String text) { this.text = text; }

    public void clear() { text = ""; }
}
