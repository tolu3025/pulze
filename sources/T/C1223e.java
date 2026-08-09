package t;

import c2.N;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p.C1056j;
import p.E;
import p.InterfaceC1055i;
import p.o;
import q.C1122b;

/* JADX INFO: renamed from: t.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1223e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1223e f11282a = new C1223e();

    /* JADX INFO: renamed from: t.e$a */
    static final class a extends n implements U1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ U1.a f11283a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(U1.a aVar) {
            super(0);
            this.f11283a = aVar;
        }

        @Override // U1.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File file = (File) this.f11283a.invoke();
            if (m.a(S1.h.c(file), "preferences_pb")) {
                File absoluteFile = file.getAbsoluteFile();
                m.d(absoluteFile, "file.absoluteFile");
                return absoluteFile;
            }
            throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }

    private C1223e() {
    }

    public final InterfaceC1055i a(E storage, C1122b c1122b, List migrations, N scope) {
        m.e(storage, "storage");
        m.e(migrations, "migrations");
        m.e(scope, "scope");
        return new C1222d(C1056j.f10028a.a(storage, c1122b, migrations, scope));
    }

    public final InterfaceC1055i b(C1122b c1122b, List migrations, N scope, U1.a produceFile) {
        m.e(migrations, "migrations");
        m.e(scope, "scope");
        m.e(produceFile, "produceFile");
        return new C1222d(a(new o(h.f11285a, null, new a(produceFile), 2, null), c1122b, migrations, scope));
    }
}
