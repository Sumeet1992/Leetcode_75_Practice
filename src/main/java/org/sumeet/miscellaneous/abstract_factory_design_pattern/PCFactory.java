package org.sumeet.miscellaneous.abstract_factory_design_pattern;

public class PCFactory extends ComputerAbstractFactory{

    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu){
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }


    @Override
    public Computer createComputer() {

        return new PC(ram, hdd, cpu);
    }
}
