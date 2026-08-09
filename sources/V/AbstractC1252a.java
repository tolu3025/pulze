package v;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: v.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1252a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f11492a = new LinkedHashMap();

    /* JADX INFO: renamed from: v.a$a, reason: collision with other inner class name */
    public static final class C0174a extends AbstractC1252a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0174a f11493b = new C0174a();

        private C0174a() {
        }

        @Override // v.AbstractC1252a
        public Object a(b key) {
            m.e(key, "key");
            return null;
        }
    }

    /* JADX INFO: renamed from: v.a$b */
    public interface b {
    }

    public abstract Object a(b bVar);

    public final Map b() {
        return this.f11492a;
    }
}
