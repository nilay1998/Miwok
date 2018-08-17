package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.support.v4.content.ContextCompat;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word>
{
    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words,int ColorResourceId)
    {
        super(context,0, words);
        mColorResourceId=ColorResourceId;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        final Word current=getItem(position);
        if(convertView==null)
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        ImageView img=(ImageView) convertView.findViewById(R.id.image_view);
        TextView miwok=(TextView) convertView.findViewById(R.id.miwok_text_view);
        TextView eng=(TextView) convertView.findViewById(R.id.default_text_view);


        miwok.setText(current.getmMiwokYTranslation());
        eng.setText(current.getmDefaultTranslation());

        if(current.hasImage())
        {
            img.setImageResource(current.getmImage());
            img.setVisibility(View.VISIBLE);
        }
        else
            img.setVisibility(View.GONE);

        View textContainer = convertView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        View xyz=convertView.findViewById(R.id.abc);
        xyz.setBackgroundColor(color);

        return convertView;
    }
}
