package MonedaServices;

import Entity.Moneda;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class MonedaServices {

    Moneda m = new Moneda();

    public void mostrarMenu() {

        try {
            JOptionPane.showMessageDialog(null, "Bienvenido al Conversor de Monedas");
            String[] opciones = {"Conversor de Monedas", "Conversor de Unidades", "Conversor de Temperatura"};

            int seleccion = JOptionPane.showOptionDialog(null, "Selecciona una opcion de conversion:", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            if (seleccion == 0) {
                cargarMonedas();
                entradaValor();
                listaMonedas();
            }
            /*else if (seleccion == 1) {
            //cargarUnidades();
        } else if (seleccion == 2){
            cargarTemperatura();
        }*/
            deseaContinuar();
        } catch (NullPointerException e) {
            finalizarPrograma();
        }

    }

    public void listaMonedas() {
        
        DecimalFormat formato = new DecimalFormat("#.00");
        
        String[] monedas = {"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen",
            "De Pesos a Won Coreano", "De Dolar a Pesos", "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos",
            "De Won Coreano a Pesos"};

        int seleccionMoneda = JOptionPane.showOptionDialog(null, "Elija la moneda a la que deseas convertir tu dinero:", "Monedas",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, monedas, monedas[0]);

        /*if (seleccionMoneda == 0) {
            double pesosAdolar = m.getCantidad() / m.getDolar();
            JOptionPane.showMessageDialog(null, "Tienes $" + pesosAdolar + " Dolares");
        } else if (seleccionMoneda == 1) {
            double pesosAeuro = m.getCantidad() / m.getEuro();
            JOptionPane.showMessageDialog(null, "Tienes $" + pesosAeuro + " Euros");
        } else if (seleccionMoneda == 2) {
            double pesosLibras = m.getCantidad() / m.getLibras();
            JOptionPane.showMessageDialog(null, "Tienes $" + pesosLibras + " Yenes");
        } else if (seleccionMoneda == 3) {
            double pesosAyen = m.getCantidad() / m.getYen();
            JOptionPane.showMessageDialog(null, "Tienes $" + pesosAyen + " Yenes");
        } else if (seleccionMoneda == 4) {
            double pesosAwonCoreano = m.getCantidad() / m.getWonCoreano();
            JOptionPane.showMessageDialog(null, "Tienes $" + pesosAwonCoreano + "Won Coreano");
        } else if (seleccionMoneda == 5) {
            double dolarApesos = m.getCantidad() * m.getDolar();
            JOptionPane.showMessageDialog(null, "Tienes $" + dolarApesos + "Pesos");
        } else if (seleccionMoneda == 6) {
            double euroApesos = m.getCantidad() * m.getEuro();
            JOptionPane.showMessageDialog(null, "Tienes $" + euroApesos + "Pesos");
        } else if (seleccionMoneda == 7) {
            double libraApesos = m.getCantidad() * m.getLibras();
            JOptionPane.showMessageDialog(null, "Tienes $" + libraApesos + "Pesos");
        }else if (seleccionMoneda == 8) {
            double yenApesos = m.getCantidad() * m.getYen();
            JOptionPane.showMessageDialog(null, "Tienes $" + yenApesos + "Pesos");
        }else if (seleccionMoneda == 9) {
            double wonApesos = m.getCantidad() * m.getWonCoreano();
            JOptionPane.showMessageDialog(null, "Tienes $" + wonApesos + "Pesos");
        }*/
        switch (seleccionMoneda) {
            case 0:
                double pesosAdolar = m.getCantidad() / m.getDolar();
                JOptionPane.showMessageDialog(null, "Tienes $" + formato.format(pesosAdolar) + " Dolares");
                break;
            case 1:
                double pesosAeuro = m.getCantidad() / m.getEuro();
                JOptionPane.showMessageDialog(null, "Tienes $" + formato.format(pesosAeuro) + " Euros");
                break;
            case 2:
                double pesosLibras = m.getCantidad() / m.getLibras();
                JOptionPane.showMessageDialog(null, "Tienes $" + formato.format(pesosLibras) + " Yenes");
                break;
            case 3:
                double pesosAyen = m.getCantidad() / m.getYen();
                JOptionPane.showMessageDialog(null, "Tienes $" + formato.format(pesosAyen) + " Yenes");
                break;
            case 4:
                double pesosAwonCoreano = m.getCantidad() / m.getWonCoreano();
                JOptionPane.showMessageDialog(null, "Tienes $" + formato.format(pesosAwonCoreano) + "Won Coreano");
                break;
            case 5:
                double dolarApesos = m.getCantidad() * m.getDolar();
                JOptionPane.showMessageDialog(null, "Tienes $" + formato.format(dolarApesos) + "Pesos");
                break;
            case 6:
                double euroApesos = m.getCantidad() * m.getEuro();
                JOptionPane.showMessageDialog(null, "Tienes $" + formato.format(euroApesos) + "Pesos");
                break;
            case 7:
                double libraApesos = m.getCantidad() * m.getLibras();
                JOptionPane.showMessageDialog(null, "Tienes $" + formato.format(libraApesos) + "Pesos");
                break;
            case 8:
                double yenApesos = m.getCantidad() * m.getYen();
                JOptionPane.showMessageDialog(null, "Tienes $" + formato.format(yenApesos) + "Pesos");
                break;
            case 9:
                double wonApesos = m.getCantidad() * m.getWonCoreano();
                JOptionPane.showMessageDialog(null, "Tienes $" + formato.format(wonApesos) + "Pesos");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Moneda inválida");
                break;
        }
    }

    public void entradaValor() {

        boolean condicion = false;

        do {
            try {
                m.setCantidad(Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad de dinero"
                        + " que desea convertir:")));

                if (m.getCantidad() <= 0) {
                    condicion = true;
                    JOptionPane.showMessageDialog(null, "Ingresa un valor valido");
                } else if (m.getCantidad() > 0) {
                    condicion = false;
                }
            } catch (NumberFormatException e) {
                condicion = true;
                JOptionPane.showMessageDialog(null, "Ingresa un valor valido");
            } catch (NullPointerException e) {
                condicion = false;
                finalizarPrograma();
                break;
            }
        } while (condicion);

    }

    public void conversorDeMonedas() {

        double pesosAdolar = m.getCantidad() / m.getDolar();
        JOptionPane.showMessageDialog(null, "Tienes $" + pesosAdolar + " Dolares");

        double pesosAeuro = m.getCantidad() / m.getEuro();
        JOptionPane.showMessageDialog(null, "Tienes $" + pesosAeuro + " Euros");

        double pesosLibras = m.getCantidad() / m.getLibras();
        JOptionPane.showMessageDialog(null, "Tienes $" + pesosLibras + " Yenes");

        double pesosAyen = m.getCantidad() / m.getYen();
        JOptionPane.showMessageDialog(null, "Tienes $" + pesosAyen + " Yenes");

        double pesosAwonCoreano = m.getCantidad() / m.getWonCoreano();
        JOptionPane.showMessageDialog(null, "Tienes $" + pesosAwonCoreano + "Won Coreano");

    }

    public void cargarMonedas() {

        boolean condicion = false;
        String valorPositivo = "si";
        String valorNegativo = "no";

        do {
            try {
                String valorIngresado = JOptionPane.showInputDialog("¿Desea ingresar el valor de la divisa manualmente? Ingrese: SI ó NO");
                if (valorIngresado.equalsIgnoreCase(valorPositivo)) {

                    condicion = false;

                    m.setDolar(Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del Dólar:")));
                    m.setEuro(Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del Euro:")));
                    m.setLibras(Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de las Libras:")));
                    m.setWonCoreano(Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del Won Coreano:")));
                    m.setYen(Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del Yen:")));

                } else if (valorIngresado.equalsIgnoreCase(valorNegativo)) {
                    JOptionPane.showMessageDialog(null, "Se usarán los valores del sistema.");
                    condicion = false;
                    m.setDolar(4196);
                    m.setEuro(4603);
                    m.setLibras(5387);
                    m.setWonCoreano(3.20);
                    m.setYen(29.27);
                } else {
                    JOptionPane.showMessageDialog(null, "Ingresaste un valor invalido.");
                    condicion = true;
                }
            } catch (NumberFormatException e) {
                condicion = true;
                JOptionPane.showMessageDialog(null, "Ingresaste un valor invalido.");
            } catch (NullPointerException e) {
                finalizarPrograma();
                condicion = false;
            }

        } while (condicion);
    }

    public void deseaContinuar() {
        

        int opcion = JOptionPane.showOptionDialog(null, "¿Deseas continuar?", "Confirmación", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Yes", "No", "Cancelar"}, "Yes");//AQUI
        switch (opcion) {
            case 0:
                entradaValor();
                listaMonedas();
                deseaContinuar();
                break;
            case 1:
                finalizarPrograma();
                break;
            case 2:
                finalizarPrograma();
                break;
            default:
                break;
        }
    }

    public void finalizarPrograma() {
        JOptionPane.showMessageDialog(null, "Programa terminado.");
        System.exit(0);
    }

}

