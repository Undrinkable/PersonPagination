package com.me.hannah.personpagination;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by hannah on 1/10/17.
 */
public class PersonListPagerAdapter extends FragmentPagerAdapter {
    public PersonListPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public Fragment getItem(int position) {
        return new PersonListFragment();
    }

}
