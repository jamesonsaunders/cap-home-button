package com.jamesonsaunders.plugins.caphomebutton;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "CapHomeButton")
public class CapHomeButtonPlugin extends Plugin {

    private CapHomeButton implementation = new CapHomeButton();

    @Override
    public void load() {
        super.load();

        HomeWatcher mHomeWatcher = new HomeWatcher(bridge.getContext());
        mHomeWatcher.setOnHomePressedListener(
            new OnHomePressedListener() {
                @Override
                public void onHomePressed(String reason) {
                    JSObject ret = new JSObject();
                    ret.put("reason", reason);
                    notifyListeners("homePress", ret);
                }
            }
        );
        mHomeWatcher.startWatch();
    }
}
