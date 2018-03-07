package com.epam.lab.control.elements;

import org.openqa.selenium.WebElement;

public class TextInput extends Element {

    public TextInput(WebElement webElement) {
        super(webElement);
    }

    @Override
    public void sendKeys(CharSequence... charSequences) {
        webElement.sendKeys(charSequences);
    }

}
