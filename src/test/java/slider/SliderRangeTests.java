package slider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SliderRangeTests extends BaseTests {

    @Test
    public void testSliderRange(){
        var sliderPage = homePage.clickHorizontalSlider();
        sliderPage.sendLeftArrowKey("4");
        assertEquals(sliderPage.getSliderRangeValue(), "4", "Incorrect Range Result Value.");
    }
}
