package com.example.testprogressbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends Activity {
  
  private ProgressBar progressBar;
  private Button start;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    
    progressBar = (ProgressBar) findViewById(R.id.progressBar);
    progressBar.setProgress(0);
    
    start = (Button) findViewById(R.id.start);
    start.setOnClickListener(new View.OnClickListener() {

        public void onClick(View v) {
          progressBar.setProgress(50);
        }
            
    });

    
  }

 
}
