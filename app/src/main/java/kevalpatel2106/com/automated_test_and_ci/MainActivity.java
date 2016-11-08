package kevalpatel2106.com.automated_test_and_ci;

import android.os.PatternMatcher;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText emailEt = (EditText) findViewById(R.id.email_et);

        findViewById(R.id.btn_validate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!validateEmail(emailEt.getText().toString()))
                    Toast.makeText(MainActivity.this, "Enter valid email address.", Toast.LENGTH_LONG).show();
            }
        });
    }

    public static boolean validateEmail(String emailToValidate) {
        return !(emailToValidate == null || emailToValidate.trim().isEmpty())
                && Patterns.EMAIL_ADDRESS.matcher(emailToValidate).matches();
    }
}
