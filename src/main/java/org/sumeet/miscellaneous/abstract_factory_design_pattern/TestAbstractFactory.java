package org.sumeet.miscellaneous.abstract_factory_design_pattern;

public class TestAbstractFactory {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2GB", "512GB", "2.4GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("2GB", "1TB", "2.4GHz"));

        System.out.println(pc.getClass().getName());
        System.out.println(server.getClass().getName());
    }

}
