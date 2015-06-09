//package samples.exoguru.materialtabs;
//
//import android.app.Activity;
//import android.hardware.Sensor;
//import android.hardware.SensorEvent;
//import android.hardware.SensorEventListener;
//import android.hardware.SensorManager;
//import android.os.Bundle;
//import android.widget.TextView;
//
///**
// * Created by RamonValk on 02-06-15.
// */
//public class SensorAct extends Activity implements SensorEventListener {
//    private SensorManager sensorManager;
//
//    TextView xCoor; // declare X axis object
//    TextView yCoor; // declare Y axis object
//    TextView zCoor; // declare Z axis object
//
//    public void onCreate(Bundle savedInstanceState){
//
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.tab_2);
//
//        xCoor=(TextView)findViewById(R.id.xcoor); // create X axis object
//        yCoor=(TextView)findViewById(R.id.ycoor); // create Y axis object
//        zCoor=(TextView)findViewById(R.id.zcoor); // create Z axis object
//
//        sensorManager=(SensorManager)getSystemService(SENSOR_SERVICE);
//        // add listener. The listener will be HelloAndroid (this) class
//        sensorManager.registerListener(this,
//                sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
//                SensorManager.SENSOR_DELAY_NORMAL);
//
//		/*	More sensor speeds (taken from api docs)
//		    SENSOR_DELAY_FASTEST get sensor data as fast as possible
//		    SENSOR_DELAY_GAME	rate suitable for games
//		 	SENSOR_DELAY_NORMAL	rate (default) suitable for screen orientation changes
//		*/
//    }
//
//    @Override
//    public void onSensorChanged(SensorEvent event) {
//        if(event.sensor.getType()==Sensor.TYPE_ACCELEROMETER){
//
//            // assign directions
//            float x=event.values[0];
//            float y=event.values[1];
//            float z=event.values[2];
//
//            xCoor.setText("X: "+x);
//            yCoor.setText("Y: "+y);
//            zCoor.setText("Z: "+z);
//        }
//    }
//
//    @Override
//    public void onAccuracyChanged(Sensor sensor, int accuracy) {
//
//    }
//}
