package cl.exql.conv;

import cl.exql.conv.monedas.Convertor;

import javax.swing.*;

/**
 * Exequiel Venegas
 */
public class App {
    public static void main(String[] args) {
        Convertor monedas = new Convertor();
        while (true) {

            String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
            if (validarNumero(input) == true) {
                double Minput = Double.parseDouble(input);
                monedas.ConvertirMonedas(Minput);
                int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
                if (JOptionPane.OK_OPTION == respuesta) {
                    System.out.println("Selecciona opción Afirmativa");
                } else {
                    JOptionPane.showMessageDialog(null, "Programa terminado");
                    break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Valor inválido");
            }
        }

    }
    public static boolean validarNumero (String input){
        try {
            double x = Double.parseDouble(input);
            if (x >= 0 || x < 0) ;
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
