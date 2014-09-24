package org.imdragon.sbccgroup;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class UpcomingEventsFragment extends Fragment {

	private String[] otherEventsArray;
	// this array will hold the Other Events, so put them in there
	private String[] nextEventArray = new String[1];
	// this one holds the next one, made it size 1 so it won't do funny things
	private ArrayAdapter<String> nEventAdapter, oEventAdapter;
	private ListView nEventView, oEventView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_upcoming_events,
				container, false);

		// populating next
		// **************** Comment out the following line so it doesn't
				// overwrite your array! ****************
		nextEventArray = getResources().getStringArray(R.array.nextEventArray);
		nEventAdapter = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_list_item_1, nextEventArray);
		nEventView = (ListView) rootView.findViewById(R.id.nextEventList);
		nEventView.setAdapter(nEventAdapter);

		// populating other
		// **************** Comment out the following line so it doesn't
				// overwrite your array! ****************
		otherEventsArray = getResources().getStringArray(
				R.array.otherEventsArray);
		oEventAdapter = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_list_item_1, otherEventsArray);
		oEventView = (ListView) rootView.findViewById(R.id.otherEventsList);

		oEventView.setAdapter(oEventAdapter);
		return rootView;
	}
}
