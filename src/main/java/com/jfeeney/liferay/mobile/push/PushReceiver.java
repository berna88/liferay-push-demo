package com.jfeeney.liferay.mobile.push;

import com.liferay.mobile.push.PushNotificationsReceiver;

public class PushReceiver extends PushNotificationsReceiver {
    @Override
    public String getServiceClassName() {
        return PushService.class.getName();
    }
}
