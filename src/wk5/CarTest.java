package wk5;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    public void testDefaultConstructor(){

        Car car = new Car();

        //assert:   ensure that statement is true

        assertNotNull(car);
        assertEquals("black", car.getColor());
        assertTrue(car.getDoors() == 4 && car.getWeight() >= 1000);
        assertInstanceOf(Car.class, car);
    }

    @Test
    public void testConstructor3Arguments(){
        Car car = new Car("yellow", 9, 123456);

        assertNotEquals(9, car.getDoors());
        assertEquals("yellow", car.getColor());
    }

    @Test
    public void testSetWeightFixedValue(){

        Car car = new Car();
        assertEquals(1000, car.getWeight());
        car.setWeight(12345);
        assertEquals(12345, car.getWeight());
    }

    @ParameterizedTest
    @ValueSource(doubles = {12345, 23456, 34567})
    public void testSetWeightDynamicValues(double weight){
        Car car = new Car();
        car.setWeight(weight);
        assertEquals(weight, car.getWeight());
    }

    @ParameterizedTest
    @CsvSource({ "purple,5,10500", "gold,4,20200", "beige,2,45678"   })
    public void test3ArgConstructorDynamic(String color, int doors, double weight){
        Car car = new Car(color, doors, weight);

        assertEquals(color, car.getColor());
        assertEquals(weight, car.getWeight());
        assertEquals(doors, car.getDoors());
    }
}
