package com.example.technote.TN_Network.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;
import com.example.technote.R;

import java.util.ArrayList;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

/**
 * Created by gdtbg on 2017-09-16.
 */

public class AutoScrollAdapter extends PagerAdapter {

    Context context;
    ArrayList<String> data;

    public AutoScrollAdapter(Context context, ArrayList<String> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        //뷰페이지 슬라이딩 할 레이아웃 인플레이션
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

        View v = inflater.inflate(R.layout.adapter_auto_viewpager,null);
        ImageView image_container = (ImageView) v.findViewById(R.id.image_container);
        image_container.setScaleType(ImageView.ScaleType.FIT_XY);
        Glide.with(context).load(data.get(position)).into(image_container);
        container.addView(v);
        return v;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView((View)object);

    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}