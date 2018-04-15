package whitaaplikasinusantara.latihan;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

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
    }

    private void showToast() {
        Toast.makeText(
                getApplicationContext(),
                "Button diklik programmatically yey!",
                Toast.LENGTH_LONG
        ).show();
    }

    private void showAlertDialog() {
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setTitle("Ini title")
                .setMessage("Ini content")
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
        Toast.makeText(this, "Button diklik yey!", Toast.LENGTH_LONG).show();
    }
}
