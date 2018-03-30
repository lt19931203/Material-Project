package com.md.project;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.md.project.factory.MainFragmentFactory;
import com.md.project.mvp.view.IMvpView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements IMvpView {
    private static final String TAG = "MainActivity";

    @BindView(R.id.main_toolbar)
    Toolbar mainToolbar;
    @BindView(R.id.tab_layout)
    TabLayout tabLayout;
    @BindView(R.id.view_pager)
    ViewPager viewPager;
    @BindView(R.id.nav_view)
    NavigationView navView;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);



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
                        //目前以南京，id 628为准
                    }
                })
                .subscribeOn(Schedulers.io())
                .subscribe();*/

        setSupportActionBar(mainToolbar);

        //侧边栏绑定Toolbar
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, mainToolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        tabLayout.setupWithViewPager(viewPager);

        viewPager.setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return MainFragmentFactory.getMainFragment(position);
            }

            @Override
            public int getCount() {
                return MainFragmentFactory.getMainFragmentCount();
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return MainFragmentFactory.getMainFragmentTitle(position);
            }
        });


        //addTab一定要在  setupWithViewPager 和 setAdapter之后，重写了getPageTitle之后，不需要再添加Tab
//        tabLayout.addTab(tabLayout.newTab().setText(MainFragmentFactory.getMainFragmentTitle(0)));
//        tabLayout.addTab(tabLayout.newTab().setText(MainFragmentFactory.getMainFragmentTitle(1)));
//        tabLayout.addTab(tabLayout.newTab().setText(MainFragmentFactory.getMainFragmentTitle(2)));
//        tabLayout.addTab(tabLayout.newTab().setText(MainFragmentFactory.getMainFragmentTitle(3)));



        /*viewPager.setAdapter(new FragmentPagerAdapter() {
            @Override
            public Fragment getItem(int position) {
                return null;
            }

            @Override
            public int getCount() {
                return 0;
            }
        });*/

    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }*/
}
