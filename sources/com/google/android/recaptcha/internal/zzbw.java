package com.google.android.recaptcha.internal;

import M1.g;
import U1.l;
import U1.p;
import c2.InterfaceC0561f0;
import c2.InterfaceC0589u;
import c2.InterfaceC0593w;
import c2.InterfaceC0595x;
import c2.InterfaceC0600z0;
import c2.V;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class zzbw implements V {
    private final /* synthetic */ InterfaceC0595x zza;

    zzbw(InterfaceC0595x interfaceC0595x) {
        this.zza = interfaceC0595x;
    }

    @Override // c2.InterfaceC0600z0
    public final InterfaceC0589u attachChild(InterfaceC0593w interfaceC0593w) {
        return this.zza.attachChild(interfaceC0593w);
    }

    @Override // c2.V
    public final Object await(M1.d dVar) {
        return this.zza.await(dVar);
    }

    @Override // c2.InterfaceC0600z0
    public final /* synthetic */ void cancel() {
        this.zza.cancel();
    }

    @Override // M1.g.b, M1.g
    public final Object fold(Object obj, p pVar) {
        return this.zza.fold(obj, pVar);
    }

    @Override // M1.g.b, M1.g
    public final g.b get(g.c cVar) {
        return this.zza.get(cVar);
    }

    @Override // c2.InterfaceC0600z0
    public final CancellationException getCancellationException() {
        return this.zza.getCancellationException();
    }

    @Override // c2.InterfaceC0600z0
    public final a2.c getChildren() {
        return this.zza.getChildren();
    }

    @Override // c2.V
    public final Object getCompleted() {
        return this.zza.getCompleted();
    }

    @Override // c2.V
    public final Throwable getCompletionExceptionOrNull() {
        return this.zza.getCompletionExceptionOrNull();
    }

    @Override // M1.g.b
    public final g.c getKey() {
        return this.zza.getKey();
    }

    @Override // c2.V
    public final k2.c getOnAwait() {
        return this.zza.getOnAwait();
    }

    @Override // c2.InterfaceC0600z0
    public final k2.a getOnJoin() {
        return this.zza.getOnJoin();
    }

    @Override // c2.InterfaceC0600z0
    public final InterfaceC0600z0 getParent() {
        return this.zza.getParent();
    }

    @Override // c2.InterfaceC0600z0
    public final InterfaceC0561f0 invokeOnCompletion(l lVar) {
        return this.zza.invokeOnCompletion(lVar);
    }

    @Override // c2.InterfaceC0600z0
    public final boolean isActive() {
        return this.zza.isActive();
    }

    @Override // c2.InterfaceC0600z0
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // c2.InterfaceC0600z0
    public final boolean isCompleted() {
        return this.zza.isCompleted();
    }

    @Override // c2.InterfaceC0600z0
    public final Object join(M1.d dVar) {
        return this.zza.join(dVar);
    }

    @Override // M1.g.b, M1.g
    public final g minusKey(g.c cVar) {
        return this.zza.minusKey(cVar);
    }

    @Override // M1.g
    public final g plus(g gVar) {
        return this.zza.plus(gVar);
    }

    @Override // c2.InterfaceC0600z0
    public final boolean start() {
        return this.zza.start();
    }

    @Override // c2.InterfaceC0600z0
    public final void cancel(CancellationException cancellationException) {
        this.zza.cancel(cancellationException);
    }

    @Override // c2.InterfaceC0600z0
    public final InterfaceC0561f0 invokeOnCompletion(boolean z2, boolean z3, l lVar) {
        return this.zza.invokeOnCompletion(z2, z3, lVar);
    }

    @Override // c2.InterfaceC0600z0
    public final InterfaceC0600z0 plus(InterfaceC0600z0 interfaceC0600z0) {
        return this.zza.plus(interfaceC0600z0);
    }

    @Override // c2.InterfaceC0600z0
    public final /* synthetic */ boolean cancel(Throwable th) {
        return this.zza.cancel(th);
    }
}
