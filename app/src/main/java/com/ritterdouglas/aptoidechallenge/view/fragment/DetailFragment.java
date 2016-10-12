package com.ritterdouglas.aptoidechallenge.view.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ritterdouglas.aptoidechallenge.R;
import com.ritterdouglas.aptoidechallenge.databinding.FragmentDetailBinding;
import com.ritterdouglas.aptoidechallenge.networking.app_detail.DetailResponse;
import com.ritterdouglas.aptoidechallenge.networking.app_detail.Meta;
import com.ritterdouglas.aptoidechallenge.networking.app_detail.Versions;
import com.ritterdouglas.aptoidechallenge.view_model.DetailsActivityViewModel;
import com.ritterdouglas.aptoidechallenge.view_model.FragmentDetailViewModel;

public class DetailFragment extends Fragment {

    public static final String TAG = DetailFragment.class.getSimpleName();
    public static final String DETAILS = "details";
    public static final String POSITION = "position";

    private FragmentDetailViewModel mViewModel;
    public DetailFragment() {}

    public static Fragment newInstance(int position, DetailsActivityViewModel.DetailsLeanData data) {

        DetailFragment fragment = new DetailFragment();
        Bundle args = new Bundle();
        args.putInt(POSITION, position);
        args.putParcelable(DETAILS, data);
        fragment.setArguments(args);
        return fragment;
    }

    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int position = getArguments().getInt(POSITION, 0);
        DetailsActivityViewModel.DetailsLeanData data = getArguments().getParcelable(DETAILS);
        mViewModel = new FragmentDetailViewModel(data);

    }

    @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentDetailBinding mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_detail, container, false);
        mBinding.setViewModel(mViewModel);
        return mBinding.getRoot();

    }

}