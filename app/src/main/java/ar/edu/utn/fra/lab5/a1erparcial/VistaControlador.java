package ar.edu.utn.fra.lab5.a1erparcial;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by lkdml on 03/10/2017.
 */

public class VistaControlador {
    //TODO: Traer del Main lo necesario para usar MVC
    ImageView imgContacto;
    TextView main_nombre;
    TextView main_telefono;
    Button btn_llamar;

    public VistaControlador(Activity activity){
        imgContacto= (ImageView) activity.findViewById(R.id.vh_img);
        main_nombre = (TextView) activity.findViewById(R.id.main_nombre);
        main_telefono = (TextView) activity.findViewById(R.id.main_telefono);
        btn_llamar = (Button) activity.findViewById(R.id.btn_llamar);
        btn_llamar.setOnClickListener((View.OnClickListener) activity);
    }
}
