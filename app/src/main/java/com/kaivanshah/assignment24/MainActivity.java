package com.kaivanshah.assignment24;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;


public class MainActivity extends AppCompatActivity {

    Button btn_Show, btn_Hide;
    ImageView img_View;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Show = (Button) this.findViewById(R.id.btn_Show);
        btn_Hide = (Button) this.findViewById(R.id.btn_Hide);
        btn_Show.setVisibility(View.INVISIBLE);
        img_View = (ImageView) this.findViewById(R.id.img_View);
        btn_Hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_View.setVisibility(View.INVISIBLE);
                btn_Show.setVisibility(View.VISIBLE);
                btn_Hide.setVisibility(View.INVISIBLE);

            }
        });

        btn_Show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_View.setVisibility(View.VISIBLE);
                btn_Show.setVisibility(View.INVISIBLE);
                btn_Hide.setVisibility(View.VISIBLE);
            }
        });

    }


}
