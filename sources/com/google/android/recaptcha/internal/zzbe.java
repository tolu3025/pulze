package com.google.android.recaptcha.internal;

import I1.q;
import J1.G;
import J1.N;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class zzbe {
    public zzbe() {
        new ConcurrentHashMap();
        zzb();
    }

    public static final Set zza(Context context) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Object systemService = context.getSystemService("connectivity");
            m.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                linkedHashSet.add(zzqi.TRANSPORT_WIFI);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                linkedHashSet.add(zzqi.TRANSPORT_CELLULAR);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                linkedHashSet.add(zzqi.TRANSPORT_VPN);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(3)) {
                linkedHashSet.add(zzqi.TRANSPORT_ETHERNET);
            }
            if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                linkedHashSet.add(zzqi.NET_CAPABILITY_VALIDATED);
            }
            return linkedHashSet;
        } catch (Exception unused) {
            return N.b();
        }
    }

    private static final Map zzb() {
        Map mapF = G.f(q.a(0, zzqi.NET_CAPABILITY_MMS), q.a(1, zzqi.NET_CAPABILITY_SUPL), q.a(2, zzqi.NET_CAPABILITY_DUN), q.a(3, zzqi.NET_CAPABILITY_FOTA), q.a(4, zzqi.NET_CAPABILITY_IMS), q.a(5, zzqi.NET_CAPABILITY_CBS), q.a(6, zzqi.NET_CAPABILITY_WIFI_P2P), q.a(7, zzqi.NET_CAPABILITY_IA), q.a(8, zzqi.NET_CAPABILITY_RCS), q.a(9, zzqi.NET_CAPABILITY_XCAP), q.a(10, zzqi.NET_CAPABILITY_EIMS), q.a(11, zzqi.NET_CAPABILITY_NOT_METERED), q.a(12, zzqi.NET_CAPABILITY_INTERNET), q.a(13, zzqi.NET_CAPABILITY_NOT_RESTRICTED), q.a(14, zzqi.NET_CAPABILITY_TRUSTED), q.a(15, zzqi.NET_CAPABILITY_NOT_VPN));
        int i3 = Build.VERSION.SDK_INT;
        mapF.put(17, zzqi.NET_CAPABILITY_CAPTIVE_PORTAL);
        mapF.put(16, zzqi.NET_CAPABILITY_VALIDATED);
        if (i3 >= 28) {
            mapF.put(18, zzqi.NET_CAPABILITY_NOT_ROAMING);
            mapF.put(19, zzqi.NET_CAPABILITY_FOREGROUND);
            mapF.put(20, zzqi.NET_CAPABILITY_NOT_CONGESTED);
            mapF.put(21, zzqi.NET_CAPABILITY_NOT_SUSPENDED);
        }
        if (i3 >= 29) {
            mapF.put(23, zzqi.NET_CAPABILITY_MCX);
        }
        if (i3 >= 30) {
            mapF.put(25, zzqi.NET_CAPABILITY_TEMPORARILY_NOT_METERED);
        }
        if (i3 >= 31) {
            mapF.put(32, zzqi.NET_CAPABILITY_HEAD_UNIT);
            mapF.put(29, zzqi.NET_CAPABILITY_ENTERPRISE);
        }
        if (i3 >= 33) {
            mapF.put(35, zzqi.NET_CAPABILITY_PRIORITIZE_BANDWIDTH);
            mapF.put(34, zzqi.NET_CAPABILITY_PRIORITIZE_LATENCY);
            mapF.put(33, zzqi.NET_CAPABILITY_MMTEL);
        }
        return mapF;
    }
}
