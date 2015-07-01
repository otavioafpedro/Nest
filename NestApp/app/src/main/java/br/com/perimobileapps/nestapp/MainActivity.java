package br.com.perimobileapps.nestapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;




public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView btn = (ImageView) findViewById(R.id.imageButton);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Uri uri = Uri.parse("http://www.nestapp.com.br");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }
}
