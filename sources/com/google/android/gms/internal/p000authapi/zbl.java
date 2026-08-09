package com.google.android.gms.internal.p000authapi;

import D.a;
import F.a;
import android.app.PendingIntent;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: loaded from: classes.dex */
public final class zbl implements a {
    public final g delete(f fVar, Credential credential) {
        AbstractC0643s.l(fVar, "client must not be null");
        AbstractC0643s.l(credential, "credential must not be null");
        return fVar.b(new zbi(this, fVar, credential));
    }

    public final g disableAutoSignIn(f fVar) {
        AbstractC0643s.l(fVar, "client must not be null");
        return fVar.b(new zbj(this, fVar));
    }

    public final PendingIntent getHintPickerIntent(f fVar, HintRequest hintRequest) {
        AbstractC0643s.l(fVar, "client must not be null");
        AbstractC0643s.l(hintRequest, "request must not be null");
        a.C0005a c0005aZba = ((zbo) fVar.d(D.a.f1230g)).zba();
        return zbn.zba(fVar.e(), c0005aZba, hintRequest, c0005aZba.d());
    }

    public final g request(f fVar, com.google.android.gms.auth.api.credentials.a aVar) {
        AbstractC0643s.l(fVar, "client must not be null");
        AbstractC0643s.l(aVar, "request must not be null");
        return fVar.a(new zbg(this, fVar, aVar));
    }

    public final g save(f fVar, Credential credential) {
        AbstractC0643s.l(fVar, "client must not be null");
        AbstractC0643s.l(credential, "credential must not be null");
        return fVar.b(new zbh(this, fVar, credential));
    }
}
