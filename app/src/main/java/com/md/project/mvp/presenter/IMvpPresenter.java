package com.md.project.mvp.presenter;

import com.md.project.mvp.view.IMvpView;

/**
 * BasePresenter
 */

public interface IMvpPresenter<V extends IMvpView> {
    //将View绑定
    void attachView(V view);

    //将View销毁
    void detachView();
}
