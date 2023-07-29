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

public class formFunction {
    /**
     * Con esta función en el JTextField solo se podra aceptaras números
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

    public void sendData(JLabel text, JTextField conver, JComboBox entrada, JComboBox salida) {
        //Obtener los valoces selccionados
        String unidadOne = (String) entrada.getSelectedItem();
        String unidadTwo = (String) salida.getSelectedItem();

        //Convertir los valores a minusculas
        String unitOne = unidadOne.toLowerCase();
        String unitTwo = unidadTwo.toLowerCase();

        text.setText(unitOne + " - " + unitTwo);
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
