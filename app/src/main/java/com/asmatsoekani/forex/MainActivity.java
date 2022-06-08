package com.asmatsoekani.forex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ProgressBar loadingProgressBar;
    private SwipeRefreshLayout swipeRefreshLayout;
    private TextView idrTextView, eurTextView, rubTextView, usdTextView, jpyTextView, btcTextView, aedTextView, gbpTextView, qarTextView, hkdTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeRefreshLayout1);
        idrTextView = (TextView) findViewById(R.id.idrTextView);
        eurTextView = (TextView) findViewById(R.id.eurTextView);
        rubTextView = (TextView) findViewById(R.id.rubTextView);
        usdTextView = (TextView) findViewById(R.id.usdTextView);
        jpyTextView = (TextView) findViewById(R.id.jpyTextView);
        btcTextView = (TextView) findViewById(R.id.btcTextView);
        aedTextView = (TextView) findViewById(R.id.aedTextView);
        gbpTextView = (TextView) findViewById(R.id.gbpTextview);
        qarTextView = (TextView) findViewById(R.id.qarTextView);
        hkdTextView = (TextView) findViewById(R.id.hkdTextView);
        loadingProgressBar = (ProgressBar) findViewById(R.id.loadingProgressBar);

        initSwipeRefreshLayout();
        initForex();
    }

    private void initSwipeRefreshLayout() {
        swipeRefreshLayout.setOnRefreshListener(() {;
    }
}