/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_sheyllacortez;

import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class Carro implements Serializable{
    private String marca = "";
    private String modelo = "";
    private int speed = 0;
    
        
    private static final long SerialVersionUID=444L;

    public Carro() {
    }
       
    public Carro(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.speed = speed;
                
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", modelo=" + modelo + ", speed=" + speed + '}';
    }
}
