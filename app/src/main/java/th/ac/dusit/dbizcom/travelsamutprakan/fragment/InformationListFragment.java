package th.ac.dusit.dbizcom.travelsamutprakan.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import th.ac.dusit.dbizcom.travelsamutprakan.R;
import th.ac.dusit.dbizcom.travelsamutprakan.model.InformationItem;

/**
 * A simple {@link Fragment} subclass.
 */
public class InformationListFragment extends Fragment {

    private static final String KEY_PLACE_INDEX = "place_index";

    private ListView mInformationListView;
    private List<InformationItem> mInformationItems;

    /* 0 = ตลาดน้ำบางน้ำผึ้ง, 1 = คุ้งบางกะเจ้า, 2 = สถานตากอากาศบางปู, 3 = วัดอโศการาม */
    private int mPlaceIndex;

    public InformationListFragment() {
        // Required empty public constructor
    }

    public static InformationListFragment newInstance(int placeIndex) {
        InformationListFragment fragment = new InformationListFragment();
        Bundle args = new Bundle();
        args.putInt(KEY_PLACE_INDEX, placeIndex);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle args = getArguments();
        if (args != null) {
            mPlaceIndex = args.getInt(KEY_PLACE_INDEX);
        }

        mInformationItems = new ArrayList<>();
        mInformationItems.add(new InformationItem(R.drawable.ic_information_tour, "ข้อมูลแหล่งท่องเที่ยว", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (mPlaceIndex) {
                    case 0:
                        // ข้อมูลแหล่งท่องเที่ยว ตลาดน้ำบางน้ำผึ้ง
                        Toast.makeText(getActivity(), "ข้อมูลแหล่งท่องเที่ยว ตลาดน้ำบางน้ำผึ้ง", Toast.LENGTH_SHORT).show();
                        //todo:
                        break;
                    case 1:
                        // ข้อมูลแหล่งท่องเที่ยว คุ้งบางกะเจ้า
                        Toast.makeText(getActivity(), "ข้อมูลแหล่งท่องเที่ยว คุ้งบางกะเจ้า", Toast.LENGTH_SHORT).show();
                        //todo:
                        break;
                    case 2:
                        // ข้อมูลแหล่งท่องเที่ยว สถานตากอากาศบางปู
                        Toast.makeText(getActivity(), "ข้อมูลแหล่งท่องเที่ยว สถานตากอากาศบางปู", Toast.LENGTH_SHORT).show();
                        //todo:
                        break;
                    case 3:
                        // ข้อมูลแหล่งท่องเที่ยว วัดอโศการาม
                        Toast.makeText(getActivity(), "ข้อมูลแหล่งท่องเที่ยว วัดอโศการาม", Toast.LENGTH_SHORT).show();
                        //todo:
                        break;
                }
            }
        }));
        mInformationItems.add(new InformationItem(R.drawable.ic_information_travel, "ข้อมูลการเดินทาง", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (mPlaceIndex) {
                    case 0:
                        // ข้อมูลการเดินทาง ตลาดน้ำบางน้ำผึ้ง
                        Toast.makeText(getActivity(), "ข้อมูลการเดินทาง ตลาดน้ำบางน้ำผึ้ง", Toast.LENGTH_SHORT).show();
                        //todo:
                        break;
                    case 1:
                        // ข้อมูลการเดินทาง คุ้งบางกะเจ้า
                        Toast.makeText(getActivity(), "ข้อมูลการเดินทาง คุ้งบางกะเจ้า", Toast.LENGTH_SHORT).show();
                        //todo:
                        break;
                    case 2:
                        // ข้อมูลการเดินทาง สถานตากอากาศบางปู
                        Toast.makeText(getActivity(), "ข้อมูลการเดินทาง สถานตากอากาศบางปู", Toast.LENGTH_SHORT).show();
                        //todo:
                        break;
                    case 3:
                        // ข้อมูลการเดินทาง วัดอโศการาม
                        Toast.makeText(getActivity(), "ข้อมูลการเดินทาง วัดอโศการาม", Toast.LENGTH_SHORT).show();
                        //todo:
                        break;
                }
            }
        }));
        mInformationItems.add(new InformationItem(R.drawable.ic_information_activity, "ข้อมูลกิจกรรมการท่องเที่ยว", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (mPlaceIndex) {
                    case 0:
                        // ข้อมูลกิจกรรมการท่องเที่ยว ตลาดน้ำบางน้ำผึ้ง
                        Toast.makeText(getActivity(), "ข้อมูลกิจกรรมการท่องเที่ยว ตลาดน้ำบางน้ำผึ้ง", Toast.LENGTH_SHORT).show();
                        //todo:
                        break;
                    case 1:
                        // ข้อมูลกิจกรรมการท่องเที่ยว คุ้งบางกะเจ้า
                        Toast.makeText(getActivity(), "ข้อมูลกิจกรรมการท่องเที่ยว คุ้งบางกะเจ้า", Toast.LENGTH_SHORT).show();
                        //todo:
                        break;
                    case 2:
                        // ข้อมูลกิจกรรมการท่องเที่ยว สถานตากอากาศบางปู
                        Toast.makeText(getActivity(), "ข้อมูลกิจกรรมการท่องเที่ยว สถานตากอากาศบางปู", Toast.LENGTH_SHORT).show();
                        //todo:
                        break;
                    case 3:
                        // ข้อมูลกิจกรรมการท่องเที่ยว วัดอโศการาม
                        Toast.makeText(getActivity(), "ข้อมูลกิจกรรมการท่องเที่ยว ดอโศการาม", Toast.LENGTH_SHORT).show();
                        //todo:
                        break;
                }
            }
        }));
        if (mPlaceIndex == 0 || mPlaceIndex == 1) {
            mInformationItems.add(new InformationItem(R.drawable.ic_information_bicycle, "ข้อมูลร้านเช่าจักรยาน", new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switch (mPlaceIndex) {
                        case 0:
                            // ข้อมูลร้านเช่าจักรยาน ตลาดน้ำบางน้ำผึ้ง
                            Toast.makeText(getActivity(), "ข้อมูลร้านเช่าจักรยาน ตลาดน้ำบางน้ำผึ้ง", Toast.LENGTH_SHORT).show();
                            //todo:
                            break;
                        case 1:
                            // ข้อมูลร้านเช่าจักรยาน คุ้งบางกะเจ้า
                            Toast.makeText(getActivity(), "ข้อมูลร้านเช่าจักรยาน คุ้งบางกะเจ้า", Toast.LENGTH_SHORT).show();
                            //todo:
                            break;
                        case 2:
                            // ข้อมูลร้านเช่าจักรยาน สถานตากอากาศบางปู
                            Toast.makeText(getActivity(), "ข้อมูลร้านเช่าจักรยาน สถานตากอากาศบางปู", Toast.LENGTH_SHORT).show();
                            //todo:
                            break;
                        case 3:
                            // ข้อมูลร้านเช่าจักรยาน วัดอโศการาม
                            Toast.makeText(getActivity(), "ข้อมูลร้านเช่าจักรยาน วัดอโศการาม", Toast.LENGTH_SHORT).show();
                            //todo:
                            break;
                    }
                }
            }));
        }
        if (mPlaceIndex != 3) {
            mInformationItems.add(new InformationItem(R.drawable.ic_information_food, "ข้อมูลร้านอาหาร", new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switch (mPlaceIndex) {
                        case 0:
                            // ข้อมูลร้านอาหาร ตลาดน้ำบางน้ำผึ้ง
                            Toast.makeText(getActivity(), "ข้อมูลร้านอาหาร ตลาดน้ำบางน้ำผึ้ง", Toast.LENGTH_SHORT).show();
                            //todo:
                            break;
                        case 1:
                            // ข้อมูลร้านอาหาร คุ้งบางกะเจ้า
                            Toast.makeText(getActivity(), "ข้อมูลร้านอาหาร คุ้งบางกะเจ้า", Toast.LENGTH_SHORT).show();
                            //todo:
                            break;
                        case 2:
                            // ข้อมูลร้านอาหาร สถานตากอากาศบางปู
                            Toast.makeText(getActivity(), "ข้อมูลร้านอาหาร สถานตากอากาศบางปู", Toast.LENGTH_SHORT).show();
                            //todo:
                            break;
                        case 3:
                            // ข้อมูลร้านอาหาร วัดอโศการาม
                            Toast.makeText(getActivity(), "ข้อมูลร้านอาหาร วัดอโศการาม", Toast.LENGTH_SHORT).show();
                            //todo:
                            break;
                    }
                }
            }));
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_information_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // ค้นหา ListView และเก็บลงตัวแปร mInformationListView
        mInformationListView = view.findViewById(R.id.information_list_view);
        // สร้าง Adapter จากคลาส InformationAdapter
        InformationAdapter adapter = new InformationAdapter(getActivity());
        // ผูก Adapter เข้ากับ ListView
        mInformationListView.setAdapter(adapter);
        mInformationListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                mInformationItems.get(position).itemClick();
            }
        });
    }

    private class InformationAdapter extends ArrayAdapter<InformationItem> {
        private Context mContext;
        /*private int mResource;
        private String[] mInformationItems;*/

        public InformationAdapter(@NonNull Context context) {
            super(context, R.layout.item_information);
            mContext = context;
        }

        @Override
        public int getCount() {
            return mInformationItems.size();
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = convertView;
            if (view == null) {
                view = inflater.inflate(R.layout.item_information, parent, false);
            }

            InformationItem item = mInformationItems.get(position);

            TextView tv = view.findViewById(R.id.text);
            tv.setText(item.text);

            ImageView iv = view.findViewById(R.id.image);
            iv.setImageResource(item.imageResource);

            return view;
        }
    }
}
