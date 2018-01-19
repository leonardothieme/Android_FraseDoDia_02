package frasesdodia.cursoandroid.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frases = {
            "Se você não está disposto a arriscar, esteja disposto a uma vida comum" ,
            "A vida é melhor para aqueles que fazem o possível para ter o melhor" ,
            "Para de perseguir o dinheiro e comece a perseguir o sucesso",
            "Ter sucesso é falhar repetidamente, mas sem perder o entusiasmo",
            "Não tente ser uma pessoa de sucesso. Em vez disso, seja uma pessoa de valor",
            "A melhor vingança é um sucesso estrondoso",
            "Ninguém pode fazer você se sentir inferior sem o seu consentimento ",
    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = (TextView) findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = (Button) findViewById(R.id.botaoNovaFraseId);

       // textoNovaFrase.setText(frases[0]);

        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(frases.length);

                textoNovaFrase.setText(frases[numeroAleatorio]);
            }
        });
    }
}
