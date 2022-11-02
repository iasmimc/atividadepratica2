package descomplica.desenvolvimento.aula05;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CursoListFragment extends fragment{

    private CursoListFragment.OnlistSelected Listener;
    private String[] nomes;
    private String[] descricao;
    private String[] periodos;

    static CursoListFragment newInstance() { return new CursoListFragment(); }

    @Override
    @Nullable
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curso_list_fragment);
    }
}