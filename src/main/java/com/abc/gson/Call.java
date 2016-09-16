package com.abc.gson;

import com.sun.org.apache.xml.internal.dtm.ref.DTMDefaultBaseIterators;

/**
 * Created by Sumedha on 9/15/2016.
 */
public class Call {

    private String inConference;
    private CallId callId;
    private Uri uri;

    public String getInConference() {
        return inConference;
    }

    public CallId getCallid() {
        return callId;
    }

    public Uri getUrl() {
        return uri;
    }

    public void setInConference(String inConference) {
        this.inConference = inConference;
    }

    public void setCallid(CallId callid) {
        this.callId = callid;
    }

    public void setUrl(Uri url) {
        this.uri = url;
    }
}
