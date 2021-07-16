package com.generactive;

public class Printer {
    //Es methody Mi qich chisht chi ashxatum, Der chem hascrel gtnel patchary(((
    //Menak araj subGroupern a tpum
    public static void printAll(){
        for (int i = 0; i < Database.allGroups.size(); i++) {
            if(Database.allGroups.get(i).getParentId() == 0){
                System.out.println("* " + Database.allGroups.get(i).getTitle());
                if(Database.allGroups.get(i).getSubGroups().size() > 0){
                    System.out.println(Database.allGroups.get(i).toStringSubGroups());
                } else {
                    System.out.println(Database.allGroups.get(i).toStringItems());
                }
            }
        }
    }
}
