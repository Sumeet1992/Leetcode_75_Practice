package org.sumeet.miscellaneous;

import java.io.Serializable;

public class Singleton implements Serializable {

    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    protected Singleton readResolve(){
        return instance;
    }

}
