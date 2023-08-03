package ConversorAlura;

import ConversorAlura.Converter.DivisasGUI;

import javax.swing.*;

/**
 * ConversorAlura - Transformador de unidades.
 * Proyecto ideado por @AluraLatam, Complementado y Elaborado por @BryanGuevara Ascoy.
 *
 * @author Bryan Guevara Ascoy
 * @version 1.0
 *
 */
public class Main {
    private static JFrame frame = new JFrame();
    public static void main(String[] args){
        new DivisasGUI(frame);
    }
}
