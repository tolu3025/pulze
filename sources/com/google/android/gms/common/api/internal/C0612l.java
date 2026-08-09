package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC0643s;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0612l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f5442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile a f5443b;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.l$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f5444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f5445b;

        a(Object obj, String str) {
            this.f5444a = obj;
            this.f5445b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f5444a == aVar.f5444a && this.f5445b.equals(aVar.f5445b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f5444a) * 31) + this.f5445b.hashCode();
        }
    }

    C0612l(Looper looper, Object obj, String str) {
        this.f5442a = new S.a(looper);
        this.f5443b = new a(AbstractC0643s.l(obj, "Listener must not be null"), AbstractC0643s.e(str));
    }
}
