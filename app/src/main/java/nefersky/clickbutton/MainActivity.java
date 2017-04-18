package nefersky.clickbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mInfoTextView = (TextView)findViewById(R.id.textViewCrowsCount);
        Button mCrowsCounterButton = (Button)findViewById(R.id.buttonCrowsCounter);
        mCrowsCounterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mInfoTextView.setText( "Я насчитал " + ++mCount + " ворон!");
            }
        });
    }

    public void OnClick(View view) {
        TextView helloTextView = (TextView)findViewById(R.id.textView);
        helloTextView.setText(R.string.helloText);
    }
}
