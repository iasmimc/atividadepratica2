package descomplica.desenvolvimento.aula04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String NOME = "descomplica.desenvolvimentomobile.aula04.NOME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void navegar(View view){
        Intent intent = new Intent(this, SegundaActivity.class );
        String nome = "Iasmim";
        intent.putExtra(NOME, nome);
        startActivity(intent);
    }
}