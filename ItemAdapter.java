package com.example.list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


    public class ItemAdapter extends BaseAdapter {
        LayoutInflater mInflater;
        String[] Missions;
        String[] Location;
        String[] Description;

        public ItemAdapter(Context c, String[] m, String[] l, String[] d) {
            Missions = m;
            Location = l;
            Description = d;
            mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return Missions.length;
        }

        @Override
        public Object getItem(int i) {
            return Missions[i];
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View v = mInflater.inflate(R.layout.my_listview_detail, null);
            TextView missionsTextView = (TextView) v.findViewById(R.id.missionsTextView);
            TextView locationTextView = (TextView) v.findViewById(R.id.locationTextView);
            TextView descriptionTextView = (TextView) v.findViewById(R.id.descriptiontextView);
            String miss = Missions[i];
            String loc = Location[i];
            String desc = Description[i];

            missionsTextView.setText(miss);
            locationTextView.setText(loc);
            descriptionTextView.setText(desc);
            return v;
        }
    }
