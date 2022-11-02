package descomplica.desenvolvimento.aula04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Intent intentRecebida = getIntent();
        String nome = intentRecebida.getStringExtra(MainActivity.NOME);

        TextView tevMensagemRecebida = findViewById(R.id.mensagem_recebida);
        tevMensagemRecebida.setText("Olá "+nome);
    }

    public void voltar(View view){
        Intent intent = new Intent(this, MainActivity.class );
        startActivity(intent);
    }
}