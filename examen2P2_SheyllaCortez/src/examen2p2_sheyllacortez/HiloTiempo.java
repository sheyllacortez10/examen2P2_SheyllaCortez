/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_sheyllacortez;

import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;
import javax.swing.plaf.ProgressBarUI;

/**
 *
 * @author DELL
 */
public class HiloTiempo extends Thread{
   private JLabel tiempo;
   private boolean vivir;
   private JProgressBar barra1;
   private JProgressBar barra2;

    public HiloTiempo(JLabel tiempo, boolean vivir, JProgressBar barra1, JProgressBar barra2) {
        this.tiempo = tiempo;
        this.vivir = vivir;
        this.barra1 = barra1;
        this.barra2 = barra2;
    }

    public JLabel getTiempo() {
        return tiempo;
    }

    public void setTiempo(JLabel tiempo) {
        this.tiempo = tiempo;
    }

    public boolean isVivir() {
        return vivir;
    }

    public void setVivir(boolean vivir) {
        this.vivir = vivir;
    }

    public JProgressBar getBarra1() {
        return barra1;
    }

    public void setBarra1(JProgressBar barra1) {
        this.barra1 = barra1;
    }

    public JProgressBar getBarra2() {
        return barra2;
    }

    public void setBarra2(JProgressBar barra2) {
        this.barra2 = barra2;
    }

    @Override
    public void run() {
        int segundos = 0;
        int minutes = 0;
        while (vivir) {
            
            //cronómetro
            segundos = segundos + 1;
            if (segundos == 59) {
                minutes = minutes + 1;
                segundos = 0;
            }
            tiempo.setText(minutes + ":" + segundos);
            
            //fin cronómetro
            
            //progressBar
            barra1.setValue(barra1.getValue() + 1);

            barra2.setValue(barra2.getValue() + 1);


            //Fin
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }


}
