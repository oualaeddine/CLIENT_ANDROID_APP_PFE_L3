package berrehal_rahab_benghezal.pfe.l3app_client.ui.activities.auth;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import berrehal_rahab_benghezal.pfe.l3app_client.R;
import berrehal_rahab_benghezal.pfe.l3app_client.api.AuthApi;
import berrehal_rahab_benghezal.pfe.l3app_client.system.ActivitiesManager;
import berrehal_rahab_benghezal.pfe.l3app_client.system.VolleyCallback;
import berrehal_rahab_benghezal.pfe.l3app_client.system.managers.SharedPreferencesManager;
import berrehal_rahab_benghezal.pfe.l3app_client.system.model.util.MyCredentials;


public class LoginActivity extends AppCompatActivity {

    private Button connect;
    private EditText inputEmail, inputPassword;
    private TextInputLayout inputLayoutEmail, inputLayoutPassword;
    //private TextView forgotPassword;
    private TextView forgotPassword;
    private ImageView cover;
    private ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (new SharedPreferencesManager(this).isLoggedIn())
            new ActivitiesManager(this).startMain();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        initWidgets();
        //initTextInputListeners();
        initOnClickListeners();
    }


    private void initWidgets() {
        forgotPassword = findViewById(R.id.forgot);
        connect = findViewById(R.id.button);
        inputEmail = findViewById(R.id.input_email);
        inputPassword = findViewById(R.id.input_pass);
        inputLayoutEmail = findViewById(R.id.input_layout_phone);
        inputLayoutPassword = findViewById(R.id.input_layout_pass);
        // cover = findViewById(R.id.photo);
     /*   Glide.with(this)
                .load("")
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .crossFade()
                .fitCenter()
                .dontAnimate()
                .skipMemoryCache(true)
                .placeholder(R.drawable.back_moda)
                .into(cover);
        Glide.with(this)
                .load("")
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .crossFade()
                .fitCenter()
                .dontAnimate()
                .skipMemoryCache(true)
                .placeholder(R.drawable.logo)
                .into(((ImageView) findViewById(R.id.imageView2)));
*/

    }

    private void initTextInputListeners() {
        inputEmail.addTextChangedListener(new MyTextWatcher(inputEmail));
        inputPassword.addTextChangedListener(new MyTextWatcher(inputPassword));
    }

    private void initOnClickListeners() {
        findViewById(R.id.tv_signup_link).setOnClickListener(view -> startActivity(new Intent(LoginActivity.this, SignupActivity.class)));

        connect.setOnClickListener(v -> userLoginRequest(inputEmail.getText().toString(), inputPassword.getText().toString()));

        forgotPassword.setOnClickListener(view -> startActivity(new Intent(LoginActivity.this, ForgotPasswordActivity.class)));

    }

    private void userLoginRequest(final String email, final String password) {
        if (!validateEmail()) {
            return;
        }
        if (!validatePass()) {
            return;
        }
        showProgressDialogWithTitle();
        MyCredentials myCreds = new MyCredentials();
        myCreds.setPassword(password);
        myCreds.setUsername(email);
        new AuthApi(LoginActivity.this).login(
                new VolleyCallback() {
                    @Override
                    public void onSuccess(String result) {
                        try {
                            JSONObject obj = new JSONObject(result);
                            if (obj.getString("exists").equals("1")) {
                                SharedPreferencesManager preferencesManager = new SharedPreferencesManager(LoginActivity.this);
                                preferencesManager.setUserId(Integer.parseInt(obj.getString("userId")));
                                preferencesManager.setPassword(obj.getString("password"));

                                new ActivitiesManager(LoginActivity.this).startMain();
                            } else
                                Toast.makeText(LoginActivity.this, "auth error", Toast.LENGTH_SHORT).show();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onFailed(String result) {

                    }
                }, email, password);
    }

    private boolean validateEmail() {
        Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
        Matcher m = p.matcher(inputEmail.getText().toString());
        boolean matchFound = m.matches();
        if (matchFound) {
            //your work here
            inputLayoutEmail.setErrorEnabled(false);
            return true;
        } else {
            requestFocus(inputEmail);
            //inputLayoutName.setErrorEnabled(true);
            inputEmail.setError("email incorrect ");
            return false;
        }
    }

    private boolean validatePass() {
        if (inputPassword.getText().toString().trim().isEmpty() || inputPassword.getText().length() < 8) {
            requestFocus(inputPassword);
            inputPassword.setError("mot de passe incorrecte ");
            return false;
        } else {
            inputLayoutPassword.setErrorEnabled(false);
        }
        return true;
    }

    private void requestFocus(View view) {
        if (view.requestFocus()) {
            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
        }
    }

    private void showProgressDialogWithTitle() {
        progressDialog = new ProgressDialog(this);
        progressDialog.setCancelable(false);
        progressDialog.setTitle("veuillez patienter un moment ");
        progressDialog.setMessage("authentification en cours ");
        progressDialog.show();

        // To Dismiss progress dialog
        //progressDialog.dismiss();
    }

    private class MyTextWatcher implements TextWatcher {

        private View view;

        private MyTextWatcher(View view) {
            this.view = view;
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        }

        public void afterTextChanged(Editable editable) {
            switch (view.getId()) {
                case R.id.input_email:
                    validateEmail();
                    break;
                case R.id.input_pass:
                    validatePass();
                    break;
            }
        }
    }
}
