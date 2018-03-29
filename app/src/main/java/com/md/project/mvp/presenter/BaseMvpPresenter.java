package com.md.project.mvp.presenter;

import com.md.project.mvp.view.IMvpView;

/**
 * Created by TT on 2018/3/26.
 */

public abstract class BaseMvpPresenter<V extends IMvpView> implements IMvpPresenter<V> {
    public V MvpView;

    @Override
    public void attachView(V view) {
        MvpView = view;
    }

    @Override
    public void detachView() {
        MvpView = null;
    }
}
