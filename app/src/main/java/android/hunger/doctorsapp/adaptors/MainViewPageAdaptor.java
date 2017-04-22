package android.hunger.doctorsapp.adaptors;

import android.content.Context;
import android.graphics.Typeface;

import android.hunger.doctorsapp.R;
import android.hunger.doctorsapp.utils.FontCache;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
/**
 * Created by hunger on 12/20/2016.
 */

public class MainViewPageAdaptor extends PagerAdapter {
    private int[] listImages = {R.drawable.imageback2, R.drawable.imageback1, R.drawable.imageback1, R.drawable.imageback2};
    private Context mContext;

    public MainViewPageAdaptor(Context context) {
        mContext = context;
    }

    @Override
    public int getCount(){
        return listImages.length;
    }

    @Override
    public int getItemPosition(Object object) {
        return super.getItemPosition(object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((RelativeLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {

        View itemView = null;
        Typeface qucikSandRegtypeface = FontCache.getTypeface(mContext, "fonts/Quicksand-Regular.ttf");
        Typeface qucikSandMediumtypeface = FontCache.getTypeface(mContext, "fonts/Quicksand-Medium.ttf");

        int layoutused = position;

        if (layoutused == 0) {
            itemView = LayoutInflater.from(mContext).inflate(R.layout.banner_one, container, false);

        } else if (layoutused == 1) {
            itemView = LayoutInflater.from(mContext).inflate(R.layout.banner_one_back, container, false);

        } else if (layoutused == 2) {
            itemView = LayoutInflater.from(mContext).inflate(R.layout.banner_three, container, false);


        } else if (layoutused == 3) {

            itemView = LayoutInflater.from(mContext).inflate(R.layout.banner_two, container, false);


        }

        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
//        container.removeView((RelativeLayout) object);
    }


    interface ViewPagerCallback{
        void onViewPagerClickCallback(int position);
    }

}