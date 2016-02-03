package ejbm.mac.com.asynctaskexample;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fragment4AsyncTasks extends Fragment {

    private View view ;
    TextView tv = null ;


    public Fragment4AsyncTasks () {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate( R.layout.activity_main , container, false);
          
        return view ;
    }

    public void downloadWP ( String x ) {
        DownloadWebPageTask dwpt = new DownloadWebPageTask (  findById( R.id.TextView01 ) ) ;

        dwpt.execute( "www.url.com : " + x  ) ;


    }

}
