/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.abtracta;

import objetos.escudoDanios;
import objetos.armaDanios;
import objetos.aspectoDanios;
import objetos.arma;
import objetos.escudo;
import objetos.aspecto;

/**
 *
 * @author Kevin Garcia
 */
public class fabricaDaños implements fabricaAbstracta{

    @Override
    public arma crearArma() {
        return new armaDanios();
    }

    @Override
    public escudo crearEscudo() {
        return new escudoDanios();
    }

    @Override
    public aspecto crearAspecto() {
        return new aspectoDanios();
    }
    
}
