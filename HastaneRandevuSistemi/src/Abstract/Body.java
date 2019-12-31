/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author onurd
 */
abstract public class Body {
    public double density=1.0;
    public Body(double d){
        density=d;
    }
    public double getDensity(){
        return density;
    }
    public double getMass(){
        return density*getVolume();
    }
    abstract public double getVolume();
}
