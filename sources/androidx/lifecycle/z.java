package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import v.AbstractC1252a;
import v.C1255d;

/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C f4791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f4792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC1252a f4793c;

    public static class a extends c {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static a f4795f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Application f4797d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final C0094a f4794e = new C0094a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final AbstractC1252a.b f4796g = C0094a.C0095a.f4798a;

        /* JADX INFO: renamed from: androidx.lifecycle.z$a$a, reason: collision with other inner class name */
        public static final class C0094a {

            /* JADX INFO: renamed from: androidx.lifecycle.z$a$a$a, reason: collision with other inner class name */
            private static final class C0095a implements AbstractC1252a.b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0095a f4798a = new C0095a();

                private C0095a() {
                }
            }

            private C0094a() {
            }

            public /* synthetic */ C0094a(kotlin.jvm.internal.h hVar) {
                this();
            }

            public final a a(Application application) {
                kotlin.jvm.internal.m.e(application, "application");
                if (a.f4795f == null) {
                    a.f4795f = new a(application);
                }
                a aVar = a.f4795f;
                kotlin.jvm.internal.m.b(aVar);
                return aVar;
            }
        }

        public a() {
            this(null, 0);
        }

        private final y g(Class cls, Application application) {
            if (!AbstractC0512a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                y yVar = (y) cls.getConstructor(Application.class).newInstance(application);
                kotlin.jvm.internal.m.d(yVar, "{\n                try {\n…          }\n            }");
                return yVar;
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InstantiationException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            } catch (NoSuchMethodException e5) {
                throw new RuntimeException("Cannot create an instance of " + cls, e5);
            } catch (InvocationTargetException e6) {
                throw new RuntimeException("Cannot create an instance of " + cls, e6);
            }
        }

        @Override // androidx.lifecycle.z.c, androidx.lifecycle.z.b
        public y a(Class modelClass) {
            kotlin.jvm.internal.m.e(modelClass, "modelClass");
            Application application = this.f4797d;
            if (application != null) {
                return g(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.z.c, androidx.lifecycle.z.b
        public y b(Class modelClass, AbstractC1252a extras) {
            kotlin.jvm.internal.m.e(modelClass, "modelClass");
            kotlin.jvm.internal.m.e(extras, "extras");
            if (this.f4797d != null) {
                return a(modelClass);
            }
            Application application = (Application) extras.a(f4796g);
            if (application != null) {
                return g(modelClass, application);
            }
            if (AbstractC0512a.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.a(modelClass);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            kotlin.jvm.internal.m.e(application, "application");
        }

        private a(Application application, int i3) {
            this.f4797d = application;
        }
    }

    public interface b {
        y a(Class cls);

        y b(Class cls, AbstractC1252a abstractC1252a);
    }

    public static class c implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static c f4800b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4799a = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AbstractC1252a.b f4801c = a.C0096a.f4802a;

        public static final class a {

            /* JADX INFO: renamed from: androidx.lifecycle.z$c$a$a, reason: collision with other inner class name */
            private static final class C0096a implements AbstractC1252a.b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0096a f4802a = new C0096a();

                private C0096a() {
                }
            }

            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
                this();
            }

            public final c a() {
                if (c.f4800b == null) {
                    c.f4800b = new c();
                }
                c cVar = c.f4800b;
                kotlin.jvm.internal.m.b(cVar);
                return cVar;
            }
        }

        @Override // androidx.lifecycle.z.b
        public y a(Class modelClass) throws InvocationTargetException {
            kotlin.jvm.internal.m.e(modelClass, "modelClass");
            try {
                Object objNewInstance = modelClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                kotlin.jvm.internal.m.d(objNewInstance, "{\n                modelC…wInstance()\n            }");
                return (y) objNewInstance;
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e3);
            } catch (InstantiationException e4) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e4);
            } catch (NoSuchMethodException e5) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e5);
            }
        }

        @Override // androidx.lifecycle.z.b
        public /* synthetic */ y b(Class cls, AbstractC1252a abstractC1252a) {
            return A.b(this, cls, abstractC1252a);
        }
    }

    public static class d {
        public abstract void c(y yVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(C store, b factory) {
        this(store, factory, null, 4, null);
        kotlin.jvm.internal.m.e(store, "store");
        kotlin.jvm.internal.m.e(factory, "factory");
    }

    public y a(Class modelClass) {
        kotlin.jvm.internal.m.e(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, modelClass);
    }

    public y b(String key, Class modelClass) {
        y yVarA;
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(modelClass, "modelClass");
        y yVarB = this.f4791a.b(key);
        if (!modelClass.isInstance(yVarB)) {
            C1255d c1255d = new C1255d(this.f4793c);
            c1255d.c(c.f4801c, key);
            try {
                yVarA = this.f4792b.b(modelClass, c1255d);
            } catch (AbstractMethodError unused) {
                yVarA = this.f4792b.a(modelClass);
            }
            this.f4791a.d(key, yVarA);
            return yVarA;
        }
        Object obj = this.f4792b;
        d dVar = obj instanceof d ? (d) obj : null;
        if (dVar != null) {
            kotlin.jvm.internal.m.b(yVarB);
            dVar.c(yVarB);
        }
        kotlin.jvm.internal.m.c(yVarB, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return yVarB;
    }

    public z(C store, b factory, AbstractC1252a defaultCreationExtras) {
        kotlin.jvm.internal.m.e(store, "store");
        kotlin.jvm.internal.m.e(factory, "factory");
        kotlin.jvm.internal.m.e(defaultCreationExtras, "defaultCreationExtras");
        this.f4791a = store;
        this.f4792b = factory;
        this.f4793c = defaultCreationExtras;
    }

    public /* synthetic */ z(C c3, b bVar, AbstractC1252a abstractC1252a, int i3, kotlin.jvm.internal.h hVar) {
        this(c3, bVar, (i3 & 4) != 0 ? AbstractC1252a.C0174a.f11493b : abstractC1252a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(D owner, b factory) {
        this(owner.e(), factory, B.a(owner));
        kotlin.jvm.internal.m.e(owner, "owner");
        kotlin.jvm.internal.m.e(factory, "factory");
    }
}
