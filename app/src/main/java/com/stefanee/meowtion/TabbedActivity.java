package com.stefanee.meowtion;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.support.v4.app.Fragment;


public class TabbedActivity extends AppCompatActivity {

    private static final String TAG = "TabbedActivity";

    public SectionsPageAdapter mSectionsPageAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabbed);
        Log.d(TAG, "onCreate: Starting.");

        //setup SectionPageAdapter
        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        //binding  ViewPager and TabLayout with xml files
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        mViewPager = (ViewPager) findViewById(R.id.container);

        setupViewPager(mViewPager);
        tabLayout.setupWithViewPager(mViewPager);
    }

    private void setupViewPager (ViewPager viewPager) {
        SectionsPageAdapter sectionsPageAdapteradapter = new SectionsPageAdapter(getSupportFragmentManager());
        sectionsPageAdapteradapter.addFragment(new Tab1Fragment(), "MEOW");
        sectionsPageAdapteradapter.addFragment(new Tab2Fragment(), "SECOND");
        sectionsPageAdapteradapter.addFragment(new Tab3Fragment(), "THIRD");
        viewPager.setAdapter(sectionsPageAdapteradapter);
    }

}
