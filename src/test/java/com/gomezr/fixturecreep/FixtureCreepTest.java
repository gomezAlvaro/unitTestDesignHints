package com.gomezr.fixturecreep;

import static org.mockito.Mockito.when;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class FixtureCreepTest {
    @Mock
    Dependency dependency;
    @InjectMocks
    FixtureCreep fixtureCreep;

    @BeforeEach
    public void before() {
        when(dependency.isPage()).thenReturn(true);
    }


    @Test
    public void test_pageChanges1() {
        fixtureCreep.changePage();
        //assert some stuff
    }

    @Test
    public void test_pageChanges2() {
        fixtureCreep.changePage();
        //assert some stuff
    }

    @Test
    public void test_pageChanges3() {
        fixtureCreep.changePage();
        //assert some stuff
    }

}

@ExtendWith(MockitoExtension.class)
class FixtureCreepProductTest {
    @Mock
    Dependency dependency;
    @InjectMocks
    FixtureCreepProduct fixtureCreep;

    @BeforeEach
    public void before() {
        when(dependency.isProduct()).thenReturn(true);
    }


    @Test
    public void test_pageChanges1() {
        fixtureCreep.changeProduct();
        //assert some stuff
    }
    @Test
    public void test_pageChanges2() {
        fixtureCreep.changeProduct();
        //assert some stuff
    }
}