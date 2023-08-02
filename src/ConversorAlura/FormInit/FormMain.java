package ConversorAlura.FormInit;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.Map;

public class FormMain extends FormFunction {
    /**
     * Creación de componentes e imagenes del formulario
     * */
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

    public FormMain(JFrame frame, JPanel panel, String[] unidades, int tipo, Map symbol, Map changeValue){
        frame.setTitle("Conversor Alura");
        headerForm(panel);

        JButton btnDivisa = new JButton();
        styleBtnConversor(btnDivisa, icoDivisa, backCele, 0, 140, 200, 100, panel, 0);
        JButton btnTemperatura = new JButton();
        styleBtnConversor(btnTemperatura, icoTemperatura, backCele, 200, 140, 200, 100, panel, 0);
        JButton btnPeso = new JButton();
        styleBtnConversor(btnPeso, icoPeso, backCele, 400, 140, 200, 100, panel, 0);
        JButton btnLongitud = new JButton();
        styleBtnConversor(btnLongitud, icoLongitud, backCele, 600, 140, 200, 100, panel, 0);

        JComboBox<String> comboEntrada = new JComboBox<>(unidades);
        JComboBox<String> comboSalida = new JComboBox<>(unidades);
        JTextField textConverter = new JTextField();

        createCmbTxt(panel, comboEntrada, comboSalida, textConverter, 150, 30);

        JButton btnConvertir = new JButton("Convertir");
        styleBtnConversor(btnConvertir, new ImageIcon(), backBlue, 300, 370, 200, 50, panel, 1);

        JLabel result = new JLabel();
        styleResult(panel, result, 200, 450, 400, 80);

        btnConvertir.addActionListener(e -> sendData(result, textConverter, comboEntrada, comboSalida, tipo, symbol, changeValue));

        btnDivisa.addActionListener(e -> changeButtom(frame, panel, 0));
        btnTemperatura.addActionListener(e -> changeButtom(frame, panel, 1));
        btnPeso.addActionListener(e -> changeButtom(frame, panel, 2));
        btnLongitud.addActionListener(e -> changeButtom(frame, panel, 3));

        footerForm(panel);
        configFinal(frame, panel, ejeX, ejeY);
    }

    private void headerForm(JPanel panel){
        JLabel logoAlura = new JLabel();
        styleLogo(logoAlura, icoAlura, 70, 10, 125, 85, panel);

        JLabel logoOracle = new JLabel();
        styleLogo(logoOracle, icoOracle, 470, 35, 260, 35, panel);

        JLabel backHeader = new JLabel();
        backOrTitle(backHeader, 0, backBlue, 0, 0, ejeX, 105, panel);

        JLabel titleGeneral = new JLabel("Conversor de:", SwingConstants.CENTER);
        backOrTitle(titleGeneral, 1, backBlue, 0, 105, ejeX, 35, panel);
    }

    private void footerForm(JPanel panel){
        JLabel textFooter = new JLabel("Implementado por: Guevara Ascoy Cristhian Bryan", SwingConstants.CENTER);
        backOrTitle(textFooter, 0, backBlue, 0, 570, ejeX, 30, panel);
    }

    public void styleLogo(JLabel logo, ImageIcon icono, int x, int y, int width, int height, JPanel panel){
        logo.setIcon(icono);
        logo.setHorizontalTextPosition(JLabel.CENTER);
        logo.setVerticalTextPosition(SwingConstants.CENTER);
        panel.add(logo);
        logo.setBounds(x, y, width, height);
    }

    public void backOrTitle(JLabel texto, int tipo, Color color, int x, int y, int width, int height, JPanel panel) {
        texto.setOpaque(true);
        if (tipo == 1) {
            texto.setForeground(Color.WHITE);
            texto.setBackground(color);
            texto.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        } else {
            texto.setBackground(Color.WHITE);
        }

        panel.add(texto);
        texto.setBounds(x, y, width, height);
    }
    public void styleBtnConversor(JButton boton, ImageIcon icono, Color color, int x, int y, int width, int height, JPanel panel, int tipo){
        boton.setFocusable(false);

        if (tipo == 0) {
            Border line = new LineBorder(Color.BLACK);
            Border margin = new EmptyBorder(5, 15, 5, 15);
            Border compound = new CompoundBorder(line, margin);

            boton.setIcon(icono);
            boton.setBackground(color);
            boton.setBorder(compound);
        } else {
            boton.setForeground(Color.WHITE);
            boton.setBackground(color);
        }

        panel.add(boton);
        boton.setBounds(x, y, width, height);
    }

    public void createCmbTxt(JPanel panel, JComboBox comboEntrada, JComboBox comboSalida, JTextField textConverter, int width, int height) {
        Border line = new LineBorder(Color.BLACK);
        Border margin = new EmptyBorder(5, 15, 5, 15);
        Border compound = new CompoundBorder(line, margin);

        comboSalida.setSelectedIndex(1);
        NumbersOnly(textConverter);
        panel.add(comboEntrada);
        panel.add(comboSalida);
        panel.add(textConverter);
        comboEntrada.setBounds(150, 270, width, height);
        comboSalida.setBounds(500, 270, width, height);
        textConverter.setBorder(compound);
        textConverter.setBounds(300, 320, 200, height + 5);
    }

    public void styleResult(JPanel panel, JLabel text, int x, int y, int width, int height){
        Border line = new LineBorder(Color.BLACK);
        Border margin = new EmptyBorder(5, 15, 5, 15);
        Border compound = new CompoundBorder(line, margin);
        text.setOpaque(true);
        text.setBorder(compound);
        text.setHorizontalAlignment(SwingConstants.CENTER);
        text.setBackground(Color.WHITE);
        text.setFont(new Font("Comic Sans MS", Font.BOLD, 22));

        panel.add(text);
        text.setBounds(x, y, width, height);
    }

    public void configFinal(JFrame frame, JPanel panel, int x, int y) {
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(x, y));

        frame.add(panel);
        frame.setSize(x, y);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
