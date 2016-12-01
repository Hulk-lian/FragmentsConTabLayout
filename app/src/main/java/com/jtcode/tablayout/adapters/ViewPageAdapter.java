package com.jtcode.tablayout.adapters;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.jtcode.tablayout.CustomFragment;

/**
 * Created by usuario on 30/11/16.
 */

public class ViewPageAdapter extends FragmentStatePagerAdapter {

    private int tabCount;
    public ViewPageAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount=tabCount;
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
    
}
