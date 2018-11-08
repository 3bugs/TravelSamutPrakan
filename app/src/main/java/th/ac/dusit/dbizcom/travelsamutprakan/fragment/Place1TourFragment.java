package th.ac.dusit.dbizcom.travelsamutprakan.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import th.ac.dusit.dbizcom.travelsamutprakan.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Place1TourFragment extends Fragment {

    public Place1TourFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_place1_tour, container, false);
    }
}
