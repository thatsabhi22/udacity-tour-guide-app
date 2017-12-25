package com.theleafapps.pro.Adpater;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.theleafapps.pro.Fragments.EventsFragment;
import com.theleafapps.pro.Fragments.HistoricalSiteFragment;
import com.theleafapps.pro.Fragments.ReligiousSiteFragment;
import com.theleafapps.pro.Fragments.RestaurantFragment;

/**
 * Created by aviator on 25/12/17.
 */

public class TourGuideFragmentPagerAdapter extends FragmentPagerAdapter{

    private String tabTitles[] = new String[]{"Events", "Restaurant", "Religious", "Historical"};

    public TourGuideFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new EventsFragment();
        } else if (position == 1) {
            return new RestaurantFragment();
        } else if (position == 2) {
            return new ReligiousSiteFragment();
        } else {
            return new HistoricalSiteFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
