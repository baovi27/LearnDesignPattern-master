/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategypatterndemo.test;

import strategypatterndemo.controller.HalfDiscountStrategy;
import strategypatterndemo.controller.NoDiscountstrategy;
import strategypatterndemo.controller.QuarterDiscountStrategy;
import strategypatterndemo.object.Ticket;

/**
 *
 * @author hoang
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Start getting ticket!");
//        double random = Math.random()*2;
//        int randomInt = (int) random;
        for(int i = 0;i < 5;i++){
            
            double random = Math.random()*3;
            int randomInt = (int) random;
            
            Ticket ticket = new Ticket();
            ticket.setName("Ticket: " + (i + 1));
            ticket.setPrice(i * 50);
            
            switch (randomInt) {
                case 0:
                    ticket.setPromoteStrategy(new HalfDiscountStrategy());
                    break;
                case 1:
                    ticket.setPromoteStrategy(new QuarterDiscountStrategy());
                    break;     
                default:
                    ticket.setPromoteStrategy(new NoDiscountstrategy()); 
                    break;
            }
            
            double priceTicket = ticket.getPromotePrice();
            
            System.out.println("Name: " + ticket.getName() + " | price: " + ticket.getPrice() + " | Real price: " + priceTicket + " | Type discount: " + ticket.getPromoteStrategy().getClass().getName());
        }
    }
    
}
