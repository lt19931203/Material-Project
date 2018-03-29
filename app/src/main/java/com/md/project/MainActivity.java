package com.md.project;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.md.project.mvp.view.IMvpView;
import com.md.project.utils.ToastUtils;

public class MainActivity extends AppCompatActivity implements IMvpView {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar mainToolbar = (Toolbar) findViewById(R.id.main_toolbar);
        setSupportActionBar(mainToolbar);


        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, mainToolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        /*RetrofitManager
                .getCommonApi()
                .getHotCities()
                .flatMap(new Function<HotCityModel, ObservableSource<HotCityModel.PBean>>() {
                    @Override
                    public ObservableSource<HotCityModel.PBean> apply(HotCityModel hotCityModel) throws Exception {
                        Log.i(TAG, "apply: ");
                        return Observable.fromIterable(hotCityModel.p);
                    }
                })
                .doOnNext(new Consumer<HotCityModel.PBean>() {
                    @Override
                    public void accept(HotCityModel.PBean pBean) throws Exception {
                        LogUtils.i(TAG, Thread.currentThread().getName());
                        LogUtils.i(TAG, pBean.n);
                    }
                })
                .subscribeOn(Schedulers.io())
                .subscribe();*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuitem, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        ToastUtils.showToast("hdhafdsa");
        return super.onOptionsItemSelected(item);
    }
}
