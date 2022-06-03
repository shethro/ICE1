/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dancye, 2019
 * Modified by Ronak Sheth
 * Student Number 99999999
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
        Card newObject = new Card("diamonds",10);
        System.out.println(newObject.getSuit());
        System.out.println(newObject.getValue());
        Card newObject1 = new Card("diamonds",5);
        
    }
}
