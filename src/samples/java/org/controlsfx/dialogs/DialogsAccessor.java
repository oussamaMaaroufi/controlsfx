package org.controlsfx.dialogs;

public class DialogsAccessor {

    public static void setWindows(boolean b) {
        Dialog.setWindows(b);
    }
    
    public static void setMacOS(boolean b) {
        Dialog.setMacOS(b);
    }
    
    public static void setLinux(boolean b) {
        Dialog.setLinux(b);
    }
}