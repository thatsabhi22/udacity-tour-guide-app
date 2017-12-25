package com.theleafapps.pro.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.theleafapps.pro.Adpater.ElementAdapter;
import com.theleafapps.pro.Helper.TourGuideDataHelper;
import com.theleafapps.pro.R;
import com.theleafapps.pro.model.Element;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoricalSiteFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.element_list, container, false);

        List<Element> historicalSitesElements = TourGuideDataHelper.getHistoricalSites();

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        ElementAdapter wordAdapter = new ElementAdapter(getActivity(), historicalSitesElements);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) rootView.findViewById(R.id.elementList);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(wordAdapter);

        return rootView;
    }
}
