package com.galacticcoders.ark_explorer;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * https://www.worldnomads.com/explore/southern-asia/nepal/temples-and-cultural-must-sees-in-nepal
 * https://theplanetd.com/top-places-to-visit-in-kathmandu-nepal/
 * http://swayambhu.buddhism-foundation.org/about/
 * https://theculturetrip.com/asia/nepal/articles/nepalese-food-wholesome-himalayan-bites/
 * https://trekroute.com/adventurous-things-to-do-in-nepal/
 * https://www.adventureinyou.com/nepal/10-insanely-awesome-adventures-in-nepal/
 * http://www.himalayanglacier.com/blog/top10-adventures-in-nepal.html
 * https://conquernature.com/free-guide-ice-climbing-nepal/
 * http://himalayanecotrek.com/blog/extreme-adventure-in-nepal/
 * https://github.com/udacity/ud839_Miwok
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Find the tab layout that shows the tabs
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        // Connect the tab layout with the view pager. This will
        // 1. Update the tab layout when the view pager is swiped
        // 2. Update the view pager when a tab is selected
        // 3. Set the tab layout's tab names with the view pager's adapter's titles
        //    by calling onPageTile()
        tabLayout.setupWithViewPager(viewPager);
    }
}