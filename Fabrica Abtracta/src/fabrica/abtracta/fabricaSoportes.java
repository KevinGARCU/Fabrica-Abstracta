/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.abtracta;

import objetos.escudoSoportes;
import objetos.armaSoportes;
import objetos.aspectoSoportes;
import objetos.arma;
import objetos.escudo;
import objetos.aspecto;

/**
 *
 * @author Kevin Garcia
 */
public class fabricaSoportes implements fabricaAbstracta{

    @Override
    public arma crearArma() {
        return new armaSoportes();
    }

    @Override
    public escudo crearEscudo() {
        return new escudoSoportes();
    }

    @Override
    public aspecto crearAspecto() {
        return new aspectoSoportes();
    }
    
}
