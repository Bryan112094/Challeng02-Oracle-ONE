package conversoralura.converter;

import conversoralura.formInit.formMain;

import javax.swing.*;

public class divisasGUI {
    private JPanel panelInit = new JPanel();
    private String[] divisas = {"Dolar", "Euro", "Soles"};

    public divisasGUI(JFrame frame) {
        new formMain(frame, panelInit, divisas);
    }
}
