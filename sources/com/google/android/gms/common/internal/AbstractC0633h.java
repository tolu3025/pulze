package com.google.android.gms.common.internal;

import M.C0415c;
import M.C0421i;
import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.InterfaceC0606f;
import com.google.android.gms.common.api.internal.InterfaceC0614n;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0633h extends AbstractC0629d implements a.f {
    private static volatile Executor zaa;
    private final C0630e zab;
    private final Set zac;
    private final Account zad;

    protected AbstractC0633h(Context context, Looper looper, int i3, C0630e c0630e, f.a aVar, f.b bVar) {
        this(context, looper, i3, c0630e, (InterfaceC0606f) aVar, (InterfaceC0614n) bVar);
    }

    private final Set d(Set set) {
        Set<Scope> setValidateScopes = validateScopes(set);
        Iterator<Scope> it = setValidateScopes.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return setValidateScopes;
    }

    public static void zag(Executor executor) {
        zaa = executor;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    public final Account getAccount() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    protected Executor getBindServiceExecutor() {
        return zaa;
    }

    protected final C0630e getClientSettings() {
        return this.zab;
    }

    public C0415c[] getRequiredFeatures() {
        return new C0415c[0];
    }

    @Override // com.google.android.gms.common.internal.AbstractC0629d
    protected final Set<Scope> getScopes() {
        return this.zac;
    }

    @Override // com.google.android.gms.common.api.a.f
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zac : Collections.emptySet();
    }

    protected Set<Scope> validateScopes(Set<Scope> set) {
        return set;
    }

    protected AbstractC0633h(Context context, Looper looper, int i3, C0630e c0630e, InterfaceC0606f interfaceC0606f, InterfaceC0614n interfaceC0614n) {
        this(context, looper, AbstractC0634i.a(context), C0421i.m(), i3, c0630e, (InterfaceC0606f) AbstractC0643s.k(interfaceC0606f), (InterfaceC0614n) AbstractC0643s.k(interfaceC0614n));
    }

    protected AbstractC0633h(Context context, Looper looper, AbstractC0634i abstractC0634i, C0421i c0421i, int i3, C0630e c0630e, InterfaceC0606f interfaceC0606f, InterfaceC0614n interfaceC0614n) {
        super(context, looper, abstractC0634i, c0421i, i3, interfaceC0606f == null ? null : new I(interfaceC0606f), interfaceC0614n == null ? null : new J(interfaceC0614n), c0630e.h());
        this.zab = c0630e;
        this.zad = c0630e.a();
        this.zac = d(c0630e.d());
    }
}
