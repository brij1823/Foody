package com.example.guanzhuli.foody.HomePage.fragment;
// Lily: Designed UI.
//       Set fragment replacement.
//       Implemented custom animation.
//       Initialized view and tab switch.
// Xiao: Implemented change city function.
//

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.guanzhuli.foody.HomePage.Categories;
import com.example.guanzhuli.foody.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private SectionsPagerAdapter mSectionsPagerAdapter;
    String name;



    public HomeFragment() {
        // Required empty public constructor
        name= Categories.code;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        mSectionsPagerAdapter =  new SectionsPagerAdapter(getChildFragmentManager());
        mTabLayout = (TabLayout) view.findViewById(R.id.home_tabLayout);
        mTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        mViewPager = (ViewPager) view.findViewById(R.id.home_pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                mTabLayout.setScrollPosition(position, 0, true);
                mTabLayout.setSelected(true);
                mViewPager.getParent().requestDisallowInterceptTouchEvent(true);
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


        return view;
    }

    class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (name) {
                case "pizza":
                    AllTabFragment tab1 = new AllTabFragment();
                    return tab1;
                case "sandwich":
                    VegTabFragment tab2 = new VegTabFragment();
                    return tab2;
                case "starters":
                    NonVegTabFragment tab3 = new NonVegTabFragment();
                    return tab3;
                case "indian food":
                    IndianFragment tab4=new IndianFragment();
                    return  tab4;

                case "chinese food":
                    Chinese_Fragment tab5=new Chinese_Fragment();
                    return tab5;
                case "punjabi food":
                    Punjabi_Fragment tab6=new Punjabi_Fragment();
                    return tab6;
                case "biryani":
                    Biryani_Fragment tab7=new Biryani_Fragment();
                    return tab7;
                case "frankie":
                      Frankie_Fragment tab8=new Frankie_Fragment();
                      return tab8;


                default:
                    break;
            }
            return null;
        }

        @Override
        public int getCount() {
            return 1;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (name) {
                case "pizza":
                    return "Pizza";
                case "sandwich":
                    return "Sandwich";
                case "starters":
                    return "Starters";
                case "indian food":
                    return "Indian Food";
                case "chinese food":
                    return  "Chinese Food";
                case "punjabi food":
                    return "Punjabi";
                case "biryani":
                    return  "Biryani";
                case "frankie":
                    return "Frankie";
                default:
                    break;
            }
            return null;
        }
    }

}
