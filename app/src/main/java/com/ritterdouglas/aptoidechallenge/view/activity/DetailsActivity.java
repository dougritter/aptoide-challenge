package com.ritterdouglas.aptoidechallenge.view.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.ritterdouglas.aptoidechallenge.R;
import com.ritterdouglas.aptoidechallenge.adapter.ListAppsAdapter;
import com.ritterdouglas.aptoidechallenge.databinding.ActivityDetailsBinding;
import com.ritterdouglas.aptoidechallenge.networking.app_detail.AppDetailManager;
import com.ritterdouglas.aptoidechallenge.networking.app_detail.DetailResponse;
import com.ritterdouglas.aptoidechallenge.networking.list_apps.List;
import com.ritterdouglas.aptoidechallenge.networking.list_apps.ListAppsResponse;
import com.ritterdouglas.aptoidechallenge.view_model.DetailsActivityViewModel;

import retrofit2.Response;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;

public class DetailsActivity extends BaseActivity {

    public static final String TAG = DetailsActivity.class.getSimpleName();

    private ActivityDetailsBinding mBinding;
    private DetailsActivityViewModel mViewModel;
    private Subscription appDetailsSubscription;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_details);
        mViewModel = new DetailsActivityViewModel(AppDetailManager.getInstance(this), getIntent());

    }

    @Override protected void subscribeForNetworkRequests() {
        appDetailsSubscription = mViewModel.getAppDetailSubject()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new DetailsActivity.AppDetailsSubscriber());
    }

    @Override protected void unsubscribeFromNetworkRequests() {
        if (appDetailsSubscription != null) {
            appDetailsSubscription.unsubscribe();
        }
    }

    @Override protected void reconnectWithNetworkRequests() {
        appDetailsSubscription= mViewModel.createAppDetailSubject()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new DetailsActivity.AppDetailsSubscriber());
    }

    private class AppDetailsSubscriber extends Subscriber<Response<DetailResponse>> {
        @Override public void onCompleted() {
            // hide progress
            Log.e(TAG, "onCompleted - load data on screen");

        }

        @Override public void onError(Throwable e) {
            // hide progress
            reconnectWithNetworkRequests();

            // test if errors are instanceof exceptions of our API
        }

        @Override public void onNext(Response<DetailResponse> o) {
            Log.e(TAG, "onNext");

            /*ListAppsResponse listAppsResponse = o.body();
            java.util.List<List> retrievedList = listAppsResponse.getResponses().getListApps().getDatasets().getAll().getData().getList();

            mBinding.recyclerView.setAdapter(new ListAppsAdapter(retrievedList));*/

        }
    }
}
