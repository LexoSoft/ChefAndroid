package lexosoft.chef;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Splash extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //set Title Typeface
            TextView Title = (TextView) findViewById(R.id.SplashTitle);
            Typeface face = Typeface.createFromAsset(getAssets(), "fonts/Pacifico.ttf");
            Title.setTypeface(face);
        //Add Delay Handler
            final int SPLASH_DISPALY_LONG = 800 ; //in miliseconds
            new Handler().postDelayed(
              new Runnable() {
                  @Override
                  public void run() {
                        Intent mainIntent = new Intent(Splash.this , Register.class);
                        startActivity(mainIntent);
                        finish();
                  }
              } , SPLASH_DISPALY_LONG
            );
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_splash, menu);
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
