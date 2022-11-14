package descomplica.desenvolvimento.atividadepratica3;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

@RequiresApi(api = Build.VERSION_CODES.M)
public class MainActivity extends AppCompatActivity implements View.OnContextClickListener {
    Button send;
    EditText phoneNumber, message;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        send = (Button) findViewById(R.id.Send_msg_Btn);
        phoneNumber = (EditText)findViewById(R.id.MainActivity_Message);
//        send.setOnClickListener();

    }

    public void onClick(View v) {
        String phone_num = phoneNumber.getText().toString();
        String send_msg = message.getText().toString();
        try {
            SmsManager sms = SmsManager.getDefault();
            sms.sendTextMessage(phone_num, null, send_msg, null, null);
        } catch (Exception e) {
            Toast.makeText(this, "Sms não Enviado", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }

    @Override
    public boolean onContextClick(View view) {
        return false;
    }
}
