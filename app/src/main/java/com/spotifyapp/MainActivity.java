package com.spotifyapp;

import android.graphics.Typeface;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;

public class MainActivity extends AppCompatActivity {

    BottomBar mBottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* TextView textView = (TextView) findViewById(R.id.MadeForYou);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/ariblk.ttf");
        textView.setTypeface(typeface);*/
        mBottomBar = BottomBar.attach(this,savedInstanceState);
        mBottomBar.setItemsFromMenu(R.menu.menu_main, new OnMenuTabClickListener() {
                    @Override
                    public void onMenuTabSelected(@IdRes int menuItemId) {
                        if (menuItemId == R.id.item_home){
                            HomeFragment f = new HomeFragment();
                            getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();

                        }
                        if (menuItemId == R.id.item_browse){
                            BrowseFragment f = new BrowseFragment();
                            getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
                        }
                        if (menuItemId == R.id.item_search){
                            SearchFragment f = new SearchFragment();
                            getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
                        }
                        if (menuItemId == R.id.item_radio){
                            RadioFragment f = new RadioFragment();
                            getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
                        }
                        if (menuItemId == R.id.item_mylibrary){
                            MyLibraryFragment f = new MyLibraryFragment();
                            getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
                        }
                    }

                    @Override
                    public void onMenuTabReSelected(@IdRes int menuItemId) {

                    }
                }
        );
        mBottomBar.mapColorForTab(0,"#222326");
        mBottomBar.mapColorForTab(1,"#222326");
        mBottomBar.mapColorForTab(2,"#222326");
        mBottomBar.mapColorForTab(3,"#222326");
        mBottomBar.mapColorForTab(4,"#222326");



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
