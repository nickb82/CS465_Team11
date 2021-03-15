/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TS;

/**
 *
 * @author Nick and Robel
 */
public class TransactionServerProxy {

   public void openTransaction(int transID) {

   }

   public void closeTransaction(int transID) {

   }

   public void read(Accounts acctNum) {
      acctNum.getBalance();
   }

   public void write(Accounts acctNum, int amount) {
      if (amount < 0) {
         acctNum.withdraw(amount);
      }

      else if (amount > 0) {
         acctNum.deposit(amount);
      }

   }

}
