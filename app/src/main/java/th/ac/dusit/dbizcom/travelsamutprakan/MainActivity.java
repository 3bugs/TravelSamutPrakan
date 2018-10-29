package th.ac.dusit.dbizcom.travelsamutprakan;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import th.ac.dusit.dbizcom.travelsamutprakan.fragment.DevFragment;
import th.ac.dusit.dbizcom.travelsamutprakan.fragment.GalleryFragment;
import th.ac.dusit.dbizcom.travelsamutprakan.fragment.InformationListFragment;
import th.ac.dusit.dbizcom.travelsamutprakan.fragment.ManualFragment;
import th.ac.dusit.dbizcom.travelsamutprakan.fragment.MeaningFragment;
import th.ac.dusit.dbizcom.travelsamutprakan.fragment.PurposeFragment;
import th.ac.dusit.dbizcom.travelsamutprakan.fragment.SamutPrakanFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);

        setupBottomNavigationView();
        loadGalleryFragment();
    } // ปิด onCreate

    private void setupBottomNavigationView() {
        BottomNavigationView nav = findViewById(R.id.bottom_nav);
        nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_action_main:
                        loadGalleryFragment();
                        break;
                    case R.id.nav_action_manual:
                        loadManualFragment();
                        break;
                    case R.id.nav_action_dev:
                        loadDevFragment();
                        break;
                }
                return true;
            }
        });
    }

    private void loadDevFragment() {
        setTitle("คณะผู้พัฒนา");
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new DevFragment())
                .commit();
    }

    private void loadManualFragment() {
        setTitle("คู่มือการใช้งาน");
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new ManualFragment())
                .commit();
    }

    private void loadGalleryFragment() {
        setTitle("หน้าหลัก");
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new GalleryFragment())
                .commit();
    }

    private void setTitle(String title) {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(title);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_meaning) {
            loadMeaningFragment();
        } else if (id == R.id.nav_purpose) {
            loadPurposeFragment();
        } else if (id == R.id.nav_samut_prakan) {
            loadSamutPrakanFragment();
        } else if (id == R.id.nav_place_1) {
            loadPlaceInformationList(0, "ตลาดน้ำบางน้ำผึ้ง");
        } else if (id == R.id.nav_place_2) {
            loadPlaceInformationList(1, "คุ้งบางกะเจ้า");
        } else if (id == R.id.nav_place_3) {
            loadPlaceInformationList(2, "สถานตากอากาศบางปู");
        } else if (id == R.id.nav_place_4) {
            loadPlaceInformationList(3, "วัดอโศการาม");
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void loadPlaceInformationList(int type, String name) {
        setTitle(name);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, InformationListFragment.newInstance(type))
                .commit();
    }

    private void loadSamutPrakanFragment() {
        setTitle("จังหวัดสมุทรปราการ");
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new SamutPrakanFragment())
                .commit();
    }

    private void loadPurposeFragment() {
        setTitle("จุดประสงค์การท่องเที่ยวเชิงอนุรักษ์");
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new PurposeFragment())
                .commit();
    }

    private void loadMeaningFragment() {
        setTitle("ความหมายการท่องเที่ยวเชิงอนุรักษ์");
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new MeaningFragment())
                .commit();
    }
}
