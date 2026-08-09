package c2;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class W0 extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient InterfaceC0600z0 f5112a;

    public W0(String str) {
        this(str, null);
    }

    public W0(String str, InterfaceC0600z0 interfaceC0600z0) {
        super(str);
        this.f5112a = interfaceC0600z0;
    }
}
