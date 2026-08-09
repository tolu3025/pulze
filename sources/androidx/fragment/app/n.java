package androidx.fragment.app;

import androidx.lifecycle.AbstractC0516e;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f4608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f4609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f4610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f4611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f4612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f4613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f4614h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f4616j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f4617k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    CharSequence f4618l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f4619m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    CharSequence f4620n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ArrayList f4621o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ArrayList f4622p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    ArrayList f4624r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList f4607a = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f4615i = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    boolean f4623q = false;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f4625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Fragment f4626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f4627c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f4628d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f4629e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f4630f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        AbstractC0516e.b f4631g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        AbstractC0516e.b f4632h;

        a() {
        }

        a(int i3, Fragment fragment) {
            this.f4625a = i3;
            this.f4626b = fragment;
            AbstractC0516e.b bVar = AbstractC0516e.b.RESUMED;
            this.f4631g = bVar;
            this.f4632h = bVar;
        }
    }

    public n b(Fragment fragment, String str) {
        f(0, fragment, str, 1);
        return this;
    }

    void c(a aVar) {
        this.f4607a.add(aVar);
        aVar.f4627c = this.f4608b;
        aVar.f4628d = this.f4609c;
        aVar.f4629e = this.f4610d;
        aVar.f4630f = this.f4611e;
    }

    public abstract int d();

    public abstract int e();

    void f(int i3, Fragment fragment, String str, int i4) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.f4399C;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f4399C + " now " + str);
            }
            fragment.f4399C = str;
        }
        if (i3 != 0) {
            if (i3 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i5 = fragment.f4397A;
            if (i5 != 0 && i5 != i3) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f4397A + " now " + i3);
            }
            fragment.f4397A = i3;
            fragment.f4398B = i3;
        }
        c(new a(i4, fragment));
    }

    public n g(Fragment fragment) {
        c(new a(3, fragment));
        return this;
    }
}
