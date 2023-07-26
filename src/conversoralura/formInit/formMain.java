package conversoralura.formInit;

import javax.swing.*;
import java.awt.*;

public class formMain extends formFunction {
    /**
     * Creación de componentes e imagenes del formulario
     * */
    private final JFrame frame = new JFrame("Conversor Alura");
    private final JPanel panel = new JPanel();
    private final ImageIcon icoAlura = new ImageIcon("src/conversoralura/resources/alura.jpg");
    private final ImageIcon icoOracle = new ImageIcon("src/conversoralura/resources/oracle.jpg");
    private final ImageIcon icoDivisa = new ImageIcon("src/conversoralura/resources/divisas.png");
    private final ImageIcon icoTemperatura = new ImageIcon("src/conversoralura/resources/temperatura.png");
    private final ImageIcon icoPeso = new ImageIcon("src/conversoralura/resources/peso.png");
    private final ImageIcon icoLongitud = new ImageIcon("src/conversoralura/resources/longitud.png");
    private final Color backBlue = new Color(5, 25, 51);
    private final Color backCele = new Color(41, 122, 227);
    private final int ejeX = 800;
    private final int ejeY = 600;

    public formMain(){
        headerForm();

        JButton btnDivisa = new JButton();
        styleBtnConversor(btnDivisa, icoDivisa, backCele, 0, 140, 200, 100, panel, 0);
        JButton btnTemperatura = new JButton();
        styleBtnConversor(btnTemperatura, icoTemperatura, backCele, 200, 140, 200, 100, panel, 0);
        JButton btnPeso = new JButton();
        styleBtnConversor(btnPeso, icoPeso, backCele, 400, 140, 200, 100, panel, 0);
        JButton btnLongitud = new JButton();
        styleBtnConversor(btnLongitud, icoLongitud, backCele, 600, 140, 200, 100, panel, 0);


        JButton btnConvertir = new JButton("Convertir");
        styleBtnConversor(btnConvertir, new ImageIcon(), backBlue, 300, 320, 200, 50, panel, 1);

        String[] unidades = {"Soles", "Dolares", "Euro"};
        createComboBox(panel, unidades, 150, 30);

        footerForm();
        configFinal(frame, panel, ejeX, ejeY);
    }

    private void headerForm(){
        JLabel logoAlura = new JLabel();
        styleLogo(logoAlura, icoAlura, 70, 10, 125, 85, panel);

        JLabel logoOracle = new JLabel();
        styleLogo(logoOracle, icoOracle, 470, 35, 260, 35, panel);

        JLabel backHeader = new JLabel();
        backOrTitle(backHeader, 0, backBlue, 0, 0, ejeX, 105, panel);

        JLabel titleGeneral = new JLabel("Conversor de:", SwingConstants.CENTER);
        backOrTitle(titleGeneral, 1, backBlue, 0, 105, ejeX, 35, panel);
    }

    private void footerForm(){
        JLabel textFooter = new JLabel("Implementado por: Guevara Ascoy Cristhian Bryan", SwingConstants.CENTER);
        backOrTitle(textFooter, 0, backBlue, 0, 570, ejeX, 30, panel);
    }




}
