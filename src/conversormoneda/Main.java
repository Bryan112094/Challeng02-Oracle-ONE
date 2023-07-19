package conversormoneda;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        Object[] possibleValues = { "Conversor de Moneda", "Conversor de Temperatura" };
        Object selectedValue = JOptionPane.showInputDialog(null,
                "Seleccione una opción de conversión", "Menu",
                JOptionPane.DEFAULT_OPTION, null,
                possibleValues, possibleValues[0]);
    }
}
