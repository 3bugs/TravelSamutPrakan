package th.ac.dusit.dbizcom.travelsamutprakan.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import th.ac.dusit.dbizcom.travelsamutprakan.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PurposeFragment extends Fragment {

    public PurposeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_purpose, container, false);
    }
}
