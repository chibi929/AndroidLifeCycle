package chibi.jp.lifecycle;

import android.app.FragmentTransaction;
import android.os.Bundle;

import chibi.jp.lifecycle.base.LifeCycleActivity;

public class AppActivity extends LifeCycleActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);

        if (savedInstanceState == null) {
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.add(R.id.container, new AppFragment());
            ft.commit();
        }
    }
}
