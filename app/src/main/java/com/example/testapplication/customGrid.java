package com.example.testapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class customGrid extends BaseAdapter {

        int mCount = 0;
        String[] titles;
        String[] des;
        /**
         * Default constructor
         * @param items to fill data to
         */

        public customGrid(ArrayList<Note> items) {

            mCount = items.size();

            titles = new String[mCount];
            des = new String[mCount];
            // for small size of items it's ok to do it here, sync way
            int index = 0;
            for (Note item : items) {
                // get separate string parts, divided by ,
                titles[index] = item.getTitle();
                des[index] = item.getDes();

                index++;
            }
        }

        @Override
        public int getCount() {
            return mCount;
        }

        @Override
        public Object getItem(final int position) {
            return titles[position];
        }

        @Override
        public long getItemId(final int position) {
            return position;
        }

        @Override
        public View getView(final int position, final View convertView, final ViewGroup parent) {

            View view = convertView;

            if (view == null) {
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_single, parent, false);
            }

            final TextView text = (TextView) view.findViewById(R.id.grid_title);
            text.setText(titles[position]);
            final TextView text2 = (TextView) view.findViewById(R.id.grid_description);
            text2.setText(des[position]);

            return view;
        }
    }

