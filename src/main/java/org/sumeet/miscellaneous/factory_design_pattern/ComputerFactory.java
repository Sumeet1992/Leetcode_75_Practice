package org.sumeet.miscellaneous.factory_design_pattern;

public class ComputerFactory {

    public static Computer getInstance(String type, String ram, String hdd, String cpu){

        if(type.equals("PC")){
            return new PC(ram, hdd, cpu);
        }
        else if(type.equals("Server")){
            return new Server(ram, hdd, cpu);
        }
        else{
            System.out.println("Invalid type");
        }
        return null;
    }

}
