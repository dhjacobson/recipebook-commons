package com.dhjacobson.recipebook_commons.enums;

public enum QuantityUnit {

    COUNT(null, null, null, null),
    TEASPOON("teaspoon", "teaspoons", "tsp", "tsps"),
    TABLESPOON("tablespoon", "tablespoons", "Tbsp", "Tbsps"),
    CUP("cup", "cups", "cup", "cups"),
    OUNCE("ounce", "ounces", "oz", "oz"),
    POUND("pound", "pounds", "lb", "ozs");

    private String longName;
    private String longNamePlural;
    private String shortName;
    private String shortNamePlural;

    QuantityUnit(String longName, String longNamePlural, String shortName, String shortNamePlural) {
        this.longName = longName;
        this.longNamePlural = longNamePlural;
        this.shortName = shortName;
        this.shortNamePlural = shortNamePlural;
    }

    public String getLongName() {
        return longName;
    }

    public String getLongNamePlural() {
        return longNamePlural;
    }

    public String getShortName() {
        return shortName;
    }

    public String getShortNamePlural() {
        return shortNamePlural;
    }
}
