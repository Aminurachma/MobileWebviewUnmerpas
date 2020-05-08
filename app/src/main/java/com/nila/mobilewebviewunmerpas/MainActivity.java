package com.nila.mobilewebviewunmerpas;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String KEY_NAME="URL";

    @BindView(R.id.btn1)
    Button btn1;

    @BindView(R.id.btn2)
    Button btn2;

    @BindView(R.id.btn3)
    Button btn3;

    @BindView(R.id.btn4)
    Button btn4;

    @BindView(R.id.btn5)
    Button btn5;

    @BindView(R.id.btn6)
    Button btn6;

    @BindView(R.id.btn7)
    Button btn7;

    @BindView(R.id.btn8)
    Button btn8;

    @BindView(R.id.btn9)
    Button btn9;

    @BindView(R.id.btn10)
    Button btn10;

    @BindView(R.id.btn11)
    Button btn11;

    @BindView(R.id.btn12)
    Button btn12;

    @BindView(R.id.btn13)
    Button btn13;

    @BindView(R.id.btn14)
    Button btn14;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
        btn14.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                String url1 = "http://sinta.ristekbrin.go.id/";
                Intent intent1 = new Intent(MainActivity.this,WebViewActivity.class);
                intent1.putExtra(KEY_NAME,url1);
                startActivity(intent1);
                break;
            case R.id.btn2:
                String url2 = "http://rama.ristekbrin.go.id/";
                Intent intent2 = new Intent(MainActivity.this,WebViewActivity.class);
                intent2.putExtra(KEY_NAME,url2);
                startActivity(intent2);
                break;
            case R.id.btn3:
                String url3 = "http://arjuna.ristekbrin.go.id/";
                Intent intent3 = new Intent(MainActivity.this,WebViewActivity.class);
                intent3.putExtra(KEY_NAME,url3);
                startActivity(intent3);
                break;
            case R.id.btn4:
                String url4 = "http://garuda.ristekbrin.go.id/";
                Intent intent4 = new Intent(MainActivity.this,WebViewActivity.class);
                intent4.putExtra(KEY_NAME,url4);
                startActivity(intent4);
                break;
            case R.id.btn5:
                String url5 = "http://anjani.ristekbrin.go.id/";
                Intent intent5 = new Intent(MainActivity.this,WebViewActivity.class);
                intent5.putExtra(KEY_NAME,url5);
                startActivity(intent5);
                break;
            case R.id.btn6:
                String url6 = "http://idmenulis.ristekbrin.go.id/";
                Intent intent6 = new Intent(MainActivity.this,WebViewActivity.class);
                intent6.putExtra(KEY_NAME,url6);
                startActivity(intent6);
                break;
            case R.id.btn7:
                String url7 = "https://www.ristekbrin.go.id/";
                Intent intent7 = new Intent(MainActivity.this,WebViewActivity.class);
                intent7.putExtra(KEY_NAME,url7);
                startActivity(intent7);
                break;
            case R.id.btn8:
                String url8 = "http://simlitabmas.ristekdikti.go.id/";
                Intent intent8 = new Intent(MainActivity.this,WebViewActivity.class);
                intent8.putExtra(KEY_NAME,url8);
                startActivity(intent8);
                break;
            case R.id.btn9:
                String url9 = "http://belmawa.ristekdikti.go.id/";
                Intent intent9 = new Intent(MainActivity.this,WebViewActivity.class);
                intent9.putExtra(KEY_NAME,url9);
                startActivity(intent9);
                break;
            case R.id.btn10:
                String url10 = "https://unmerpas.ac.id/";
                Intent intent10 = new Intent(MainActivity.this,WebViewActivity.class);
                intent10.putExtra(KEY_NAME,url10);
                startActivity(intent10);
                break;
            case R.id.btn11:
                String url11 = "http://sister.unmerpas.ac.id/";
                Intent intent11 = new Intent(MainActivity.this,WebViewActivity.class);
                intent11.putExtra(KEY_NAME,url11);
                startActivity(intent11);
                break;
            case R.id.btn12:
                String url12 = "http://siapmerdeka.unmerpas.ac.id/";
                Intent intent12 = new Intent(MainActivity.this,WebViewActivity.class);
                intent12.putExtra(KEY_NAME,url12);
                startActivity(intent12);
                break;
            case R.id.btn13:
                String url13 = "https://lldikti7.ristekdikti.go.id//";
                Intent intent13 = new Intent(MainActivity.this,WebViewActivity.class);
                intent13.putExtra(KEY_NAME,url13);
                startActivity(intent13);
                break;
            case R.id.btn14:
                String url14 = "http://sister.ristekdikti.go.id/";
                Intent intent14 = new Intent(MainActivity.this,WebViewActivity.class);
                intent14.putExtra(KEY_NAME,url14);
                startActivity(intent14);
                break;

        }
    }
}