package jp.ac.asojuku.st.kadai001;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class OnLongClickActivity extends AppCompatActivity
implements View.OnClickListener{

        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_on_long_click);
        Button btnBack = (Button) this.findViewById(R.id.btnBack02);
        btnBack.setOnClickListener(this);
    }

        // 戻るボタンの動作
        @Override
        public void onClick (View v) {
            finish();
        }
}
