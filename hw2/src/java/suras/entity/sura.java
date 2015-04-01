/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suras.entity;

/**
 * * @author YJ
 */
public class sura {
    
 private String suraName;
 
    private int ayaCount;
    private int id;
    private String englishName;
    

    public sura(String suraName, int ayaCount, int id,String englishName) {
        this.suraName = suraName;
        this.ayaCount= ayaCount;
        this.id = id;
        this.englishName = englishName;
        
    }

    public sura() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSuraName() {
        return suraName;
    }

    public void setSureName(String suraName) {
        this.suraName = suraName;
    }

    public int getAyaCount() {
        return ayaCount;
    }

    public void setAyacount (int ayaCount) {
        this.ayaCount = ayaCount;
    }

    public String getEnglishName(){
        return englishName;
    }

    public void setEnglishName(String englishName){
        this.englishName = englishName;
    }
}

    

