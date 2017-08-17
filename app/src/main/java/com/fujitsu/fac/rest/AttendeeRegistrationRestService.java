package com.fujitsu.fac.rest;

import com.fujitsu.fac.domain.Attendee;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by b.balote on 8/3/2017.
 */

public class AttendeeRegistrationRestService {

    private static final String URL = "http://192.168.58.227:8080/attendee/add";

    public AttendeeRegistrationRestService() {
    }

    public String postAttendee(Attendee a) {

        System.out.println("@ postAttendee()");
        System.out.println(a.toString());

        InputStream inputStream = null;
        String result = "";

        try {

            HttpClient httpClient = new DefaultHttpClient();
            HttpPost httpPost = new HttpPost(URL);

            JSONObject jo = new JSONObject();
            jo.accumulate("firstName", a.getFirstName());
            jo.accumulate("lastName", a.getLastName());
            jo.accumulate("email", a.getEmail());
            jo.accumulate("companyName", a.getCompany());
            jo.accumulate("position", a.getPosition());
            jo.accumulate("phoneNumber", a.getPhone());
            jo.accumulate("role", a.getRole());

            StringEntity se = new StringEntity(jo.toString());

            httpPost.setEntity(se);

            httpPost.setHeader("Accept", "application/json");
            httpPost.setHeader("Content-type", "application/json");
            httpPost.setHeader("Origin", "http://localhost:3000");

            HttpResponse httpResponse = httpClient.execute(httpPost);
            inputStream = httpResponse.getEntity().getContent();

            if (inputStream != null) {
                result = convertInputStreamToString(inputStream);
            } else {
                result = "Did not work!";
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println(result);
        return result;
    }

    private static String convertInputStreamToString(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line = "";
        String result = "";
        while ((line = bufferedReader.readLine()) != null) {
            result += line;
        }
        inputStream.close();
        return result;
    }

}
