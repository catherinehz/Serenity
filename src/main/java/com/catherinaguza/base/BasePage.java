package com.catherinaguza.base;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;
import java.util.Random;

public class BasePage extends PageObject {

    //select random value from the option list
    protected static String selectOption = "//div[contains(text(), '%s')]";

    //method for getting random value from the list
    protected WebElementFacade getRandomSelectOption(List<WebElementFacade> availableOptions) {
        String randomOption = availableOptions.get(
                new Random().nextInt(availableOptions.size()-1))
                .getText();
        return findBy(String.format(selectOption, randomOption));
    }



    protected WebElementFacade getSelectOption(String value) {
        //String format for dynamic string %s
        return findBy(String.format(selectOption, value));
    }

}
