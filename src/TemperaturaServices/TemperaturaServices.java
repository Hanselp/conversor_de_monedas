package TemperaturaServices;

	import Entity.Temperatura;
	import java.text.DecimalFormat;
	import javax.swing.JOptionPane;

	public class TemperaturaServices {

	    Temperatura t = new Temperatura();

	    public void cargarTemperatura() {
	        JOptionPane.showMessageDialog(null, "Se han cargado los valores de temperatura");

	        t.setFahrenheit(33.8);
	        t.setKelvin(273.15);
	        t.setRankine(493.47);
	        entradaValor();
	        listaTemperatura();
	    }

	    public void entradaValor() {
	        boolean condicion = false;

	        do {
	            try {
	                t.setCantidadTemp(Double.parseDouble(JOptionPane.showInputDialog("Ingresa los grados"
	                        + " que desea convertir:")));

	                if (t.getCantidadTemp() <= 0) {
	                    condicion = true;
	                    JOptionPane.showMessageDialog(null, "Ingresa un valor valido");
	                } else if (t.getCantidadTemp() > 0) {
	                    condicion = false;
	                }
	            } catch (NumberFormatException e) {
	                condicion = true;
	                JOptionPane.showMessageDialog(null, "Ingresa un valor valido");
	            } catch (NullPointerException e) {
	                finalizarPrograma();
	                break;
	            }
	        } while (condicion);

	    }

	    public void listaTemperatura() {
	        DecimalFormat formato = new DecimalFormat("#.00");

	        String[] temp = {"De Centigrados a Fahrenheit", "De Centigrados a Kelvin", "De Centigrados a Rankine", "De Fahrenheit a Centigrados",
	            "De Kelvin a Centigrados", "De Rankine a Centigrados"};

	        int seleccionMoneda = JOptionPane.showOptionDialog(null, "Elija la conversión que desea realizar: ", "Monedas",
	                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, temp, null);

	        switch (seleccionMoneda) {
	            case 0:
	                double centigradosAFahren = (t.getCantidadTemp() * (9.0 / 5.0)) + 32;
	                JOptionPane.showMessageDialog(null, "Los " + t.getCantidadTemp() + " grados centigrados son: " + formato.format(centigradosAFahren) + " grados Fahrenheit");
	                break;
	            case 1:
	                double centigradosAkelvin = t.getCantidadTemp() + t.getKelvin();
	                JOptionPane.showMessageDialog(null, "Los " + t.getCantidadTemp() + " grados centigrados son: " + formato.format(centigradosAkelvin) + " grados Kelvin");
	                break;
	            case 2:
	                double centigradosArankine = (t.getCantidadTemp() + t.getKelvin()) * 1.8;
	                JOptionPane.showMessageDialog(null, "Los " + t.getCantidadTemp() + " grados centigrados son: " + formato.format(centigradosArankine) + " grados Rankine ");
	                break;
	            case 3:
	                double fahrenAcentigrados = (t.getCantidadTemp() - 32) * (5.0 / 9.0);
	                JOptionPane.showMessageDialog(null, "Los " + t.getCantidadTemp() + " grados Fahrenheit son: " + formato.format(fahrenAcentigrados) + " grados Centigrados");
	                break;
	            case 4:
	                double kelvinAcentigrados = t.getCantidadTemp() - 273.15;
	                JOptionPane.showMessageDialog(null, "Los " + t.getCantidadTemp() + " grados Kelvin son: " + formato.format(kelvinAcentigrados) + " grados Centigrados");
	                break;
	            case 5:
	                double rankineAcentigrados = (t.getCantidadTemp() - 491.67) / 1.8;
	                JOptionPane.showMessageDialog(null, "Los " + t.getCantidadTemp() + " grados Rankine son: " + formato.format(rankineAcentigrados) + " grados Centigrados");
	                break;
	            default:
	                JOptionPane.showMessageDialog(null, "Moneda inválida");
	                break;
	        }
	    }

	    public void finalizarPrograma() {
	        JOptionPane.showMessageDialog(null, "Programa terminado.");
	        System.exit(0);
	    }
	}



