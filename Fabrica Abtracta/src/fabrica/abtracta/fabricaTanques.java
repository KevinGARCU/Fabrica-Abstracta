/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.abtracta;

import objetos.armaTanques;
import objetos.escudoTanques;
import objetos.aspectoTanques;
import objetos.arma;
import objetos.escudo;
import objetos.aspecto;

/**
 *
 * @author Kevin Garcia
 */
public class fabricaTanques implements fabricaAbstracta{

    @Override
    public arma crearArma() {
        return new armaTanques();
    }

    @Override
    public escudo crearEscudo() {
        return new escudoTanques();
    }

    @Override
    public aspecto crearAspecto() {
        return new aspectoTanques();
    }
    
}
