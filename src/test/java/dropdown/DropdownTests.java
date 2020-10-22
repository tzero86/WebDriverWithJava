package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOption(){
        String option = "Option 1";
        var dropdownPage = homePage.clickDropdown();
        dropdownPage.selectFromDropdown(option);
        var selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }

    @Test
    public void testMultipleSelection(){
        String option1 = "Option 1";
        String option2 = "Option 2";
        var dropdownPage = homePage.clickDropdown();
        dropdownPage.transformDropdownToMultiple();
        dropdownPage.selectFromDropdown(option1);
        dropdownPage.selectFromDropdown(option2);
        assertEquals(dropdownPage.getSelectedOptions().size(), 2, "Incorrect number of selected options.");
        assertTrue(dropdownPage.getSelectedOptions().contains(option1), "Option 1 not present.");
        assertTrue(dropdownPage.getSelectedOptions().contains(option2), "Option 2 not present.");
    }

}
