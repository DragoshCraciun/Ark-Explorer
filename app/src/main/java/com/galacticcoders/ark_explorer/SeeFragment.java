package com.galacticcoders.ark_explorer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SeeFragment extends Fragment {

    public SeeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of visits
        final ArrayList<Visit> visits = new ArrayList<Visit>();
        visits.add(new Visit(R.string.everest_summary, R.string.see_everest, R.drawable.see_everest));
        visits.add(new Visit(R.string.langtang_summary, R.string.see_langtang, R.drawable.see_langtang));
        visits.add(new Visit(R.string.annapurna_summary, R.string.see_annapurna, R.drawable.see_anapurna));
        visits.add(new Visit(R.string.manaslu_summary, R.string.see_manaslu, R.drawable.see_manaslu));
        visits.add(new Visit(R.string.manaslu_summary, R.string.see_mustang, R.drawable.see_mustang));

        // Create an {@link VisitAdapter}, whose data source is a list of {@link Visit}s. The
        // adapter knows how to create list items for each item in the list.
        VisitAdapter adapter = new VisitAdapter(getActivity(), visits);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link VisitAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Visit} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
