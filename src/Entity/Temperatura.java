package Entity;

public class Temperatura {
    private double centigrados;
    private double fahrenheit;
    private double kelvin;
    private double rankine;
    private double cantidadTemp;
    
    
    public Temperatura(){
    }

    public Temperatura(double centigrados, double fahrenheit, double kelvin, double rankine, double cantidadTemp) {
        this.centigrados = centigrados;
        this.fahrenheit = fahrenheit;
        this.kelvin = kelvin;
        this.rankine = rankine;
        this.cantidadTemp = cantidadTemp;
    }

    public double getCentigrados() {
        return centigrados;
    }

    public void setCentigrados(double centigrados) {
        this.centigrados = centigrados;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getKelvin() {
        return kelvin;
    }

    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
    }

    public double getRankine() {
        return rankine;
    }

    public void setRankine(double rankine) {
        this.rankine = rankine;
    }

    public double getCantidadTemp() {
        return cantidadTemp;
    }

    public void setCantidadTemp(double cantidadTemp) {
        this.cantidadTemp = cantidadTemp;
    }
   
}
