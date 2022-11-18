package com.gomezr.fixturecreep;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class FixtureCreep {
    private final Dependency dependency;

    public void changePage() {
        if (!dependency.isPage()) {
            throw new IllegalArgumentException();
        }
        //do complex stuff requiring many tests
    }

    public void changeProduct() {
        if (!dependency.isProduct()) {
            throw new IllegalArgumentException();
        }
        //do complex stuff requiring many tests
    }

}


interface Dependency {
    boolean isProduct();
    boolean isPage();
}