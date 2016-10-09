package id.sch.smktelkom_mlg.tugas01.xirpl2019.intent1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        findViewById(R.id.buttonBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
@Override
    public boolean onOptionsItemSelected(MenuItem item){
    if (item.getItemId() == android.R.id.home){
        onBackPressed();
        return true;
    }
    return super.onOptionsItemSelected(item);
}
}
