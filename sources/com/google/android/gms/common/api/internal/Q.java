package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.internal.AbstractC0629d;
import com.google.android.gms.common.internal.C0631f;
import com.google.android.gms.common.internal.C0644t;
import com.google.android.gms.common.internal.C0645u;
import com.google.android.gms.tasks.OnCompleteListener;

/* JADX INFO: loaded from: classes.dex */
final class Q implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0607g f5368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0602b f5370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f5371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f5372e;

    Q(C0607g c0607g, int i3, C0602b c0602b, long j3, long j4, String str, String str2) {
        this.f5368a = c0607g;
        this.f5369b = i3;
        this.f5370c = c0602b;
        this.f5371d = j3;
        this.f5372e = j4;
    }

    static Q a(C0607g c0607g, int i3, C0602b c0602b) {
        boolean zV;
        if (!c0607g.x()) {
            return null;
        }
        C0645u c0645uA = C0644t.b().a();
        if (c0645uA == null) {
            zV = true;
        } else {
            if (!c0645uA.u()) {
                return null;
            }
            zV = c0645uA.v();
            G gS = c0607g.s(c0602b);
            if (gS != null) {
                if (!(gS.w() instanceof AbstractC0629d)) {
                    return null;
                }
                AbstractC0629d abstractC0629d = (AbstractC0629d) gS.w();
                if (abstractC0629d.hasConnectionInfo() && !abstractC0629d.isConnecting()) {
                    C0631f c0631fB = b(gS, abstractC0629d, i3);
                    if (c0631fB == null) {
                        return null;
                    }
                    gS.G();
                    zV = c0631fB.w();
                }
            }
        }
        return new Q(c0607g, i3, c0602b, zV ? System.currentTimeMillis() : 0L, zV ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static C0631f b(G g3, AbstractC0629d abstractC0629d, int i3) {
        int[] iArrT;
        int[] iArrU;
        C0631f telemetryConfiguration = abstractC0629d.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.v() || ((iArrT = telemetryConfiguration.t()) != null ? !com.google.android.gms.common.util.b.a(iArrT, i3) : !((iArrU = telemetryConfiguration.u()) == null || !com.google.android.gms.common.util.b.a(iArrU, i3))) || g3.F() >= telemetryConfiguration.s()) {
            return null;
        }
        return telemetryConfiguration;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d8  */
    @Override // com.google.android.gms.tasks.OnCompleteListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onComplete(com.google.android.gms.tasks.Task r26) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.Q.onComplete(com.google.android.gms.tasks.Task):void");
    }
}
