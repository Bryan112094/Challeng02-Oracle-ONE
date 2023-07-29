package conversoralura.converter;

import conversoralura.formInit.formMain;

import javax.swing.*;

public class longitudGUI {
    private JPanel panelInit = new JPanel();
    private String[] longitud = {"Kilómetro", "Metro", "Milla", "Yarda", "Pie", "Pulgada"};
    private int tipo = 3;

    public longitudGUI(JFrame frame) {
        new formMain(frame, panelInit, longitud, tipo);
    }

}
