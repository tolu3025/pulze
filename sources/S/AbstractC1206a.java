package s;

import J1.AbstractC0412p;
import U1.l;
import android.content.Context;
import c2.C0557d0;
import c2.N;
import c2.O;
import c2.T0;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import q.C1122b;

/* JADX INFO: renamed from: s.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1206a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: s.a$a, reason: collision with other inner class name */
    public static final class C0165a extends n implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0165a f11214a = new C0165a();

        C0165a() {
            super(1);
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List invoke(Context it) {
            m.e(it, "it");
            return AbstractC0412p.h();
        }
    }

    public static final X1.a a(String name, C1122b c1122b, l produceMigrations, N scope) {
        m.e(name, "name");
        m.e(produceMigrations, "produceMigrations");
        m.e(scope, "scope");
        return new c(name, c1122b, produceMigrations, scope);
    }

    public static /* synthetic */ X1.a b(String str, C1122b c1122b, l lVar, N n3, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            c1122b = null;
        }
        if ((i3 & 4) != 0) {
            lVar = C0165a.f11214a;
        }
        if ((i3 & 8) != 0) {
            n3 = O.a(C0557d0.b().plus(T0.b(null, 1, null)));
        }
        return a(str, c1122b, lVar, n3);
    }
}
