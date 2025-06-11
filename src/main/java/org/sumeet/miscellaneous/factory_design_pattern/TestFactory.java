package org.sumeet.miscellaneous.factory_design_pattern;

public class TestFactory {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getInstance("PC", "2GB", "512GB", "2.4GHz");
        Computer server = ComputerFactory.getInstance("Server", "2GB", "1TB", "2.4GHz");
        System.out.println(pc.getClass().getName());
        System.out.println(server.getClass().getName());
    }

}
