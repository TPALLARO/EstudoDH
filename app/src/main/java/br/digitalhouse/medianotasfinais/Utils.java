package br.digitalhouse.medianotasfinais;

import android.widget.EditText;

public class Utils {

    public float converteValor(EditText caixaDeTexto){
        float valorMedia = Float.parseFloat(caixaDeTexto.getText().toString());
        return valorMedia;
    }

    public float calcularMedia(EditText notaP,EditText notaS,EditText notaT, EditText notaQ){
        float notaPrimeiroConverstida = converteValor(notaP);
        float notaSegundoConverstida = converteValor(notaS);
        float notaTerceiroConverstida = converteValor(notaT);
        float notaQuartoConverstida = converteValor(notaQ);
        float notasSomadas = notaPrimeiroConverstida + notaSegundoConverstida + notaTerceiroConverstida
                + notaQuartoConverstida;
        float media = notasSomadas / 4;
                return media;


    }
}
