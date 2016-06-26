package com.arturnowicki.android.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private ArrayList<String> forecastList;
    private ArrayAdapter<String> mForecastAdapter;
    private ListView weatherListView;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        forecastList.add(0, "Today - Sunny - 32/25");
        forecastList.add(1, "Tomorrow - Sunny - 31/22");
        forecastList.add(2, "Mon - Cloudy - 28/22");
        forecastList.add(3, "Tue - Rainy - 27/20");
        forecastList.add(4, "Wed - Foggy - 25/21");
        mForecastAdapter = new ArrayAdapter<>(getActivity(), R.layout.list_item_forecast, R.id.listview_forecast, forecastList);
        weatherListView = (ListView)rootView.findViewById(R.id.listview_forecast);
        weatherListView.setAdapter(mForecastAdapter);
        return rootView;
    }
}
