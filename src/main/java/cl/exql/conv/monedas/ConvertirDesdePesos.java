package cl.exql.conv.monedas;

import javax.swing.*;

public class ConvertirDesdePesos {

    private final double DOLAR = 3739.00;
    private final double EURO = 4050.48;
    private final double LIBRA = 4890.52;
    private final double YEN = 29.68;
    private final double WON = 3.04;
    public void convertirADolares(double valor) {
        double moneda = valor / DOLAR;
        moneda = (double) Math.round(moneda *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +moneda+ " Dolares");
    }

    public void convertirAEuros(double valor) {
        double moneda = valor / EURO;
        moneda = (double) Math.round(moneda *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +moneda+ " Euros");
    }

    public void convertirALibras(double valor) {
        double moneda = valor / LIBRA;
        moneda = (double) Math.round(moneda *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +moneda+ " Libras Esterlinas");
    }

    public void convertirAYen(double valor) {
        double moneda = valor / YEN;
        moneda = (double) Math.round(moneda *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +moneda+ " Yuanes");
    }

    public void convertirAWon(double valor) {
        double moneda = valor / WON;
        moneda = (double) Math.round(moneda *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +moneda+ " Wons");
    }
}
