package whitaaplikasinusantara.latihan;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_button);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlertDialog();
            }
        });

        // mendapatkan reference/object dari EditText
        // yang berada di file XML
        editText = findViewById(R.id.editText);
    }

    /**
     * Method untuk membuka Activity baru
     */
    public void openActivity(View viewYangDiklik) {
        // membuat intent yang digunakan untuk membuka
        // activity baru
        Intent openNewActivity = new Intent(
                this,
                NewActivity.class
        );

        // membuka activity baru dengan object intent
        // yang dibuat sebelumnya
        // startActivity(openNewActivity);

        // mendapatkan text dari EditText
        String isiEditText = editText.getText().toString();

        ImageView profileImageView = findViewById(R.id.profile_image);
        Drawable drawable = profileImageView.getDrawable();
        // tidak bisa, bakal error
        // openNewActivity.putExtra("someKey", drawable);
        openNewActivity.putExtra(
                "imageResource",
                R.drawable.profile_image
        );

        // bundle digunakan untuk membawa data dari
        // satu activity ke activity lain
        // Bundle data = new Bundle();
        // data.putString("text", isiEditText);
        // openNewActivity.putExtras(data);
        openNewActivity.putExtra("text", isiEditText);
        startActivity(openNewActivity);
    }

    private void showToast() {
        Toast.makeText(
                getApplicationContext(),
                "Button diklik programmatically yey!",
                Toast.LENGTH_LONG
        ).show();
    }

    private void showAlertDialog() {
        // mendapatkan text dari EditText
        String isiEditText = editText.getText().toString();

        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setTitle("Ini title")
                .setMessage(isiEditText)
                .setNegativeButton(
                        "Tidakkkkk",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                showToast();
                            }
                        }
                )
                .setPositiveButton("Ya", null)
                .setCancelable(false)
                .show();
    }

    public void onButtonClick(View view) {
        Toast.makeText(
                this,
                "Button diklik yey!",
                Toast.LENGTH_LONG
        ).show();
    }
}
