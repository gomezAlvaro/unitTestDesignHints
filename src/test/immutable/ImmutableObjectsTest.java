package immutable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.when;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ImmutableObjectsTest {
    @InjectMocks
    private ImmutableObjects immutableObjects;
    @Mock
    private SpeedCalculator speedCalculator;

    @Test
    public void test_calculateIt() {
        when(speedCalculator.calculateSpeed(any())).thenReturn(33);

        Dog dog = new Dog("Bobby", 0);
        int speed = immutableObjects.calculateIt(dog);
        assertEquals(33, speed);
    }
}