package ejbm.mac.com.asynctaskexample;

import android.os.AsyncTask;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/*import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
*/

/**
 * Created by admin on 2/2/2016.
 */
public class DownloadWebPageTask extends AsyncTask<String, Void, String> {
    private TextView textView ;

    public DownloadWebPageTask () {}

    public DownloadWebPageTask ( TextView tv) {
        textView = tv ;
    }



    @Override
    protected String doInBackground(String... urls) {
        String response = "";
/*        for (String url : urls) {
            DefaultHttpClient client = new DefaultHttpClient();
            HttpGet httpGet = new HttpGet(url);
            try {
                HttpResponse execute = client.execute(httpGet);
                InputStream content = execute.getEntity().getContent();

                BufferedReader buffer = new BufferedReader(new InputStreamReader(content));
                String s = "";
                while ((s = buffer.readLine()) != null) {
                    response += s;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return response;
*/

        response = "" + System.currentTimeMillis() ;
        try {

            Thread.sleep( 5 * 1000 );

        } catch ( Exception ex ) { ex.printStackTrace();  }

        return response + " - " + System.currentTimeMillis() ;
    }

    @Override
    protected void onPostExecute(String result) {
        textView.setText(result);
    }
}