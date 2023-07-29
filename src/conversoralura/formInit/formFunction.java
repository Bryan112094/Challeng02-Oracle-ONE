package conversoralura.formInit;

import conversoralura.converter.divisasGUI;
import conversoralura.converter.longitudGUI;
import conversoralura.converter.pesoGUI;
import conversoralura.converter.temperaturaGUI;

import javax.swing.*;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public abstract class formFunction {
    /**
     * Con esta función, JTextField solo podra aceptar números
     * */
    public void NumbersOnly(JTextField textField){
        AbstractDocument document = (AbstractDocument) textField.getDocument();
        DocumentFilter documentFilter = new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr)
                    throws BadLocationException {
                if (text.matches("[0-9.]+")) {
                    super.insertString(fb, offset, text, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                    throws BadLocationException {
                if (text.matches("[0-9.]+")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        };
        document.setDocumentFilter(documentFilter);
    }

    public void sendData(JLabel text, JTextField conver, JComboBox entrada, JComboBox salida, int tipo) {
        double resultant = 0;
        //Obtener los valoces selccionados
        String unidadOne = (String) entrada.getSelectedItem();
        String unidadTwo = (String) salida.getSelectedItem();
        String unitConver = conver.getText();

        //Convertir los valores a minusculas
        String unitOne = unidadOne.toLowerCase();
        String unitTwo = unidadTwo.toLowerCase();

        //unir valores
        String union = unitOne + "_" + unitTwo;

        switch (tipo) {
            case 0:
                resultant = converterTemperatura(union, unitConver);
                break;
            case 1:
                resultant = converterTemperatura(union, unitConver);
                break;
            case 2:
                resultant = converterTemperatura(union, unitConver);
                break;
            case 3:
                resultant = converterTemperatura(union, unitConver);
                break;
        }

        text.setText(String.valueOf(resultant));


    }

    public double converterTemperatura (String union, String valor) {
        if (union.equals("celsius_fahrenheit")) {
            return (Double.parseDouble(valor) * 9.0/5.0) + 32.0;
        } else if (union.equals("fahrenheit_celsius")) {
            return (Double.parseDouble(valor) * 5.0/9.0) - 17.7778;
        } else if (union.equals("celsius_kelvin")) {
            return (Double.parseDouble(valor) * 1) + 273.15;
        } else if (union.equals("kelvin_celsius")) {
            return (Double.parseDouble(valor) * 1) - 273.15;
        } else if (union.equals("fahrenheit_kelvin")) {
            return (Double.parseDouble(valor) * 5.0/9.0) + 255.372;
        } else if (union.equals("kelvin_fahrenheit")) {
            return (Double.parseDouble(valor) * 9.0/5.0) - 459.67;
        } else if (union.equals("celsius_rankine")) {
            return (Double.parseDouble(valor) * 9.0/5.0) + 491.67;
        } else if (union.equals("rankine_celsius")) {
            return (Double.parseDouble(valor) * 5.0/9.0) - 273.15;
        } else if (union.equals("fahrenheit_rankine")) {
            return (Double.parseDouble(valor) * 1) + 459.67;
        } else if (union.equals("rankine_fahrenheit")) {
            return (Double.parseDouble(valor) * 1) - 459.67;
        } else if (union.equals("kelvin_rankine")) {
            return (Double.parseDouble(valor) * 9.0/5.0);
        } else if (union.equals("rankine_kelvin")) {
            return (Double.parseDouble(valor) * 5.0/9.0);
        } else {
            return Double.parseDouble(valor);
        }
    }

    public void changeButtom(JFrame frame, JPanel panel, int opt) {
        frame.remove(panel);
        switch (opt) {
            case 0:
                new divisasGUI(frame);
                break;
            case 1:
                new temperaturaGUI(frame);
                break;
            case 2:
                new pesoGUI(frame);
                break;
            case 3:
                new longitudGUI(frame);
                break;
        }
    }
}
