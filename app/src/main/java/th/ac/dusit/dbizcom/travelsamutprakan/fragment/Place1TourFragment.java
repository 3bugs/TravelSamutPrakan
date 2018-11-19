package th.ac.dusit.dbizcom.travelsamutprakan.fragment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.etiennelawlor.imagegallery.library.ImageGalleryFragment;
import com.etiennelawlor.imagegallery.library.activities.FullScreenImageGalleryActivity;
import com.etiennelawlor.imagegallery.library.activities.ImageGalleryActivity;
import com.etiennelawlor.imagegallery.library.adapters.FullScreenImageGalleryAdapter;
import com.etiennelawlor.imagegallery.library.adapters.ImageGalleryAdapter;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Arrays;

import th.ac.dusit.dbizcom.travelsamutprakan.R;

public class Place1TourFragment extends Fragment implements
        ImageGalleryAdapter.ImageThumbnailLoader,
        FullScreenImageGalleryAdapter.FullScreenImageLoader {

    public Place1TourFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ImageGalleryActivity.setImageThumbnailLoader(this);
        ImageGalleryFragment.setImageThumbnailLoader(this);
        FullScreenImageGalleryActivity.setFullScreenImageLoader(this);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_place1_tour, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button imageGalleryButton = view.findViewById(R.id.image_gallery_button);
        imageGalleryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ImageGalleryActivity.class);

                // link ของรูปภาพต่างๆ อยู่ในไฟล์ arrays.xml
                String[] images = getResources().getStringArray(R.array.place1_images);

                Bundle bundle = new Bundle();
                bundle.putStringArrayList(ImageGalleryActivity.KEY_IMAGES, new ArrayList<>(Arrays.asList(images)));
                bundle.putString(ImageGalleryActivity.KEY_TITLE, "รูปภาพแหล่งท่องเที่ยว ตลาดน้ำบางน้ำผึ้ง");
                intent.putExtras(bundle);

                startActivity(intent);
            }
        });
    }

    @Override
    public void loadFullScreenImage(final ImageView iv, String imageUrl, int width, LinearLayout bglinearLayout) {
        if (!TextUtils.isEmpty(imageUrl)) {
            Picasso.get()
                    .load(imageUrl)
                    .resize(width, 0)
                    .into(iv, new Callback() {
                        @Override
                        public void onSuccess() {
                            Bitmap bitmap = ((BitmapDrawable) iv.getDrawable()).getBitmap();
                        }

                        @Override
                        public void onError(Exception e) {

                        }
                    });
        } else {
            iv.setImageDrawable(null);
        }
    }

    @Override
    public void loadImageThumbnail(ImageView iv, String imageUrl, int dimension) {
        if (!TextUtils.isEmpty(imageUrl)) {
            Picasso.get()
                    .load(imageUrl)
                    .resize(dimension, dimension)
                    .centerCrop()
                    .into(iv);
        } else {
            iv.setImageDrawable(null);
        }
    }
}
