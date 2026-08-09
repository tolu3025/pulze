package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.AbstractC0516e;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class ImmLeaksCleaner implements androidx.lifecycle.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f3634b = new c(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final I1.g f3635c = I1.i.a(b.f3637a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f3636a;

    public static abstract class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public abstract boolean a(InputMethodManager inputMethodManager);

        public abstract Object b(InputMethodManager inputMethodManager);

        public abstract View c(InputMethodManager inputMethodManager);
    }

    static final class b extends kotlin.jvm.internal.n implements U1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f3637a = new b();

        b() {
            super(0);
        }

        @Override // U1.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a invoke() {
            try {
                Field servedViewField = InputMethodManager.class.getDeclaredField("mServedView");
                servedViewField.setAccessible(true);
                Field nextServedViewField = InputMethodManager.class.getDeclaredField("mNextServedView");
                nextServedViewField.setAccessible(true);
                Field hField = InputMethodManager.class.getDeclaredField("mH");
                hField.setAccessible(true);
                kotlin.jvm.internal.m.d(hField, "hField");
                kotlin.jvm.internal.m.d(servedViewField, "servedViewField");
                kotlin.jvm.internal.m.d(nextServedViewField, "nextServedViewField");
                return new e(hField, servedViewField, nextServedViewField);
            } catch (NoSuchFieldException unused) {
                return d.f3638a;
            }
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final a a() {
            return (a) ImmLeaksCleaner.f3635c.getValue();
        }
    }

    public static final class d extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f3638a = new d();

        private d() {
            super(null);
        }

        @Override // androidx.activity.ImmLeaksCleaner.a
        public boolean a(InputMethodManager inputMethodManager) {
            kotlin.jvm.internal.m.e(inputMethodManager, "<this>");
            return false;
        }

        @Override // androidx.activity.ImmLeaksCleaner.a
        public Object b(InputMethodManager inputMethodManager) {
            kotlin.jvm.internal.m.e(inputMethodManager, "<this>");
            return null;
        }

        @Override // androidx.activity.ImmLeaksCleaner.a
        public View c(InputMethodManager inputMethodManager) {
            kotlin.jvm.internal.m.e(inputMethodManager, "<this>");
            return null;
        }
    }

    public static final class e extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Field f3639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Field f3640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Field f3641c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Field hField, Field servedViewField, Field nextServedViewField) {
            super(null);
            kotlin.jvm.internal.m.e(hField, "hField");
            kotlin.jvm.internal.m.e(servedViewField, "servedViewField");
            kotlin.jvm.internal.m.e(nextServedViewField, "nextServedViewField");
            this.f3639a = hField;
            this.f3640b = servedViewField;
            this.f3641c = nextServedViewField;
        }

        @Override // androidx.activity.ImmLeaksCleaner.a
        public boolean a(InputMethodManager inputMethodManager) {
            kotlin.jvm.internal.m.e(inputMethodManager, "<this>");
            try {
                this.f3641c.set(inputMethodManager, null);
                return true;
            } catch (IllegalAccessException unused) {
                return false;
            }
        }

        @Override // androidx.activity.ImmLeaksCleaner.a
        public Object b(InputMethodManager inputMethodManager) {
            kotlin.jvm.internal.m.e(inputMethodManager, "<this>");
            try {
                return this.f3639a.get(inputMethodManager);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // androidx.activity.ImmLeaksCleaner.a
        public View c(InputMethodManager inputMethodManager) {
            kotlin.jvm.internal.m.e(inputMethodManager, "<this>");
            try {
                return (View) this.f3640b.get(inputMethodManager);
            } catch (ClassCastException | IllegalAccessException unused) {
                return null;
            }
        }
    }

    public ImmLeaksCleaner(Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
        this.f3636a = activity;
    }

    @Override // androidx.lifecycle.g
    public void d(androidx.lifecycle.i source, AbstractC0516e.a event) {
        kotlin.jvm.internal.m.e(source, "source");
        kotlin.jvm.internal.m.e(event, "event");
        if (event != AbstractC0516e.a.ON_DESTROY) {
            return;
        }
        Object systemService = this.f3636a.getSystemService("input_method");
        kotlin.jvm.internal.m.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        a aVarA = f3634b.a();
        Object objB = aVarA.b(inputMethodManager);
        if (objB == null) {
            return;
        }
        synchronized (objB) {
            View viewC = aVarA.c(inputMethodManager);
            if (viewC == null) {
                return;
            }
            if (viewC.isAttachedToWindow()) {
                return;
            }
            boolean zA = aVarA.a(inputMethodManager);
            if (zA) {
                inputMethodManager.isActive();
            }
        }
    }
}
