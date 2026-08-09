package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.C0619t;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static g a(j jVar, f fVar) {
        AbstractC0643s.l(jVar, "Result must not be null");
        AbstractC0643s.b(!jVar.getStatus().x(), "Status code must not be SUCCESS");
        o oVar = new o(fVar, jVar);
        oVar.setResult(jVar);
        return oVar;
    }

    public static g b(Status status, f fVar) {
        AbstractC0643s.l(status, "Result must not be null");
        C0619t c0619t = new C0619t(fVar);
        c0619t.setResult(status);
        return c0619t;
    }
}
