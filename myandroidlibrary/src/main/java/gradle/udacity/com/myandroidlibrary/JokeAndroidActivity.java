package gradle.udacity.com.myandroidlibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeAndroidActivity extends AppCompatActivity {

    //public static final String JOKE_Key = "Joke_key";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_android);
        //the Intent that started us
        String joke = getIntent().getStringExtra(getString(R.string.AL_JOKE_KEY));
        TextView jokeTextView = (TextView) findViewById(R.id.Joke_View);
        jokeTextView.setText(joke);
    }
}
