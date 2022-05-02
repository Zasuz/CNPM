package BUS.Exception;

import javax.swing.*;

public class ShowJOptionPane extends Exception {
//    String ex = this.getMessage();

    public static void displayException(String ex) {
        JOptionPane.showMessageDialog(null, ex , "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public static void displayWarning(String error) {
        JOptionPane.showMessageDialog(null, error, "Warning", JOptionPane.WARNING_MESSAGE);
    }
    
    public static void displaySuggestion(String suggestion){
        JOptionPane.showMessageDialog(null, suggestion, "Suggestion", JOptionPane.QUESTION_MESSAGE);
    }
}
