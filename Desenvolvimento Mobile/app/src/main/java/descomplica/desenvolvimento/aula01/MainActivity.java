package descomplica.desenvolvimento.aula01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.CollationElementIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvMensagem = findViewById(R.id.mensagem);
        tvMensagem.setText ("Ola, Faculdade Descomplica!");
    }
}
