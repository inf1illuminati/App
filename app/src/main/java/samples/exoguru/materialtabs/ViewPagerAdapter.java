package samples.exoguru.materialtabs;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 *
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    CharSequence Titles[]; //slaat het aantal tabs op
    int NumbOfTabs; 


   //constructor
    public ViewPagerAdapter(FragmentManager fm,CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);

        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;

    }

   //returnt fragments van de tabs
    @Override
    public Fragment getItem(int position) {

        if(position == 0) 
        {
            Tab1 tab1 = new Tab1();
            return tab1;
        }
        else            
        {
            Tab2 tab2 = new Tab2();
            return tab2;
        }


    }

    //returnt de titels

    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }

    // returnt aantal tabs

    @Override
    public int getCount() {
        return NumbOfTabs;
    }
}
