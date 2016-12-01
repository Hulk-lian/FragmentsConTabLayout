package com.jtcode.tablayout.adapters;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.jtcode.tablayout.CustomFragment;
import com.jtcode.tablayout.R;


public class ViewPageAdapter extends FragmentStatePagerAdapter {

    private int tabCount;
    private Context context;
    public ViewPageAdapter(FragmentManager fm, int tabCount,Context context) {
        super(fm);
        this.tabCount=tabCount;
        this.context=context;
    }

    @Override
    public Fragment getItem(int position) {
        CustomFragment customFragment=null;
        Bundle bundle= new Bundle();

        switch (position){
            case 0:
                bundle.putString(CustomFragment.KEY_REG_TEXT,"Tab 1");
                customFragment= (CustomFragment) CustomFragment.newInstance(bundle);
                break;
            case 1:
                bundle.putString(CustomFragment.KEY_REG_TEXT,"Tab 2");
                customFragment= (CustomFragment) CustomFragment.newInstance(bundle);
                break;
            case 2:
                bundle.putString(CustomFragment.KEY_REG_TEXT,"Tab 3");
                customFragment= (CustomFragment) CustomFragment.newInstance(bundle);
                break;
            case 3:
                bundle.putString(CustomFragment.KEY_REG_TEXT,"Tab 4");
                customFragment= (CustomFragment) CustomFragment.newInstance(bundle);
                break;
            case 4:
                bundle.putString(CustomFragment.KEY_REG_TEXT,"Tab 5");
                customFragment=(CustomFragment) CustomFragment.newInstance(bundle);
                break;

        }
        return customFragment;
    }

    @Override
    public int getCount() {
        return tabCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return context.getResources().getStringArray(R.array.tabs)[position];
    }
}
