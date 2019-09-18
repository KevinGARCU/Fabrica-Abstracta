/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.abtracta;

import objetos.arma;
import objetos.aspectoFlancos;
import objetos.escudo;
import objetos.aspecto;
import objetos.escudoFlancos;
import objetos.armaFlancos;

/**
 *
 * @author Kevin Garcia
 */
public class fabricaFlancos implements fabricaAbstracta{

    @Override
    public arma crearArma() {
        return new armaFlancos();
    }

    @Override
    public escudo crearEscudo() {
        return new escudoFlancos();
    }

    @Override
    public aspecto crearAspecto() {
        return new aspectoFlancos();
    }
    
}
