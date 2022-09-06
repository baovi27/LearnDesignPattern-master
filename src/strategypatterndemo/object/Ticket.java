/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategypatterndemo.object;

import strategypatterndemo.interfaces.IPromoteStrategy;

/**
 *
 * @author hoang
 */
public class Ticket {
    private IPromoteStrategy promoteStrategy;
    private double price;
    private String name;

    public IPromoteStrategy getPromoteStrategy() {
        return promoteStrategy;
    }

    public void setPromoteStrategy(IPromoteStrategy promoteStrategy) {
        this.promoteStrategy = promoteStrategy;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ticket(){
        
    }
    
    public Ticket(IPromoteStrategy promoteStrategy){
        this.promoteStrategy = promoteStrategy;
    }
    
    public double getPromotePrice(){
        return promoteStrategy.DoDiscount(price);
    }
}
