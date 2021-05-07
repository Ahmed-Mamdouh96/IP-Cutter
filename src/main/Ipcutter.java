/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author lenovo
 */
public class Ipcutter {
    
 private String thenumber;

    public String getThenumber() {
        return thenumber;
    }

    public void setThenumber(String thenumber) {
        this.thenumber = thenumber;
    }
 
 
  
     public void doCutter ()
     {
        // this.thenumber=thenumber;
         String [] input = thenumber.split("\\.");
         
          for (int i = 0; i < input.length; i++)
            System.out.print(input[i] + "\n");       
      }
   
}
