package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseIntArray f5495a = new SparseIntArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private M.j f5496b;

    public K(M.j jVar) {
        AbstractC0643s.k(jVar);
        this.f5496b = jVar;
    }

    public final int a(Context context, a.f fVar) {
        int iG;
        AbstractC0643s.k(context);
        AbstractC0643s.k(fVar);
        int i3 = 0;
        if (!fVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = fVar.getMinApkVersion();
        int iB = b(context, minApkVersion);
        if (iB != -1) {
            return iB;
        }
        SparseIntArray sparseIntArray = this.f5495a;
        synchronized (sparseIntArray) {
            int i4 = 0;
            while (true) {
                try {
                    if (i4 >= sparseIntArray.size()) {
                        i3 = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i4);
                    if (iKeyAt > minApkVersion && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    }
                    i4++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            iG = i3 == -1 ? this.f5496b.g(context, minApkVersion) : i3;
            sparseIntArray.put(minApkVersion, iG);
        }
        return iG;
    }

    public final int b(Context context, int i3) {
        int i4;
        SparseIntArray sparseIntArray = this.f5495a;
        synchronized (sparseIntArray) {
            i4 = sparseIntArray.get(i3, -1);
        }
        return i4;
    }

    public final void c() {
        SparseIntArray sparseIntArray = this.f5495a;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
    }
}
