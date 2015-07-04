package lexosoft.chef;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;


public class Register extends ActionBarActivity {

    public String Username;
    public String Password;
    public String Email;
    public boolean Accept;
    public CheckBox IAgree;
    public Button Register;
    public EditText EmailEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.Register_ActionBar);
            setSupportActionBar(toolbar);
        Register = (Button) findViewById(R.id.Register_register);
            Register.setOnClickListener(RegisterONClick);
        Button GotoLogin = (Button) findViewById(R.id.IHAA);
            GotoLogin.setOnClickListener(OpenLogin);
        IAgree = (CheckBox) findViewById(R.id.IAgree);
            IAgree.setOnCheckedChangeListener(OnAgreeChanged);
        EmailEditor = (EditText) findViewById(R.id.Register_Email);
            EmailEditor.addTextChangedListener(Validate_Email);
        //TODO:Complete
    }

    public TextWatcher Validate_Email = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {

        }
        //TODO:Complete This
    };

    public TextWatcher Check_Password = new TextWatcher() {

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {

        }
        //TODO:Complete This
    };

    public CompoundButton.OnCheckedChangeListener OnAgreeChanged = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            Accept = isChecked;
            //TODO:ENABLE AND DISABLE THE REGISTER BUTTOn
            Register.setEnabled(Accept);
        }
    };

    public View.OnClickListener RegisterONClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //TODO:Code Online Register
            //TODO:Goto Home Activity
        }
    };

    public View.OnClickListener OpenLogin = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //TODO:GOTO Login Activity
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_register, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }
}
