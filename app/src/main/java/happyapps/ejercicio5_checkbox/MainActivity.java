package happyapps.ejercicio5_checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv3;
    private CheckBox checkBox1, checkBox2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText) findViewById(R.id.et1);
        et2=(EditText) findViewById(R.id.et2);
        tv3=(TextView) findViewById(R.id.tv3);
        checkBox1 =(CheckBox) findViewById(R.id.checkBox1);
        checkBox2 =(CheckBox) findViewById(R.id.checkBox2);
    }

    public void operar(View view){
        int nro1=Integer.parseInt(et1.getText().toString());
        int nro2=Integer.parseInt(et2.getText().toString());

        String res="";

        if (checkBox1.isChecked()){
            int suma=nro1+nro2;
            res="La suma es:"+suma;
        }else
            if(checkBox2.isChecked()){
               int resta=nro1-nro2;
                res="La resta es:"+resta;
            }
        tv3.setText(res);
    }
}
