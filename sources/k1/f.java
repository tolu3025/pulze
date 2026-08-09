package k1;

import android.window.BackEvent;
import b1.AbstractC0525b;
import c1.C0543a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import l1.k;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1.k f9491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k.c f9492b;

    class a implements k.c {
        a() {
        }

        @Override // l1.k.c
        public void a(l1.j jVar, k.d dVar) {
            dVar.a(null);
        }
    }

    public f(C0543a c0543a) {
        a aVar = new a();
        this.f9492b = aVar;
        l1.k kVar = new l1.k(c0543a, "flutter/backgesture", l1.p.f9793b);
        this.f9491a = kVar;
        kVar.e(aVar);
    }

    private Map a(BackEvent backEvent) {
        HashMap map = new HashMap(3);
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        map.put("touchOffset", (Float.isNaN(touchX) || Float.isNaN(touchY)) ? null : Arrays.asList(Float.valueOf(touchX), Float.valueOf(touchY)));
        map.put("progress", Float.valueOf(backEvent.getProgress()));
        map.put("swipeEdge", Integer.valueOf(backEvent.getSwipeEdge()));
        return map;
    }

    public void b() {
        AbstractC0525b.f("BackGestureChannel", "Sending message to cancel back gesture");
        this.f9491a.c("cancelBackGesture", null);
    }

    public void c() {
        AbstractC0525b.f("BackGestureChannel", "Sending message to commit back gesture");
        this.f9491a.c("commitBackGesture", null);
    }

    public void d(BackEvent backEvent) {
        AbstractC0525b.f("BackGestureChannel", "Sending message to start back gesture");
        this.f9491a.c("startBackGesture", a(backEvent));
    }

    public void e(BackEvent backEvent) {
        AbstractC0525b.f("BackGestureChannel", "Sending message to update back gesture progress");
        this.f9491a.c("updateBackGestureProgress", a(backEvent));
    }
}
