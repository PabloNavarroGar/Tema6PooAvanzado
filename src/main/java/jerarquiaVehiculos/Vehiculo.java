package jerarquiaVehiculos;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author jcarlosvico@maralboran.es
 */

// Esta clase hereda de la clase Object. Todas las clases heredan de Object
// Clase padre, superclase o clase base

public class Vehiculo {

    private String bastidor;
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;
    private boolean disponible;

   
    @Override
    public String toString() {
        return "Vehiculo{" + "bastidor=" + bastidor + ", matricula=" + matricula + ", marca=" + marca + "modelo=" + modelo + ", color=" + color + ", tarifa=" + tarifa + ", disponible=" + disponible + '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        
        if (Double.doubleToLongBits(this.tarifa) != Double.doubleToLongBits(other.tarifa)) {
            return false;
        }
        if (this.disponible != other.disponible) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        if (!Objects.equals(this.bastidor, other.bastidor)) {
            return false;
        }
        return true;
    }

    
    public Vehiculo(String bastidor, String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        this.bastidor = bastidor;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
        
    }
    
    public Vehiculo(){
        this.bastidor = "1111";
        this.matricula = "0000 AAA";
        this.marca = "Sin marca";
        this.modelo = "Sin modelo";
        this.color = "Sin color";   
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void metodoVehiculo(){
        System.out.println("Método de vehículo");
    }
    
    
    public void arrancar(){
        
        System.out.println("El vehiculo con el bastidor"+this.bastidor +" esta arrancado");
    }
    
     public void apagar(){
        
        System.out.println("El vehiculo con el bastidor"+this.bastidor +" esta apagado");
    }
}
