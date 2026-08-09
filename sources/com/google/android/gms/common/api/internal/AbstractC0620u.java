package com.google.android.gms.common.api.internal;

import M.C0415c;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0620u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0415c[] f5461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f5462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f5463c;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.u$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private InterfaceC0617q f5464a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private C0415c[] f5466c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f5465b = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f5467d = 0;

        /* synthetic */ a(byte[] bArr) {
        }

        public AbstractC0620u a() {
            AbstractC0643s.b(this.f5464a != null, "execute parameter required");
            return new a0(this, this.f5466c, this.f5465b, this.f5467d);
        }

        public a b(InterfaceC0617q interfaceC0617q) {
            this.f5464a = interfaceC0617q;
            return this;
        }

        public a c(boolean z2) {
            this.f5465b = z2;
            return this;
        }

        public a d(C0415c... c0415cArr) {
            this.f5466c = c0415cArr;
            return this;
        }

        public a e(int i3) {
            this.f5467d = i3;
            return this;
        }

        final /* synthetic */ InterfaceC0617q f() {
            return this.f5464a;
        }
    }

    protected AbstractC0620u(C0415c[] c0415cArr, boolean z2, int i3) {
        this.f5461a = c0415cArr;
        boolean z3 = false;
        if (c0415cArr != null && z2) {
            z3 = true;
        }
        this.f5462b = z3;
        this.f5463c = i3;
    }

    public static a a() {
        return new a(null);
    }

    protected abstract void b(a.b bVar, TaskCompletionSource taskCompletionSource);

    public boolean c() {
        return this.f5462b;
    }

    public final C0415c[] d() {
        return this.f5461a;
    }

    public final int e() {
        return this.f5463c;
    }
}
