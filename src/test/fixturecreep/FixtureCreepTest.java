package fixturecreep;

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
        //do stuff
    }

    @Test
    public void test_pageChanges1() {
        when(dependency.isPage()).thenReturn(true);
        fixtureCreep.changePage();
        //assert some stuff
    }

    @Test
    public void test_pageChanges2() {
        when(dependency.isPage()).thenReturn(true);
        fixtureCreep.changePage();
        //assert some stuff
    }

    @Test
    public void test_pageChanges3() {
        when(dependency.isPage()).thenReturn(true);
        fixtureCreep.changePage();
        //assert some stuff
    }

}