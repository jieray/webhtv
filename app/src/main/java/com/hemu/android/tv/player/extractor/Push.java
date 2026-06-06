package com.hemu.android.tv.player.extractor;

import android.net.Uri;
import android.os.SystemClock;

import com.hemu.android.tv.App;
import com.hemu.android.tv.player.Source;
import com.hemu.android.tv.ui.activity.VideoActivity;
import com.hemu.android.tv.utils.UrlUtil;

public class Push implements Source.Extractor {

    @Override
    public boolean match(Uri uri) {
        return "push".equals(UrlUtil.scheme(uri));
    }

    @Override
    public String fetch(String url) throws Exception {
        if (App.activity() != null) VideoActivity.start(App.activity(), url.substring(7));
        SystemClock.sleep(500);
        return "";
    }

    @Override
    public void stop() {
    }

    @Override
    public void exit() {
    }
}
