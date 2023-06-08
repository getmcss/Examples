package com.dogeniuson.examplelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.dogeniuson.mcss.MCSS;

public class MainActivity extends AppCompatActivity {
    public static final String MCSS_TOKEN = "YOUR_TOKEN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MCSS.getInstance().initialize(this, MCSS_TOKEN);
        MCSS.getInstance().addStyleSheetFromFile("style.mcss.css");
        View view = findViewById(R.id.container);
        MCSS.getInstance().addClass(R.id.container,"container");
        MCSS.getInstance().addClass(R.id.edtUserLogin,"edtUserLogin");
        MCSS.getInstance().addClass(R.id.edtPasswordLogin,"edtPassLogin");
        MCSS.getInstance().addClass(R.id.btnLogin,"btnLogin");
        MCSS.getInstance().addClass(R.id.txtTitle,"txtTitle");
        MCSS.getInstance().setId(R.id.linearOptions,"linear");
        MCSS.getInstance().addClass(R.id.txtDescription,"txtDescription");
        MCSS.getInstance().apply(view);
    }
}