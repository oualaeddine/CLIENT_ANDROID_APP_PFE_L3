package berrehal_rahab_benghezal.pfe.l3app_client.ui;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import berrehal_rahab_benghezal.pfe.l3app_client.R;
import berrehal_rahab_benghezal.pfe.l3app_client.ui.fragments.logements.MesLogementsFragment;
import berrehal_rahab_benghezal.pfe.l3app_client.ui.fragments.notifications.MesNotificationsFragment;
import berrehal_rahab_benghezal.pfe.l3app_client.ui.fragments.visites.MesVisitesFragment;
import berrehal_rahab_benghezal.pfe.l3app_client.ui.fragments.map.MyMapFragment;
import berrehal_rahab_benghezal.pfe.l3app_client.ui.fragments.MyProfileFragment;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;

            switch (item.getItemId()) {
                case R.id.navigation_logements:
                    selectedFragment = MesLogementsFragment.newInstance();
                    break;
                case R.id.navigation_notifications:
                    selectedFragment = MesNotificationsFragment.newInstance();
                    break;
                case R.id.navigation_visites:
                    selectedFragment = MesVisitesFragment.newInstance();
                    break;
                case R.id.navigation_map:
                    selectedFragment = MyMapFragment.newInstance();
                    break;
                case R.id.navigation_profile:
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

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
