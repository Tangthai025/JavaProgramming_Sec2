import javax.swing.*;
public class Lab704 {
    public static void main(String[] args) {
        String greeting[] = {"Good Morning","Good Afternoon","Good Evening","Good Night"};
        StringBuilder DisPlay = new StringBuilder();
        for (String N : greeting) {
            DisPlay.append("\n- "+N);
        }JOptionPane.showMessageDialog(null, "The greeting words in English:"+DisPlay);
    }
}
