package com.fujitsu.fac.rest;

import com.fujitsu.fac.constants.RestConstants;
import com.fujitsu.fac.domain.Attendee;
import com.fujitsu.fac.utils.StreamUtil;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONObject;

import java.io.InputStream;

/**
 * Created by b.balote on 8/3/2017.
 */

public class AttendeeRegistrationRestService {

    public AttendeeRegistrationRestService() {
    }

    public String postAttendee(Attendee a) {

        System.out.println("@ postAttendee()");
        System.out.println(a.toString());

        InputStream inputStream = null;
        String result = "";

        try {

            HttpClient httpClient = new DefaultHttpClient();
            HttpPost httpPost = new HttpPost(RestConstants.REGISTRATION_URL);

            JSONObject jo = new JSONObject();
            jo.accumulate("nme", a.getName());
            jo.accumulate("email", a.getEmail());
            jo.accumulate("compNme", a.getCompany());
            jo.accumulate("pos", a.getPosition());
            jo.accumulate("phne", a.getPhone());
            jo.accumulate("mobile",a.getMobile());

            StringEntity se = new StringEntity(jo.toString());

            httpPost.setEntity(se);

            //httpPost.setHeader("Accept", "application/json");
            httpPost.setHeader("Content-type", "application/json");
            httpPost.setHeader("Origin", RestConstants.API_URL);

            HttpResponse httpResponse = httpClient.execute(httpPost);
            inputStream = httpResponse.getEntity().getContent();

            if (inputStream != null) {
                result = StreamUtil.convertInputStreamToString(inputStream);
            } else {
                result = "Did not work!";
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println(result);
        return result;
    }

}
