package in.bitcode.a10_04_24_progressdialogdemo;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnDownload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDownload = findViewById(R.id.btnDownload);
        btnDownload.setOnClickListener(new BtnDownloadClickListener());
    }

    class BtnDownloadClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            String [] fileUrls = {
                    "file1",
                    "file2",
                    "file3",
                    "file4"
            };
            new DownloadThread().execute(fileUrls);
        }
    }

    class DownloadThread extends AsyncTask<String, Integer, Float>{

        @Override
        protected Float doInBackground(String... fileUrls) {
            for (String fileUrl:fileUrls) {

            }

            return null;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
            progressDialog.setTitle("Download");
            progressDialog.setMessage("This is Progress Dialog");
            progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
            progressDialog.show();
        }

        @Override
        protected void onPostExecute(Float aFloat) {
            super.onPostExecute(aFloat);
            btnDownload.setText("");
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
        }
    }
}