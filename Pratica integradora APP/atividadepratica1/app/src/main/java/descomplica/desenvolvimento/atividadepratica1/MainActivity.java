package descomplica.desenvolvimento.atividadepratica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvMensagem = findViewById(R.id.mensagem);
        tvMensagem.setText("Iasmim de Oliveira Gomes Capra");

        TextView tvMensagem2 = findViewById(R.id.mensagem2);
        tvMensagem2.setText("Ciência da Computação");
    }
}