package michaelschwamborn.blockchain_hackathon_t_labs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button scan, search;
    EditText code;
    String apple = "615435839776";
    String lettuce = "014381580525";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scan = (Button) findViewById(R.id.scan);
        search = (Button) findViewById(R.id.search);
        code = (EditText) findViewById(R.id.code);

        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rIntent = new Intent(MainActivity.this, ReaderActivity.class);
                startActivity(rIntent);
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (code.getText().toString().equals(apple)) {
                    Intent rIntent = new Intent(MainActivity.this, Apple.class);
                    startActivity(rIntent);
                }
                if (code.getText().toString().equals(lettuce)){
                    Intent rIntent = new Intent(MainActivity.this, Lettuce.class);
                    startActivity(rIntent);
                }
            }
        });

    }
}
