package chibi.jp.lifecycle;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;

import chibi.jp.lifecycle.base.LifeCycleFragmentActivity;

public class V4AppActivity extends LifeCycleFragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v4_app);

        if (savedInstanceState == null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.add(R.id.container, new V4AppFragment());
            ft.commit();
        }
    }
}
