package comrulerofworld.instagram.textview;

import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    public ConstraintLayout mConstraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);

        mConstraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);
    }

    public void onClick(View view) {
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.colorlavender));
    }


}