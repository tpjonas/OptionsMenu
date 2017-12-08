package cimdata.android.dez2017.optionsmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Wir "pusten" die Resource zu einer View auf
        // Ein menuInflator gibt KEINE View zurück, den wir übergeben
        // das menu dem inflator, das er innerhalb füllt.
        getMenuInflater().inflate(
                R.menu.main_menu, // Die Resource, die das menu enthält
                menu              // Das menu, das gefüllt werden soll

        );

        // Hier übergeben wir das gefüllte menu, damit es dargstellt werden kann
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        // hier müssen wir die IDs überprüfen
        switch (id) {
            case R.id.menu_main_item_01:
                Toast.makeText(
                        this,            // Kontext
                        "Item fuktioniert immer noch foobar barfoo new commit foolio",
                        Toast.LENGTH_LONG       // Dauer der Anzeige
                ).show();
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}
