/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Interface.MathConstants;

/**
 *
 * @author onurd
 */
public class Circle implements MathConstants {
    private double radius=1.0;
    public double getCircumference(){
        return 2*PI*radius;
    }
}
