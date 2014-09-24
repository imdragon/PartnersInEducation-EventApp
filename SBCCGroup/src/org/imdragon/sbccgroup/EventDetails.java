package org.imdragon.sbccgroup;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class EventDetails extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_event_details);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.event_details, menu);
		return true;
	}
	
	public void updateFields(){
		TextView eventTitle = (TextView) findViewById(R.id.eventTitle);
		eventTitle.setText("");
		TextView dateLine = (TextView) findViewById(R.id.dateLine);
		dateLine.setText("");
		TextView locationInfo = (TextView) findViewById(R.id.locationAndContact);
		locationInfo.setText("");
		TextView description = (TextView) findViewById(R.id.description);
		description.setText("");
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
