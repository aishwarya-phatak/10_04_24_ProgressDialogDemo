package in.bitcode.a10_04_24_progressdialogdemo;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;

public class DownloadThread extends AsyncTask<String, Integer, Float> {
    Handler handler;
    Context context;

    ProgressDialog progressDialog;

    public DownloadThread(Context context, Handler handler){
        this.context = context;
        this.handler = handler;
    }
    @Override
    protected Float doInBackground(String... strings) {


        return null;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(Float result) {
        super.onPostExecute(result);
        Message message = new Message();
        message.what = 1;
        message.obj = result;
        handler.sendMessage(message);
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        Message message = new Message();
        message.what = 2;
        message.obj = values;
        handler.sendMessage(message);
    }
}