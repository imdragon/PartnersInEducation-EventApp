package org.imdragon.sbccgroup;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PastEventsFragment extends Fragment {
	private String[] pastEventsArray;
	// this holds the past events
	private ArrayAdapter<String> pEventAdapter;
	private ListView pEventView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_past_events,
				container, false);

		// populating lists

		// **************** Comment out the following line so it doesn't
		// overwrite your array! ****************
		pastEventsArray = getResources()
				.getStringArray(R.array.pastEventsArray);
		// ****************// ****************// ****************//

		pEventAdapter = new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_list_item_1, pastEventsArray);
		pEventView = (ListView) rootView.findViewById(R.id.pListView);

		pEventView.setAdapter(pEventAdapter);

		return rootView;
	}
}
