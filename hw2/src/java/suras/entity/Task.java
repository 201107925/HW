/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suras.entity;
import java.util.Date;



public class Task {
    
    sura sura;
    String type;
    boolean completed;
    int fromAya;
    int toAya;
    int id;
    Date duedate ;
  
    public void Task( sura sura,Date date , String type, boolean completed, int fromAya, int toAya, int id, Date duedate){
        this.sura = sura;
        this.type = type;
        this.completed = completed;
        this.fromAya = fromAya;
        this.toAya = toAya;
        this.id = id;
        this.duedate = duedate;
     
        
    }
    
    public String getType(){
        return type;
    }
     public void setType(String type){
        this.type = type;
    }
      public sura getSura(){
        return sura;
    }
      
     public void setSura(sura sura){
        this.sura = sura;
    }    
     
     public void setId(int id){
         this.id = id;
     }
     
     public int getId(){
         return id;
     }
}
