package org.sumeet.miscellaneous.abstract_factory_design_pattern;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory comp){
        return comp.createComputer();
    }

}
