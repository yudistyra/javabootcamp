/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitrais.cdc.java;

/**
 *
 * @author Yudistyra_OP355
 */
public class DefaultInterfaceTest {

   public static void main(String args[]) {
      Vehicle vehicle = new Car();
      vehicle.print();
   }
}

interface Vehicle {

   default void print() {
      System.out.println("I am a vehicle!");
   }
	
   static void blowHorn() {
      System.out.println("Blowing horn!!!");
   }
}

interface FourWheeler {

   default void print() {
      System.out.println("I am a four wheeler!");
   }
}

class Car implements Vehicle, FourWheeler {

   public void print() {
      Vehicle.super.print();
      FourWheeler.super.print();
      Vehicle.blowHorn();
      System.out.println("I am a car!");
   }
}