package uk.ac.solent.map;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button)findViewById(R.id.btn1);
        b.setOnClickListener(this);


        MapView mv = findViewById(R.id.map1);
        mv.getController().setCenter(new GeoPoint(51.05,  -0.72));
        mv.getController().setZoom(14);

        mv.setBuiltInZoomControls(true);
        mv.setClickable(true);
    }

    public void onClick(View view)
    {
        TextView tv = (TextView)findViewById(R.id.tv1);
        EditText et = (EditText)findViewById(R.id.et1);
        double latitude = Double.parseDouble(et.getText().toString());

        TextView tv2 = (TextView)findViewById(R.id.tv2);
        EditText et2 = (EditText)findViewById(R.id.et2);
        double longitude = Double.parseDouble(et.getText().toString());
    }

}
