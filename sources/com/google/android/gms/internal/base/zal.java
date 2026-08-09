package com.google.android.gms.internal.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public interface zal {
    ExecutorService zaa(int i3, int i4);

    ExecutorService zab(int i3, ThreadFactory threadFactory, int i4);

    ExecutorService zac(ThreadFactory threadFactory, int i3);
}
