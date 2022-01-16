import com.company.TriangleClassifier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    @Test
    @DisplayName("222")
    public void triAngleTest222(){
        String expectedString = "Is equilateral triangle";
        String actualString = TriangleClassifier.triangle(2,2,2);
        assertEquals(expectedString, actualString);
    }
    @Test
    @DisplayName("223")
    public void triAngleTest223(){
        String expectedString = "Is isosceles triangle";
        String actualString = TriangleClassifier.triangle(2,2,3);
        assertEquals(expectedString, actualString);
    }
    @Test
    @DisplayName("345")
    public void triAngleTest345(){
        String expectedString = "Is right triangle";
        String actualString = TriangleClassifier.triangle(3,4,5);
        assertEquals(expectedString, actualString);
    }
    @Test
    @DisplayName("012")
    public void triAngleTest012(){
        String expectedString = "Is not a triangle";
        String actualString = TriangleClassifier.triangle(0,1,2);
        assertEquals(expectedString, actualString);
    }
}
