package com.example.android.shevitzaapp;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Whem I was working on this project in EU Scholarship I've used this resource to help me
 * implement ViewPager https://www.youtube.com/watch?v=nL0k2usU7I8
 *
 */

public class CustomSwipeAdapter extends PagerAdapter {
    private int[] image_resources = {R.drawable.shevitza1, R.drawable.shevitza1a,R.drawable.shevitza2,
            R.drawable.shevitza3,R.drawable.shevitza4,R.drawable.shevitza5,
            R.drawable.shevitza6,R.drawable.shevitza7,R.drawable.shevitza8,
            R.drawable.shevitza9,R.drawable.shevitza10};
    private Context ctx;
    private LayoutInflater layoutInflater;

    public CustomSwipeAdapter(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return image_resources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater.inflate(R.layout.swipe_layout, container, false);
        ImageView imageView = (ImageView) item_view.findViewById(R.id.image_view);
        imageView.setImageResource(image_resources[position]);
        container.addView(item_view);
        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }


}
