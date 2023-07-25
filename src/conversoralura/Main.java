package conversoralura;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Main {
    public static void main(String[] args){

        /**
         * Colocar las imagenes como logo a los extremo
         * */

        ImageIcon logoAlura = new ImageIcon("src/conversoralura/resources/alura.jpg");
        ImageIcon logoOracle = new ImageIcon("src/conversoralura/resources/oracle.jpg");
        ImageIcon icoDivisa = new ImageIcon("src/conversoralura/resources/divisas.png");
        ImageIcon icoTemperatura = new ImageIcon("src/conversoralura/resources/temperatura.png");
        ImageIcon icoPeso = new ImageIcon("src/conversoralura/resources/peso.png");
        ImageIcon icoLongitud = new ImageIcon("src/conversoralura/resources/longitud.png");

        JLabel fondoWhite = new JLabel();
        fondoWhite.setOpaque(true);
        fondoWhite.setBackground(Color.WHITE);

        JLabel lblAlura = new JLabel();
        lblAlura.setIcon(logoAlura);
        lblAlura.setHorizontalTextPosition(JLabel.CENTER);
        lblAlura.setVerticalTextPosition(SwingConstants.TOP);

        JLabel lblOracle = new JLabel();
        lblOracle.setIcon(logoOracle);
        lblOracle.setHorizontalTextPosition(JLabel.CENTER);
        lblOracle.setVerticalTextPosition(SwingConstants.TOP);

        /**
         * Creación del JFrame y JPanel
         * */

        JFrame frame = new JFrame("Conversor Alura");
        JPanel panel = new JPanel();


        Border line = new LineBorder(Color.BLACK);
        Border margin = new EmptyBorder(5, 15, 5, 15);
        Border compound = new CompoundBorder(line, margin);


        /**
         * Creación de titulo y botones
         * */
        JLabel title1 = new JLabel("Conversor de:", SwingConstants.CENTER);
        title1.setOpaque(true);
        title1.setForeground(Color.WHITE);
        title1.setBackground(new Color(5, 25, 51));
        title1.setFont(new Font("Comic Sans MS", Font.BOLD, 18));

        JLabel footer = new JLabel("Implementado por: Guevara Ascoy Cristhian Bryan", SwingConstants.CENTER);
        footer.setOpaque(true);
        footer.setBackground(Color.WHITE);

        JButton btnMoneda = new JButton();
        btnMoneda.setIcon(icoDivisa);
        btnMoneda.setFocusable(false);
        Color colorAzul = new Color(41, 122, 227);
        btnMoneda.setBackground(colorAzul);
        btnMoneda.setBorder(compound);

        JButton btnTemperatura = new JButton();
        btnTemperatura.setIcon(icoTemperatura);
        btnTemperatura.setFocusable(false);
        btnTemperatura.setBackground(colorAzul);
        btnTemperatura.setBorder(compound);

        JButton btnPeso = new JButton();
        btnPeso.setFocusable(false);
        btnPeso.setIcon(icoPeso);
        btnPeso.setBackground(colorAzul);
        btnPeso.setBorder(compound);

        JButton btnDistancia = new JButton();
        btnDistancia.setFocusable(false);
        btnDistancia.setIcon(icoLongitud);
        btnDistancia.setBackground(colorAzul);
        btnDistancia.setBorder(compound);

        JButton btnConvertir = new JButton("Convertir");
        btnConvertir.setFocusable(false);
        btnConvertir.setForeground(Color.WHITE);
        btnConvertir.setBackground(new Color(5, 25, 51));

        String [] unidades = {"Soles", "Dolares", "Euro"};

        JComboBox<String> unidadOrigen = new JComboBox<>(unidades);
        JComboBox<String> unidadDestino = new JComboBox<>(unidades);


        /**
         * Agregando los componentes al JPanel
         * */
        panel.add(title1);
        panel.add(btnMoneda);
        panel.add(btnTemperatura);
        panel.add(btnPeso);
        panel.add(btnDistancia);
        panel.add(lblAlura);
        panel.add(lblOracle);
        panel.add(fondoWhite);
        panel.add(unidadOrigen);
        panel.add(unidadDestino);
        panel.add(btnConvertir);
        panel.add(footer);
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(800, 600));

        /**
         * Posicionando los componentes
         * */
        fondoWhite.setBounds(0, 0, 800, 105);
        lblAlura.setBounds(70, 10, 125, 85);
        lblOracle.setBounds(470, 35, 260, 35);
        title1.setBounds(0, 105, 800, 35);
        btnMoneda.setBounds(0, 140, 200, 100);
        btnTemperatura.setBounds(200, 140, 200, 100);
        btnPeso.setBounds(400, 140, 200, 100);
        btnDistancia.setBounds(600, 140, 200, 100);
        btnConvertir.setBounds(300, 360, 200, 50);

        unidadOrigen.setBounds( 150, 300, 150, 25);
        unidadDestino.setBounds(500, 300, 150, 25);

        footer.setBounds(0, 570, 800, 30);

        /**
         * Configurando el JFrame
         * */
        frame.add(panel);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
