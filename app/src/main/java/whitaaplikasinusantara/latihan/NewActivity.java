package whitaaplikasinusantara.latihan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Intent intent = getIntent();

        // mendapatkan data dari activity sebelumnya
        String text = intent.getStringExtra("text");

        // mendapatkan reference dari TextView
        TextView textView = findViewById(R.id.textView);
        // set text ke TextView
        textView.setText(text);

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(
                intent.getIntExtra(
                        "imageResource",
                        0
                )
        );

    }
}
