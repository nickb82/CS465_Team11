/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TS;

import java.io.IOException;
import java.net.ServerSocket;

/**
 *
 * @author Nick and Robel
 */
public class TransactionServer 
{
   public void openTransaction(int transID) 
   {

   }

   public void closeTransaction(int transID) 
   {

   }

   public void run()
   {
      
      try(ServerSocket serverSocket = new ServerSocket())
      {
         
      }
      
      catch(IOException ioe)
      {
         System.out.println(ioe);
      }
         
   }

}