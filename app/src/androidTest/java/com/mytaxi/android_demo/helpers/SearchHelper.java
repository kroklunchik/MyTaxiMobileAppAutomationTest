package com.mytaxi.android_demo.helpers;

import android.support.test.espresso.matcher.RootMatchers;
import com.mytaxi.android_demo.R;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


/************************************************************************************/
//Helper performs search actions on Main activity
/************************************************************************************/
public class SearchHelper extends HelperBase {

    public void pickSearchResultByName(String name) {
        onView(withText(name))
                .inRoot(RootMatchers.isPlatformPopup())
                .perform(click());
    }

    public void typeSearchQuery(String searchQuery) {
        typeIntoViewWithId(searchQuery,R.id.textSearch);
    }
}
