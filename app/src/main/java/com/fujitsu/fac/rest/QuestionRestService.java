package com.fujitsu.fac.rest;

import com.fujitsu.fac.constants.RestConstants;
import com.fujitsu.fac.utils.StreamUtil;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONObject;

import java.io.InputStream;

/**
 * Created by b.balote on 9/25/2017.
 */

public class QuestionRestService {

    public QuestionRestService() {
    }

    public String postQuestion(int uId, String question) {

        System.out.println("@ postAttendee()");
        System.out.println(question);

        InputStream inputStream = null;
        String result = "";

        try {

            HttpClient httpClient = new DefaultHttpClient();
            HttpPost httpPost = new HttpPost(RestConstants.QUESTION_URL);

            JSONObject jo = new JSONObject();
            jo.accumulate("uId", uId);
            jo.accumulate("qstn", question);

            StringEntity se = new StringEntity(jo.toString());

            httpPost.setEntity(se);

            httpPost.setHeader("Accept", "application/json");
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
