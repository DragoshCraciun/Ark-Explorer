package com.galacticcoders.ark_explorer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of visits.
 */
public class BeFragment extends Fragment {

    public BeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of visits
        final ArrayList<Visit> visits = new ArrayList<Visit>();
        visits.add(new Visit(R.string.swayambhunath_summary, R.string.be_swayambhunath, R.drawable.be_swayambhunath));
        visits.add(new Visit(R.string.pashupatinath_summary, R.string.be_pashupatinath, R.drawable.be_pashupatinath));
        visits.add(new Visit(R.string.bhaktapur_summary, R.string.be_bhaktapur, R.drawable.be_bhaktapur));
        visits.add(new Visit(R.string.durbar_square_summary, R.string.be_durbar_square, R.drawable.be_durbar_square));
        visits.add(new Visit(R.string.boudhanath_summary, R.string.be_boudhanath, R.drawable.be_boudhanath));

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