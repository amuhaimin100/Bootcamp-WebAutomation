package com.amazon.data;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "searchData")
    public Object[] getSearchData() {
        return new Object[]{"PS5", "Lawn Mower", "Panda"};
    }

}

