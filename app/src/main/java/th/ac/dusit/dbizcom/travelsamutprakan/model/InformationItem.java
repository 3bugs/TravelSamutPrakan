package th.ac.dusit.dbizcom.travelsamutprakan.model;

import android.view.View;

public class InformationItem {

    public final int imageResource;
    public final String text;
    public final View.OnClickListener onClickListener;

    public InformationItem(int imageResource, String text,
                           View.OnClickListener onClickListener) {
        this.imageResource = imageResource;
        this.text = text;
        this.onClickListener = onClickListener;
    }

    public void itemClick() {
        onClickListener.onClick(null);
    }
}
