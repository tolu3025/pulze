package io.flutter.plugin.platform;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private io.flutter.view.j f7874a;

    a() {
    }

    public boolean a(MotionEvent motionEvent, boolean z2) {
        io.flutter.view.j jVar = this.f7874a;
        if (jVar == null) {
            return false;
        }
        return jVar.L(motionEvent, z2);
    }

    void b(io.flutter.view.j jVar) {
        this.f7874a = jVar;
    }
}
