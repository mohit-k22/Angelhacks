package com.example.ashut.getitnow;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashut on 07-05-2017.
 */

public class AdsAdapter extends ArrayAdapter<myAds> {

    public AdsAdapter(Activity context, ArrayList<myAds> phrases) {
        super(context, 0, (List<myAds>) phrases);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_phrases, parent, false);
        }
        myAds currentWord = getItem(position);

        TextView tvMiwok = (TextView) listItemView.findViewById(R.id.tvMiwok);
        tvMiwok.setText(currentWord.getMiwokTranslation());
        TextView tvDefault = (TextView) listItemView.findViewById(R.id.tvDefault);
        tvDefault.setText(currentWord.getDefaultTranslation());
        return listItemView;

    }
}
