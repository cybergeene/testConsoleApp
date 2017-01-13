package com.company;

import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String xml;
        saxPars sa = new saxPars();
        xml = sa.getXMLasString();
    }
}
class saxPars{
    String getXMLasString(){
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("resp.xml");
        Scanner s = new Scanner(inputStream).useDelimiter("\\A");
        String result = s.hasNext() ? s.next() : "";
        return result;
    }
}
