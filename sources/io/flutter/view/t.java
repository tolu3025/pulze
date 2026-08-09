package io.flutter.view;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static t f8292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static b f8293f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FlutterJNI f8295b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f8294a = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f8296c = new c(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final FlutterJNI.b f8297d = new a();

    class a implements FlutterJNI.b {
        a() {
        }

        private Choreographer.FrameCallback b(long j3) {
            if (t.this.f8296c == null) {
                return t.this.new c(j3);
            }
            t.this.f8296c.f8301a = j3;
            c cVar = t.this.f8296c;
            t.this.f8296c = null;
            return cVar;
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.b
        public void a(long j3) {
            Choreographer.getInstance().postFrameCallback(b(j3));
        }
    }

    class b implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private DisplayManager f8299a;

        b(DisplayManager displayManager) {
            this.f8299a = displayManager;
        }

        void a() {
            this.f8299a.registerDisplayListener(this, null);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i3) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i3) {
            if (i3 == 0) {
                float refreshRate = this.f8299a.getDisplay(0).getRefreshRate();
                t.this.f8294a = (long) (1.0E9d / ((double) refreshRate));
                t.this.f8295b.setRefreshRateFPS(refreshRate);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i3) {
        }
    }

    private class c implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f8301a;

        c(long j3) {
            this.f8301a = j3;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j3) {
            long jNanoTime = System.nanoTime() - j3;
            t.this.f8295b.onVsync(jNanoTime < 0 ? 0L : jNanoTime, t.this.f8294a, this.f8301a);
            t.this.f8296c = this;
        }
    }

    private t(FlutterJNI flutterJNI) {
        this.f8295b = flutterJNI;
    }

    public static t f(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f8292e == null) {
            f8292e = new t(flutterJNI);
        }
        if (f8293f == null) {
            t tVar = f8292e;
            Objects.requireNonNull(tVar);
            b bVar = tVar.new b(displayManager);
            f8293f = bVar;
            bVar.a();
        }
        if (f8292e.f8294a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f8292e.f8294a = (long) (1.0E9d / ((double) refreshRate));
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f8292e;
    }

    public void g() {
        this.f8295b.setAsyncWaitForVsyncDelegate(this.f8297d);
    }
}
