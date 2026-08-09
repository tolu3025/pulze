package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.common.zzg;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f5468a = Collections.synchronizedMap(new androidx.collection.a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f5469b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f5470c;

    u0() {
    }

    final AbstractC0610j a(String str, Class cls) {
        return (AbstractC0610j) cls.cast(this.f5468a.get(str));
    }

    final void b(String str, AbstractC0610j abstractC0610j) {
        Map map = this.f5468a;
        if (map.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
            sb.append("LifecycleCallback with tag ");
            sb.append(str);
            sb.append(" already added to this fragment.");
            throw new IllegalArgumentException(sb.toString());
        }
        map.put(str, abstractC0610j);
        if (this.f5469b > 0) {
            new zzg(Looper.getMainLooper()).post(new t0(this, abstractC0610j, str));
        }
    }

    final void c(Bundle bundle) {
        this.f5469b = 1;
        this.f5470c = bundle;
        for (Map.Entry entry : this.f5468a.entrySet()) {
            ((AbstractC0610j) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    final void d() {
        this.f5469b = 2;
        Iterator it = this.f5468a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC0610j) it.next()).onStart();
        }
    }

    final void e() {
        this.f5469b = 3;
        Iterator it = this.f5468a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC0610j) it.next()).onResume();
        }
    }

    final void f(int i3, int i4, Intent intent) {
        Iterator it = this.f5468a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC0610j) it.next()).onActivityResult(i3, i4, intent);
        }
    }

    final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f5468a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((AbstractC0610j) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    final void h() {
        this.f5469b = 4;
        Iterator it = this.f5468a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC0610j) it.next()).onStop();
        }
    }

    final void i() {
        this.f5469b = 5;
        Iterator it = this.f5468a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC0610j) it.next()).onDestroy();
        }
    }

    final void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Iterator it = this.f5468a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC0610j) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    final /* synthetic */ int k() {
        return this.f5469b;
    }

    final /* synthetic */ Bundle l() {
        return this.f5470c;
    }
}
