package com.wireguard.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootCompletedReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(final Context context, final Intent intent) {
        if (!intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED))
            return;
        context.startService(new Intent(context, ConfigManager.class));
    }
}
