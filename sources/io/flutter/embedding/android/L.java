package io.flutter.embedding.android;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import b1.AbstractC0525b;
import com.google.android.gms.common.api.a;
import io.flutter.plugin.editing.m;
import java.util.HashSet;
import java.util.Map;
import k1.j;
import l1.InterfaceC1017c;

/* JADX INFO: loaded from: classes.dex */
public class L implements m.a, j.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final d[] f7588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet f7589b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f7590c;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f7591a = 0;

        Character a(int i3) {
            int deadChar;
            char c3 = (char) i3;
            if ((Integer.MIN_VALUE & i3) == 0) {
                int i4 = this.f7591a;
                if (i4 != 0) {
                    int deadChar2 = KeyCharacterMap.getDeadChar(i4, i3);
                    if (deadChar2 > 0) {
                        c3 = (char) deadChar2;
                    }
                    deadChar = 0;
                }
                return Character.valueOf(c3);
            }
            deadChar = i3 & a.e.API_PRIORITY_OTHER;
            int i5 = this.f7591a;
            if (i5 != 0) {
                deadChar = KeyCharacterMap.getDeadChar(i5, deadChar);
            }
            this.f7591a = deadChar;
            return Character.valueOf(c3);
        }
    }

    private class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final KeyEvent f7592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f7593b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f7594c = false;

        private class a implements d.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            boolean f7596a;

            private a() {
                this.f7596a = false;
            }

            @Override // io.flutter.embedding.android.L.d.a
            public void a(boolean z2) {
                if (this.f7596a) {
                    throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
                }
                this.f7596a = true;
                c cVar = c.this;
                int i3 = cVar.f7593b - 1;
                cVar.f7593b = i3;
                boolean z3 = z2 | cVar.f7594c;
                cVar.f7594c = z3;
                if (i3 != 0 || z3) {
                    return;
                }
                L.this.e(cVar.f7592a);
            }
        }

        c(KeyEvent keyEvent) {
            this.f7593b = L.this.f7588a.length;
            this.f7592a = keyEvent;
        }

        public d.a a() {
            return new a();
        }
    }

    public interface d {

        public interface a {
            void a(boolean z2);
        }

        void a(KeyEvent keyEvent, a aVar);
    }

    public interface e {
        void a(KeyEvent keyEvent);

        boolean c(KeyEvent keyEvent);

        InterfaceC1017c getBinaryMessenger();
    }

    public L(e eVar) {
        this.f7590c = eVar;
        this.f7588a = new d[]{new K(eVar.getBinaryMessenger()), new F(new k1.i(eVar.getBinaryMessenger()))};
        new k1.j(eVar.getBinaryMessenger()).b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(KeyEvent keyEvent) {
        e eVar = this.f7590c;
        if (eVar == null || eVar.c(keyEvent)) {
            return;
        }
        this.f7589b.add(keyEvent);
        this.f7590c.a(keyEvent);
        if (this.f7589b.remove(keyEvent)) {
            AbstractC0525b.g("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
        }
    }

    @Override // k1.j.b
    public Map a() {
        return ((K) this.f7588a[0]).h();
    }

    @Override // io.flutter.plugin.editing.m.a
    public boolean b(KeyEvent keyEvent) {
        if (this.f7589b.remove(keyEvent)) {
            return false;
        }
        if (this.f7588a.length <= 0) {
            e(keyEvent);
            return true;
        }
        c cVar = new c(keyEvent);
        for (d dVar : this.f7588a) {
            dVar.a(keyEvent, cVar.a());
        }
        return true;
    }

    public void d() {
        int size = this.f7589b.size();
        if (size > 0) {
            AbstractC0525b.g("KeyboardManager", "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
        }
    }
}
