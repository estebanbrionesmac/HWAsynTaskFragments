package ejbm.mac.com.asynctaskexample;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements  FragmentCoordinator {
    private TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.TextView01);
    }

    @Override
    public void buttonClicked(String msg) {
        FragmentManager fm = getFragmentManager() ;
        Fragment4AsyncTasks f4at = (Fragment4AsyncTasks) fm.findFragmentById( R.id.frg ) ;
        f4at.downloadWP( "XXX");
    }
}
