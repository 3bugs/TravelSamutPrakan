package th.ac.dusit.dbizcom.travelsamutprakan.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.glide.slider.library.Animations.DescriptionAnimation;
import com.glide.slider.library.SliderLayout;
import com.glide.slider.library.SliderTypes.DefaultSliderView;

import java.util.HashMap;

import th.ac.dusit.dbizcom.travelsamutprakan.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryFragment extends Fragment {

    private SliderLayout mSlider;

    public GalleryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gallery, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupImageSlider(view);
    }

    private void setupImageSlider(View view) {
        mSlider = view.findViewById(R.id.slider);
        //mSlider.setCustomIndicator((PagerIndicator) view.findViewById(R.id.slider_indicator));

        HashMap<String, Integer> imageMap = new HashMap<>();
        imageMap.put("place01", R.drawable.place01);
        imageMap.put("place02", R.drawable.place02);
        imageMap.put("place03", R.drawable.place03);
        imageMap.put("place04", R.drawable.place04);

        for (String name : imageMap.keySet()) {
            DefaultSliderView defaultSliderView = new DefaultSliderView(getActivity());
            defaultSliderView.image(imageMap.get(name));
            mSlider.addSlider(defaultSliderView);
        }

        mSlider.setPresetTransformer(SliderLayout.Transformer.Accordion);
        mSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        mSlider.setCustomAnimation(new DescriptionAnimation());
        mSlider.setDuration(4000);
    }
}
