package com.juaracoding.utils.Constans;

import com.juaracoding.drivers.strategies.DriverStrategy;

public class DriverStrategyImplementer {

    public static DriverStrategy chooseStrategy(String strategy){
        switch (strategy){
            case Constans.CHROME:
                return new Chrome();
            case Constans.FIREFOX:
                return new Firefox();
            default:
                return null;
        }
    }
}