package com.meesho.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {
    public static void main(String[] args) {
        try{
            //create object mapper
            ObjectMapper mapper = new ObjectMapper();

            //read JSON file and map to JAVA POJO
            Student student = mapper.readValue(new File("data/sample-lite.json"), Student.class);

            //print first and last name
            System.out.println("First Name: " + student.getFirstName());
            System.out.println("Last Name: " + student.getLastName());

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
