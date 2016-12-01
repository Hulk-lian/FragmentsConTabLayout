package com.jtcode.tablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.jtcode.tablayout.adapters.ViewPageAdapter;

public class Main_Activity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPageAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_);
        toolbar=(Toolbar)findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        //inicializar el tabLayout y crear la pestaña
        tabLayout=(TabLayout)findViewById(R.id.tablayout);

        for(String title : getResources().getStringArray(R.array.tabs)) {
            tabLayout.addTab(tabLayout.newTab().setText(title));

        }

        viewPager=(ViewPager)findViewById(R.id.viewp);
        adapter=new ViewPageAdapter(getSupportFragmentManager(),tabLayout.getTabCount(),Main_Activity.this);
        viewPager.setAdapter(adapter);

        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);
        tabLayout.setupWithViewPager(viewPager);

        //region Tabs y demas
        /*
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                //tabLayout.getTabAt(position).select();
                tabLayout.setScrollPosition(position,0f,true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        */
        //endregion
        setIcons();

        //asignar animacion
        viewPager.setPageTransformer(true, new AnimationSwip());
    }

    private void setIcons(){
        for(int i=0;i<tabLayout.getTabCount();i++){
            tabLayout.getTabAt(i).setIcon(R.drawable.icon1);
        }
    }
}
