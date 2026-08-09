package androidx.lifecycle;

import androidx.lifecycle.AbstractC0516e;

/* JADX INFO: loaded from: classes.dex */
public final class CompositeGeneratedAdaptersObserver implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0514c[] f4698a;

    public CompositeGeneratedAdaptersObserver(InterfaceC0514c[] generatedAdapters) {
        kotlin.jvm.internal.m.e(generatedAdapters, "generatedAdapters");
        this.f4698a = generatedAdapters;
    }

    @Override // androidx.lifecycle.g
    public void d(i source, AbstractC0516e.a event) {
        kotlin.jvm.internal.m.e(source, "source");
        kotlin.jvm.internal.m.e(event, "event");
        new l();
        InterfaceC0514c[] interfaceC0514cArr = this.f4698a;
        if (interfaceC0514cArr.length > 0) {
            InterfaceC0514c interfaceC0514c = interfaceC0514cArr[0];
            throw null;
        }
        if (interfaceC0514cArr.length <= 0) {
            return;
        }
        InterfaceC0514c interfaceC0514c2 = interfaceC0514cArr[0];
        throw null;
    }
}
