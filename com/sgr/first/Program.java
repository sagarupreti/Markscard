package com.sgr.first;

import com.sgr.first.util.Marksheet;

public class Program{
    public static void main(String[] args){
        String[] subjects={"Physics:","Sociology:","Linguistics:","English:","Computer:"};
        Marksheet ms=new Marksheet(subjects);
        ms.entry();
        if(ms.isFail()){
            System.out.println("You have failed");
        }else{
            System.out.println("Total:"+ms.getTotal());
            System.out.println("Percentage:"+ms.getPercentage());
            ms.getGread();
        }
    }
}

 