/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sura.Repository;
import com.google.gson.Gson;
import com.sun.javafx.scene.control.skin.VirtualFlow;

import suras.entity.sura;
import suras.entity.Task;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import javax.ejb.Singleton;

@Singleton
public class TaskRepo {
    
    private List<Task> tasks;
    private int lastId = 0;
    private final String surasUrl = "http://erradi.github.io/surahs.js";
    

    
     public void addTask(Task task) {
        if ( tasks == null) {
            tasks = new ArrayList<Task>();
        }
        else{
           tasks.add(++lastId,task);
        }
    }
     
     /* public void updateSura(sura sura) {
        for (int i = 0; i < suras.size(); i++) {
            if (suras.get(i).getId() == sura.getId()) {
               suras.set(i, sura);
               break;
            }
        }
    }*/
         public void deleteSura(int contactId) {
        tasks.removeIf(c -> c.getId() == contactId);
    }

    public Task getSura(int id) {
        return tasks.stream().filter(c -> c.getId() == id).findFirst().get();
    }
    
    //-------------Gson----------------------
    /*   public List<sura> getSuras() {
        if (suras != null) {
            return contacts;
        }
        else {
            insertTestData();
            return contacts;
        }
    }*/
   /* private void insertTestData() {
        if (tasks != null && tasks.size() > 0) {
            return;
        }
        
        Gson gson = new Gson();
        String suraStr = Utils.readUrl(surasUrl);
        System.out.println(suraStr);

        sura[] contactArray = gson.fromJson(suraStr, sura[].class);
        //Convert the array to a editable list 
        contacts = new ArrayList<>(Arrays.asList(contactArray));
        lastContactId = contacts.size();
    }*/
       
    public List<sura> getSuras(){
        List<sura> sura= new ArrayList();
           Gson gson = new Gson();
        String suraStr = Utils.readUrl(surasUrl);
        System.out.println(suraStr);
         
          sura[] suraArray = gson.fromJson(suraStr, sura[].class);
        //Convert the array to a editable list 
        List<sura> suras = new ArrayList<>(Arrays.asList(suraArray));
       return suras;
        
    }
       
}
