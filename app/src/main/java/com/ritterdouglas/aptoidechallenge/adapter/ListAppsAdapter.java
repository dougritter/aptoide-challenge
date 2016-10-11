package com.ritterdouglas.aptoidechallenge.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ritterdouglas.aptoidechallenge.R;
import com.ritterdouglas.aptoidechallenge.databinding.AppItemBinding;
import com.ritterdouglas.aptoidechallenge.networking.list_apps.List;
import com.ritterdouglas.aptoidechallenge.view_model.AppItemViewModel;

public class ListAppsAdapter extends RecyclerView.Adapter<ListAppsAdapter.CustomViewHolder> {
    private java.util.List<List> mDataset;

    public void setDataset(java.util.List<List> mDataset) {
        this.mDataset = mDataset;
    }


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

    public ListAppsAdapter(java.util.List<List> myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        AppItemBinding appItemBinding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.app_item, viewGroup, false);
        return new CustomViewHolder(appItemBinding);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder customViewHolder, int i) {
        AppItemBinding appItemBinding = customViewHolder.getViewDataBinding();
        appItemBinding.setViewModel(new AppItemViewModel(mDataset.get(i)));

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}