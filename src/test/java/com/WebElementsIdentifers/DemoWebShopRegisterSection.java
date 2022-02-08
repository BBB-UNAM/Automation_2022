package com.WebElementsIdentifers;

public class DemoWebShopRegisterSection {
    //***********************Personal details**********************
    //Gender (Male - female)
    public static String idLisyBoxMale = "gender-male";
    public static String idListBoxFemale = "gender-female";

    public static String idFirstName = "FirstName";
    public static String idLastName = "LastName";
    public static String xpathEmail = "//input[@name='Email']";

    //***********************Your password**********************
    public static String idPassword = "Password";
    public static String idConfirmPass = "ConfirmPassword";

    //Register button
    public static String idRegisterButton = "register-button";

    //***********************Register Confirmation***********************
    public static String xpathRegisterMessage = "//div[contains(text(),'Your registration completed')]";
    public static String xpathContinueButton= "//input[@value='Continue']";
}
