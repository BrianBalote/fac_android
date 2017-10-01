package com.fujitsu.fac.activities.registration;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.fujitsu.fac.R;
import com.fujitsu.fac.activities.dashboard.DashboardActivity;
import com.fujitsu.fac.domain.Attendee;
import com.fujitsu.fac.rest.AttendeeRegistrationRestService;
import com.fujitsu.fac.services.EmailPersistenceService;
import com.fujitsu.fac.utils.RegexUtil;
import com.google.inject.Inject;

import roboguice.activity.RoboActivity;
import roboguice.inject.InjectView;

public class RegistrationActivity extends RoboActivity {

    @InjectView(R.id.input_first_name)
    private EditText inputFirstName;

    @InjectView(R.id.input_phone)
    private EditText inputPhone;

    @InjectView(R.id.input_mobile)
    private EditText inputMobile;

    @InjectView(R.id.input_email)
    private EditText inputEmail;

    @InjectView(R.id.input_company)
    private EditText inputCompany;

    @InjectView(R.id.input_position)
    private EditText inputPosition;

    @InjectView(R.id.btn_register)
    private Button registerBtn;

    @Inject
    AttendeeRegistrationRestService attendeeRegistrationRestService;

    private Attendee attendee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        this.registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRegisterBtnClicked();
            }
        });
    }

    private void onRegisterBtnClicked() {

        boolean hasErrors = false;

        String nameStr = inputFirstName.getText().toString();
        String phoneStr = inputPhone.getText().toString();
        String mobileStr = inputMobile.getText().toString();
        String emailStr = inputEmail.getText().toString();
        String companyStr = inputCompany.getText().toString();
        String positionStr = inputPosition.getText().toString();

        if (nameStr == null || nameStr.equalsIgnoreCase("")) {
            inputFirstName.setError("First Name is Required");
            hasErrors = true;
        }

        if ( (phoneStr != null  || !phoneStr.equalsIgnoreCase("")) && !RegexUtil.isValidPhoneNumber(phoneStr)) {
            inputPhone.setError("Phone Number is Invalid");
            hasErrors = true;
        }

        if( (mobileStr != null  || !mobileStr.equalsIgnoreCase("")) && !RegexUtil.isValidMobileNumber(mobileStr)) {
            inputMobile.setError("Invalid Mobile Number");
            hasErrors = true;
        }

        if (!RegexUtil.isValidEmail(emailStr)) {
            inputEmail.setError("Invalid Email");
            hasErrors = true;
        }

        if (companyStr == null || companyStr.equalsIgnoreCase("")) {
            inputCompany.setError("Company is Required");
            hasErrors = true;
        }

        if (positionStr == null || positionStr.equalsIgnoreCase("")) {
            inputPosition.setError("Position is Required");
            hasErrors = true;
        }

        if(nameStr.equalsIgnoreCase("paladin1983"));

        if(!hasErrors) {
            attendee = new Attendee();
            attendee.setFirstName(nameStr);
            attendee.setPhone(phoneStr);
            attendee.setEmail(emailStr);
            attendee.setCompany(companyStr);
            attendee.setPosition(positionStr);
            new HttpAsyncTask().execute("");
        }
    }

    private class HttpAsyncTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... urls) {
            return attendeeRegistrationRestService.postAttendee(attendee);
        }

        @Override
        protected void onPostExecute(String result) {

            EmailPersistenceService.saveEmail(RegistrationActivity.this, inputEmail.getText().toString() );
            openDashboardActivity();
        }
    }

    private void openDashboardActivity() {
        Intent intent = new Intent(RegistrationActivity.this, DashboardActivity.class);
        startActivity(intent);
    }
}
