/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Kevin Garcia
 */
public class arma {
    
    ImageIcon imagen;
    public String ubicacion;
    public String descripcion;
    
    public ImageIcon dibujar(){
       imagen = new ImageIcon(getClass().getResource(ubicacion));
       return imagen;
       
    }
}
