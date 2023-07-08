package Entity;

public class Moneda {

    private double dolar;
    private double euro;
    private double libras;
    private double pesos;
    private double yen;
    private double wonCoreano;
    private double cantidad;

    public Moneda() {

    }

    public Moneda(double dolar, double euro, double libras, double pesos, double yen, double wonCoreano, double cantidad) {
        this.dolar = dolar;
        this.euro = euro;
        this.libras = libras;
        this.pesos = pesos;
        this.yen = yen;
        this.wonCoreano = wonCoreano;
        this.cantidad = cantidad;
    }

   

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public double getEuro() {
        return euro;
    }

    public void setEuro(double euro) {
        this.euro = euro;
    }

    public double getLibras() {
        return libras;
    }

    public void setLibras(double libras) {
        this.libras = libras;
    }

    public double getPesos() {
        return pesos;
    }

    public void setPesos(double pesos) {
        this.pesos = pesos;
    }

    public double getYen() {
        return yen;
    }

    public void setYen(double yen) {
        this.yen = yen;
    }

    public double getWonCoreano() {
        return wonCoreano;
    }

    public void setWonCoreano(double wonCoreano) {
        this.wonCoreano = wonCoreano;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
}
