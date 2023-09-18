package org.example;

import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> logininfo = new HashMap<String, String>();

    IDandPasswords(){
        logininfo.put("Bro", "pizza");
        logininfo.put("Zuly", "CEVICHE");
        logininfo.put("Ludo", "chocolat");
    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
