package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0623x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f5473a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f5474b = Collections.synchronizedMap(new WeakHashMap());

    private final void h(boolean z2, Status status) {
        HashMap map;
        HashMap map2;
        Map map3 = this.f5473a;
        synchronized (map3) {
            map = new HashMap(map3);
        }
        Map map4 = this.f5474b;
        synchronized (map4) {
            map2 = new HashMap(map4);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z2 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z2 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new com.google.android.gms.common.api.b(status));
            }
        }
    }

    final void a(BasePendingResult basePendingResult, boolean z2) {
        this.f5473a.put(basePendingResult, Boolean.valueOf(z2));
        basePendingResult.addStatusListener(new q0(this, basePendingResult));
    }

    final void b(TaskCompletionSource taskCompletionSource, boolean z2) {
        this.f5474b.put(taskCompletionSource, Boolean.valueOf(z2));
        taskCompletionSource.getTask().addOnCompleteListener(new r0(this, taskCompletionSource));
    }

    final boolean c() {
        return (this.f5473a.isEmpty() && this.f5474b.isEmpty()) ? false : true;
    }

    public final void d() {
        h(false, C0607g.f5412p);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void e(int r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "The connection to Google Play services was lost"
            r0.<init>(r1)
            r1 = 1
            if (r4 != r1) goto L10
            java.lang.String r4 = " due to service disconnection."
        Lc:
            r0.append(r4)
            goto L16
        L10:
            r2 = 3
            if (r4 != r2) goto L16
            java.lang.String r4 = " due to dead object exception."
            goto Lc
        L16:
            if (r5 == 0) goto L20
            java.lang.String r4 = " Last reason for disconnect: "
            r0.append(r4)
            r0.append(r5)
        L20:
            java.lang.String r4 = r0.toString()
            com.google.android.gms.common.api.Status r5 = new com.google.android.gms.common.api.Status
            r0 = 20
            r5.<init>(r0, r4)
            r3.h(r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C0623x.e(int, java.lang.String):void");
    }

    final /* synthetic */ Map f() {
        return this.f5473a;
    }

    final /* synthetic */ Map g() {
        return this.f5474b;
    }
}
