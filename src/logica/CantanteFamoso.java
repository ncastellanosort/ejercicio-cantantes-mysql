/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Nicolas
 */
public class CantanteFamoso{

    private String nombre;
    private String discoConMasVentas;
    private int totalVentas;

    public CantanteFamoso() {

    }

    public CantanteFamoso(String nombre, String discoConMasVentas, int totalVentas) {
        this.nombre = nombre;
        this.discoConMasVentas = discoConMasVentas;
        this.totalVentas = totalVentas;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiscoConMasVentas() {
        return discoConMasVentas;
    }

    public void setDiscoConMasVentas(String discoConMasVentas) {
        this.discoConMasVentas = discoConMasVentas;
    }

    public int getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(int totalVentas) {
        this.totalVentas = totalVentas;
    }


}
