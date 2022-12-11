package cl.exql.conv.monedas;

import javax.swing.*;

public class Convertor {

    ConvertirDesdePesos desdePesos = new ConvertirDesdePesos();
    ConvertirAPesos aPesos = new ConvertirAPesos();

    public void ConvertirMonedas(double ingresado) {
        String opcion = (JOptionPane.showInputDialog(null,
                "Elije la moneda a la que deseas convertir tu dinero ", "Monedas",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]
                        {"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano","De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos"},
                "Seleccion")).toString();
        switch(opcion) {
            case "De Pesos a Dólar":
                desdePesos.convertirADolares(ingresado);
                break;
            case "De Pesos a Euro":
                desdePesos.convertirAEuros(ingresado);
                break;
            case "De Pesos a Libras":
                desdePesos.convertirALibras(ingresado);
                break;
            case "De Pesos a Yen":
                desdePesos.convertirAYen(ingresado);
                break;
            case "De Pesos a Won Coreano":
                desdePesos.convertirAWon(ingresado);
                break;
            case "De Dólar a Pesos":
                aPesos.convertirDolares(ingresado);
                break;
            case "De Euro a Pesos":
                aPesos.convertirEuros(ingresado);
                break;
            case "De Libras a Pesos":
                aPesos.convertirLibras(ingresado);
                break;
            case "De Yen a Pesos":
                aPesos.convertirYen(ingresado);
                break;
            case "De Won Coreano a Pesos":
                aPesos.convertirWon(ingresado);
                break;
        }
    }
}
