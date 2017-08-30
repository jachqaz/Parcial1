package co.edu.ucc.parcial1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {
    @BindView(R.id.L_txtNomUsuario)
    EditText L_txtNomUsuario;
    @BindView(R.id.L_txtApellido)
    EditText L_txtApellido;
    @BindView(R.id.L_txtDireccion)
    EditText L_txtDireccion;
    @BindView(R.id.L_txtEmail)
    EditText L_txtEmail;
    @BindView(R.id.L_btnIngresar)
    Button L_btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.L_btnIngresar)
    public void clickIngresar(){
        String nombre = L_txtNomUsuario.getText().toString();
        String apellido = L_txtApellido.getText().toString();
        String direccion = L_txtDireccion.getText().toString();
        String email = L_txtEmail.getText().toString();
        Intent intent=new Intent(LoginActivity.this,PrincipalActivity.class);
        intent.putExtra("nombre",nombre);
        intent.putExtra("apellido",apellido);
        intent.putExtra("direccion",direccion);
        intent.putExtra("email",email);
        startActivity(intent);
    }
}
