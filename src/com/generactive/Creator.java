package com.generactive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Creator {

    public static void createGroup() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please input the name of the group or 'continue'!!!");
        String name = reader.readLine();
        if(name.equals("continue")){
            createItem();
            reader.close();
            return;
        }
        System.out.println("Please input 'ID' of the group '" + name + "'!!!");
        int id = Integer.parseInt(reader.readLine());
        System.out.println("Please input imageURL of the group - '" + name + "', ID- " + id + " !!!");
        String imageURL = reader.readLine();
        System.out.println("Please input 'ID' of the parent group -" + name + "'  or press Enter!!!");
        String strParentId = reader.readLine();
        int parentId = 0;
        if(!strParentId.equals("")){
            parentId = Integer.parseInt(strParentId);
        }
        Group group = new Group(parentId, id, name, imageURL);
        Database.allGroups.add(group);
        System.out.println(group);
        for (int i = 0; i < Database.allGroups.size(); i++) {
            if(parentId == Database.allGroups.get(i).getId()){
                Database.allGroups.get(i).getSubGroups().add(group);
            }
        }
        System.out.println("Group is created!!!");
        Printer.printAll();
        //reader.close();
        createGroup();
    }

    public static void createItem() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please input the name of the item   or  'exit'  !!!");
        String name = reader.readLine();
        if(name.equals("exit")){
            Printer.printAll();
            //reader.close();
            return;
        }
        System.out.println("Please input 'ID' of the item '" + name + "'!!!");
        int id = Integer.parseInt(reader.readLine());
        System.out.println("Please input 'ID' of the parent group '" + name + "', ID- " + id + " !!!");
        int parentID = Integer.parseInt(reader.readLine());
        System.out.println("Please input imageURL of the item  '" + name + "', ID- " + id + " !!!");
        String imageURL = reader.readLine();
        System.out.println("Please input price of the item  '" + name + "', ID- " + id + " !!!");
        double price = Double.parseDouble(reader.readLine());
        System.out.println("Please input currency of the price of the item  '" + name + "', ID- " + id + " !!!");
        Currency currency = Currency.valueOf(reader.readLine());
        Item item = new Item(parentID, id, name, imageURL, price, currency);
        Database.allItems.add(item);
        System.out.println(item);
        for (int i = 0; i < Database.allGroups.size(); i++) {
            if(id == Database.allGroups.get(i).getId()){
                Database.allGroups.get(i).getItems().add(item);
            }
        }
        System.out.println("Item is created!!!");
        Printer.printAll();
        //reader.close();
        createItem();
    }


}
