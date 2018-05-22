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
public class EatFragment extends Fragment {

    public EatFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of visits
        final ArrayList<Visit> visits = new ArrayList<Visit>();
        visits.add(new Visit(R.string.dal_bhat_summary, R.string.eat_dal_bhat, R.drawable.eat_dal_bhat));
        visits.add(new Visit(R.string.pulao_summary, R.string.eat_pulao, R.drawable.eat_pulao));
        visits.add(new Visit(R.string.thukpa_summary, R.string.eat_thukpa, R.drawable.eat_thukpa));
        visits.add(new Visit(R.string.momo_summary, R.string.eat_momo, R.drawable.eat_momo));
        visits.add(new Visit(R.string.sel_roti_summary, R.string.eat_sel_roti, R.drawable.eat_sel_roti));

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