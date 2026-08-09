package com.google.android.gms.common.api;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    public interface a {
        void a(Status status);
    }

    public abstract void addStatusListener(a aVar);

    public abstract j await(long j3, TimeUnit timeUnit);
}
