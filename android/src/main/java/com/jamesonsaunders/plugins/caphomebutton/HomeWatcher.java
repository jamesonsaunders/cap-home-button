package com.jamesonsaunders.plugins.caphomebutton;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

public class HomeWatcher {

    static final String TAG = "hg";
    private Context mContext;
    private IntentFilter mFilter;
    private OnHomePressedListener mListener;
    private InnerReceiver mReceiver;

    public HomeWatcher(Context context) {
        mContext = context;
        mFilter = new IntentFilter(Intent.ACTION_CLOSE_SYSTEM_DIALOGS);
    }

    public void setOnHomePressedListener(OnHomePressedListener listener) {
        mListener = listener;
        mReceiver = new InnerReceiver();
    }

    public void startWatch() {
        if (mReceiver != null) {
            mContext.registerReceiver(mReceiver, mFilter);
        }
    }

    public void stopWatch() {
        if (mReceiver != null) {
            mContext.unregisterReceiver(mReceiver);
        }
    }

    class InnerReceiver extends BroadcastReceiver {

        final String SYSTEM_DIALOG_REASON_KEY = "reason";

        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action.equals(Intent.ACTION_CLOSE_SYSTEM_DIALOGS)) {
                String reason = intent.getStringExtra(SYSTEM_DIALOG_REASON_KEY);
                if (reason != null) {
                    Log.e(TAG, "action:" + action + ",reason:" + reason);
                    mListener.onHomePressed(reason);
                }
            }
        }
    }
}
