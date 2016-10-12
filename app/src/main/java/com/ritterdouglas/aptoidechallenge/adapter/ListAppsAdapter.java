package com.ritterdouglas.aptoidechallenge.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ritterdouglas.aptoidechallenge.R;
import com.ritterdouglas.aptoidechallenge.databinding.AppItemBinding;
import com.ritterdouglas.aptoidechallenge.networking.list_apps.List;
import com.ritterdouglas.aptoidechallenge.view_model.AppItemViewModel;

import rx.Observable;
import rx.subjects.PublishSubject;

public class ListAppsAdapter extends RecyclerView.Adapter<ListAppsAdapter.CustomViewHolder> {
    private java.util.List<List> mDataset;
    PublishSubject<AppItemViewModel> clickSubject;

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        private AppItemBinding mViewDataBinding;

        public CustomViewHolder(AppItemBinding viewDataBinding) {
            super(viewDataBinding.getRoot());
            mViewDataBinding = viewDataBinding;
            mViewDataBinding.executePendingBindings();

        }

        public AppItemBinding getViewDataBinding() {
            return mViewDataBinding;
        }

    }

    public ListAppsAdapter(java.util.List<List> myDataset, PublishSubject<AppItemViewModel> clickSubject) {
        this.clickSubject = clickSubject;
        this.mDataset = myDataset;
    }

    @Override public CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        AppItemBinding appItemBinding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.app_item, viewGroup, false);
        return new CustomViewHolder(appItemBinding);
    }

    @Override public void onBindViewHolder(CustomViewHolder customViewHolder, int i) {
        AppItemBinding appItemBinding = customViewHolder.getViewDataBinding();
        appItemBinding.setViewModel(new AppItemViewModel(mDataset.get(i)));
        customViewHolder.itemView.setOnClickListener(v -> clickSubject.onNext(appItemBinding.getViewModel()));

    }

    public Observable<AppItemViewModel> getPositionClicks(){
        Log.e("PUBLISH SUBJECT", "app item view model ");
        return clickSubject.asObservable();

    }

    @Override public int getItemCount() {
        return mDataset.size();
    }
}