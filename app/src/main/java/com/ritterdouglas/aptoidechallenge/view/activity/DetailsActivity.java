package com.ritterdouglas.aptoidechallenge.view.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ritterdouglas.aptoidechallenge.R;
import com.ritterdouglas.aptoidechallenge.databinding.ActivityDetailsBinding;

public class DetailsActivity extends BaseActivity {

    ActivityDetailsBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_details);


    }

    @Override
    protected void subscribeForNetworkRequests() {

    }

    @Override
    protected void unsubscribeFromNetworkRequests() {

    }

    @Override
    protected void reconnectWithNetworkRequests() {

    }
}
