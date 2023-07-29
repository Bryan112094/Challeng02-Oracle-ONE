package conversoralura.converter;

import conversoralura.formInit.formMain;

import javax.swing.*;

public class pesoGUI {
    private JPanel panelInit = new JPanel();
    private String[] peso = {"Kilogramo", "Gramo", "Tonelada", "Libra", "Onza"};

    public  pesoGUI(JFrame frame){
        new formMain(frame, panelInit, peso);
    }
}
