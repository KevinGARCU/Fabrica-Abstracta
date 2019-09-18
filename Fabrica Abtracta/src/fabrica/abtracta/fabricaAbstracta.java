/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.abtracta;

import objetos.arma;
import objetos.escudo;
import objetos.aspecto;

/**
 *
 * @author Kevin Garcia
 */
public interface  fabricaAbstracta {   
    public abstract arma crearArma();
    public abstract escudo crearEscudo();
    public abstract aspecto crearAspecto();
    
}
