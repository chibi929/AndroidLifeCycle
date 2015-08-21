package chibi.jp.lifecycle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import chibi.jp.lifecycle.base.LifeCycleV4Fragment;

public class V4AppFragment extends LifeCycleV4Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_v4_app, container, false);
    }
}
