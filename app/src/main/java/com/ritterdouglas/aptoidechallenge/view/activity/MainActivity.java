package com.ritterdouglas.aptoidechallenge.view.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.ritterdouglas.aptoidechallenge.R;
import com.ritterdouglas.aptoidechallenge.databinding.ActivityMainBinding;
import com.ritterdouglas.aptoidechallenge.networking.list_apps.ListAppsAPIService;
import com.ritterdouglas.aptoidechallenge.networking.list_apps.ListAppsManager;
import com.ritterdouglas.aptoidechallenge.view_model.MainActivityViewModel;

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
        listAppsSubscription = mViewModel.createSearchSubject()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new ListAppsSubscriber());
    }

    private class ListAppsSubscriber extends Subscriber<Object> {
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

        @Override public void onNext(Object o) {
            Log.e(TAG, "onNext");

        }
    }

}
