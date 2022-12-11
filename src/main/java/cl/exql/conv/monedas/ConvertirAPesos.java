package cl.exql.conv.monedas;

import javax.swing.*;

public class ConvertirAPesos {

    private final double DOLAR = 3739.00;
    private final double EURO = 4050.48;
    private final double LIBRA = 4890.52;
    private final double YEN = 29.68;
    private final double WON = 3.04;
    public String tipoMoneda = " Pesos Chilenos";
    public void convertirDolares(double valor) {
        double moneda = valor * DOLAR;
        moneda = (double) Math.round(moneda *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +moneda+ tipoMoneda);
    }

    public void convertirEuros(double valor) {
        double moneda = valor * EURO;
        moneda = (double) Math.round(moneda *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +moneda+ tipoMoneda);
    }

    public void convertirLibras(double valor) {
        double moneda = valor * LIBRA;
        moneda = (double) Math.round(moneda *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +moneda+ tipoMoneda);
    }

    public void convertirYen(double valor) {
        double moneda = valor * YEN;
        moneda = (double) Math.round(moneda *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +moneda+ tipoMoneda);
    }

    public void convertirWon(double valor) {
        double moneda = valor * WON;
        moneda = (double) Math.round(moneda *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +moneda+ tipoMoneda);
    }
}
