package berrehal_rahab_benghezal.pfe.l3app_client.ui;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;

import berrehal_rahab_benghezal.pfe.l3app_client.R;
import berrehal_rahab_benghezal.pfe.l3app_client.ui.fragments.logements.MesLogementsFragment;
import berrehal_rahab_benghezal.pfe.l3app_client.ui.fragments.notifications.MesNotificationsFragment;
import berrehal_rahab_benghezal.pfe.l3app_client.ui.fragments.profile.MyProfileFragment;
import berrehal_rahab_benghezal.pfe.l3app_client.ui.fragments.visites.MesVisitesFragment;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView navigation;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;
            switch (item.getItemId()) {
                case R.id.navigation_logements:
                    Log.e("MainActivity", "MesLogementsFragment");
                    selectedFragment = MesLogementsFragment.newInstance();
                    break;
                case R.id.navigation_notifications:
                    Log.e("MainActivity", "MesNotificationsFragment");
                    selectedFragment = MesNotificationsFragment.newInstance();
                    break;
                case R.id.navigation_visites:
                    Log.e("MainActivity", "MesVisitesFragment");
                    selectedFragment = MesVisitesFragment.newInstance();
                    break;
              /*  case R.id.navigation_map:
                    Log.e("MainActivity", "MyMapFragment");
                    selectedFragment = MyMapFragment.newInstance();
                    break;*/
                case R.id.navigation_profile:
                    Log.e("MainActivity", "MyProfileFragment");
                    selectedFragment = MyProfileFragment.newInstance();
                    break;
            }

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frame_layout, selectedFragment);
            transaction.commit();

            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.navigation_visites);

    }

}
