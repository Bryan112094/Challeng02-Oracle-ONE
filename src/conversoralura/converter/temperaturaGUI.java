package conversoralura.converter;

import conversoralura.formInit.formMain;

import javax.swing.*;

public class temperaturaGUI {
    private JPanel panelInit = new JPanel();
    private String[] temperaturas = {"Celsius", "Fahrenheit", "Kelvin", "Rankine"};

    public temperaturaGUI(JFrame frame) {
        new formMain(frame, panelInit, temperaturas);
    }
}
