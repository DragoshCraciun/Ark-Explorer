package com.galacticcoders.ark_explorer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list visits.
 */
public class DoFragment extends Fragment {

    public DoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of visits
        final ArrayList<Visit> visits = new ArrayList<Visit>();
        visits.add(new Visit(R.string.bungee_jumping_summary, R.string.do_bungee_jumping, R.drawable.do_bungee_jumping));
        visits.add(new Visit(R.string.paragliding_summary, R.string.do_paragliding, R.drawable.do_paragliding));
        visits.add(new Visit(R.string.canyoning_summary, R.string.do_canyoning, R.drawable.do_canyoning));
        visits.add(new Visit(R.string.rafting_summary, R.string.do_rafting, R.drawable.do_rafting));
        visits.add(new Visit(R.string.zip_flyer_summary, R.string.do_zip_flyer, R.drawable.do_zip_flyer));

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
