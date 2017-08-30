package co.edu.ucc.parcial1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PrincipalActivity extends AppCompatActivity {
    @BindView(R.id.P_txtNomUsuario)
    TextView P_txtNomUsuario;
    @BindView(R.id.P_txtApellido)
    TextView P_txtApellido;
    @BindView(R.id.P_txtDireccion)
    TextView P_txtDireccion;
    @BindView(R.id.P_txtEmail)
    TextView P_txtEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        ButterKnife.bind(this);
        String nombre = getIntent().getStringExtra("nombre");
        String apellido =getIntent().getStringExtra("apellido");
        String direccion = getIntent().getStringExtra("direccion");
        String email = getIntent().getStringExtra("email");
        P_txtNomUsuario.setText(nombre);
        P_txtApellido.setText(apellido);
        P_txtDireccion.setText(direccion);
        P_txtEmail.setText(email);
    }
}
