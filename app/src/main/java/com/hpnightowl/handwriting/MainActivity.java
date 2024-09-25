/*!
 *  @date 2020/01/02
 *  @file MainActivity.java
 *  @author SELVAS AI
 *
 *  Copyright 2020. SELVAS AI Inc. All Rights Reserved.
 */

package com.hpnightowl.handwriting;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private DrawingView mDrawingView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    private void initialize() {
        mDrawingView = (DrawingView) findViewById(R.id.canvas);
        Button clearButton = (Button) findViewById(R.id.clear);
        if (clearButton != null) {
            clearButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    handleClear();
                }
            });
        }
    }

    private void handleClear() {
        mDrawingView.clear();
    }

}
