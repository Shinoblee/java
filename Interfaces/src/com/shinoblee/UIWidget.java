package com.shinoblee;

public interface UIWidget extends Draggable, Resizable {
    //INTERFACES CAN HAVE MULTIPLE PARENTS UNLIKE CLASSES
    void render();
}

