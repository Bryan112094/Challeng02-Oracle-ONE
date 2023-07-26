package conversoralura.formInit;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class formFunction {
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

    public void  createComboBox(JPanel panel, String[] unidades, int width, int height) {
        JComboBox<String> combo1 = new JComboBox<>(unidades);
        JComboBox<String> combo2 = new JComboBox<>(unidades);
        combo2.setSelectedIndex(1);
        panel.add(combo1);
        panel.add(combo2);
        combo1.setBounds(150, 270, width, height);
        combo2.setBounds(500, 270, width, height);
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
