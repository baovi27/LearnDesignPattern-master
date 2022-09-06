/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategypatterndemo.controller;

import strategypatterndemo.interfaces.IPromoteStrategy;

/**
 *
 * @author hoang
 */
public class QuarterDiscountStrategy implements IPromoteStrategy {

    @Override
    public double DoDiscount(double price) {
        return price*0.75;
    }
    
}
