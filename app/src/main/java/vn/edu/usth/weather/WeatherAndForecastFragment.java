package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class WeatherAndForecastFragment extends FragmentPagerAdapter {
    private final int PAGE_COUNT = 3;
    private String[] titles = new String[]{"Hanoi", "Paris", "Toulouse"};

    public WeatherAndForecastFragment(FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT; // number of pages for a ViewPager
    }

    @Override
    public Fragment getItem(int page) {
        // returns an instance of Fragment corresponding to the specified page
        switch (page) {
            case 0:
                return WeatherFragment.newInstance(titles[0]);
            case 1:
                return WeatherFragment.newInstance(titles[1]);
            case 2:
                return WeatherFragment.newInstance(titles[2]);
            default:
                return null; // safe
        }
    }

    @Override
    public CharSequence getPageTitle(int page) {
        // returns a tab title corresponding to the specified page
        return titles[page];
    }
}