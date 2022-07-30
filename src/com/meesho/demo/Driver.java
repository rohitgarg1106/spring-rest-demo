package com.meesho.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {
    public static void main(String[] args) {
        try{
            //create object mapper
            ObjectMapper mapper = new ObjectMapper();

            //read JSON file and map to JAVA POJO
            Student student = mapper.readValue(new File("data/sample-full.json"), Student.class);

            //print first and last name
            System.out.println(student);


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
