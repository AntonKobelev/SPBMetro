import core.Line;
import core.Station;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class RouteCalculatorTest extends TestCase {


    List<Station> route; // creating variable List route with type Station for test


    @Override
    protected void setUp() throws Exception { // creating method setUp for initialize data
        route  = new ArrayList<>(); // initialize List route

        Line line1 = new Line(1, "Первая"); // creating line1
        Line line2 = new Line(2, "Вторая"); // creating line2
        route.add(new Station("Петровская", line1)); // add new station to the array
        route.add(new Station("Арбузная", line1));
        route.add(new Station("Морковная", line2));
        route.add(new Station("Яблочная", line2));

    }

    public void testCalculateDuration(){ // creating method testCalculateDuration
        double actual = RouteCalculator.calculateDuration(route); // creating variable actual, from class RouteCalculator call method calculateDuration with argument route
        double expected = 8.5; // creating expected result
        assertEquals(actual, expected); // return method assertEquals
    }


    @Override
    protected void tearDown() throws Exception { // creating method for deleting data

    }
}
