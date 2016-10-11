package com.ritterdouglas.aptoidechallenge.view.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.widget.Toast;

import com.ritterdouglas.aptoidechallenge.R;
import com.ritterdouglas.aptoidechallenge.adapter.ListAppsAdapter;
import com.ritterdouglas.aptoidechallenge.databinding.ActivityMainBinding;
import com.ritterdouglas.aptoidechallenge.networking.list_apps.ListAppsManager;
import com.ritterdouglas.aptoidechallenge.networking.list_apps.ListAppsResponse;
import com.ritterdouglas.aptoidechallenge.view_model.MainActivityViewModel;

import java.util.List;

import retrofit2.Response;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;

public class MainActivity extends BaseActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    private ActivityMainBinding mBinding;
    private MainActivityViewModel mViewModel;
    private Subscription listAppsSubscription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));

        mViewModel = new MainActivityViewModel(ListAppsManager.getInstance(this));

        mViewModel.listApps();

    }

    @Override protected void subscribeForNetworkRequests() {
        listAppsSubscription = mViewModel.getListAppsSubject()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new ListAppsSubscriber());
    }

    @Override protected void unsubscribeFromNetworkRequests() {
        if (listAppsSubscription != null) {
            listAppsSubscription.unsubscribe();
        }
    }

    @Override protected void reconnectWithNetworkRequests() {
        listAppsSubscription = mViewModel.createListAppsSubject()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new ListAppsSubscriber());
    }

    private class ListAppsSubscriber extends Subscriber<Response<ListAppsResponse>> {
        @Override public void onCompleted() {
            // hide progress
            Log.e(TAG, "onCompleted - load recyclerview");
            Toast.makeText(getApplicationContext(), "onCompleted", Toast.LENGTH_SHORT).show();

            // load recyclerview here

        }

        @Override public void onError(Throwable e) {
            // hide progress
            reconnectWithNetworkRequests();

            // test if errors are instanceof exceptions of our API
        }

        @Override public void onNext(Response<ListAppsResponse> o) {
            Log.e(TAG, "onNext");

            ListAppsResponse listAppsResponse = o.body();
            List<com.ritterdouglas.aptoidechallenge.networking.list_apps.List> retrievedList = listAppsResponse.getResponses().getListApps().getDatasets().getAll().getData().getList();

            mBinding.recyclerView.setAdapter(new ListAppsAdapter(retrievedList));

        }
    }

}
