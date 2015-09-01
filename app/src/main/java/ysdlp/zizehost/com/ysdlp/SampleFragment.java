package ysdlp.zizehost.com.ysdlp;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public class SampleFragment extends Fragment {

    private static final String ARG_POSITION = "position";

    private int position;

    public static SampleFragment newInstance(int position) {
        SampleFragment f = new SampleFragment();
        Bundle b = new Bundle();
        b.putInt(ARG_POSITION, position);
        f.setArguments(b);
        return f;
    }



}