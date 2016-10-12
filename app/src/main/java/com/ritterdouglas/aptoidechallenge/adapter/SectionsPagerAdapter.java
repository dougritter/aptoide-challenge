package com.ritterdouglas.aptoidechallenge.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ritterdouglas.aptoidechallenge.view.fragment.DetailFragment;
import com.ritterdouglas.aptoidechallenge.view_model.FragmentDetailViewModel;

import java.util.List;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    List<FragmentDetailViewModel> dataset;

    public SectionsPagerAdapter(FragmentManager fm, List<FragmentDetailViewModel> dataset) {
        super(fm);
        this.dataset = dataset;
    }

    @Override public Fragment getItem(int position) {
        return DetailFragment.newInstance(position, dataset.get(position).getModel());
    }

    @Override public int getCount() {
        return dataset.size();
    }

    @Override public CharSequence getPageTitle(int position) {
        return null;
    }
}