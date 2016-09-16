package com.abc.gson;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by Sumedha on 9/15/2016.
 */
public class GsonParser {

    public static void main(String[] args) throws FileNotFoundException {

        FileReader reader  =new  FileReader("src/main/resources/call.json");
        Gson gson = new Gson();
        Gobject calls = gson.fromJson(reader,Gobject.class);
        System.out.println(calls.getCalls().getCall().getCallid().get$());
        System.out.println(calls.getCalls().getXmlns().get$());
        System.out.println(calls.getCalls().getCall().getUrl().get$());
        System.out.println("\u0040");
/*
        Xmlns xmlns = new Xmlns();
        xmlns.set$("http:\\/\\/schema.broadsoft.com\\/xsi");
        Uri url = new Uri();
        url.set$("\\/v2.0\\/user\\/us5000testv2@nextiva.com\\/calls\\/callhalf-8506475:0");

        CallId callid = new CallId();
        callid.set$("callhalf-8506475:0");
        Call call = new Call();
        call.setCallid(callid);
        call.setUrl(url);
        call.setInConference("false");

        Calls calls = new Calls();
        calls.setCall(call);
        calls.setXmlns(xmlns);

        Gobject o = new Gobject();
        o.setCalls(calls);

        String json = gson.toJson(o);
        System.out.println(json);*/


    }
}
