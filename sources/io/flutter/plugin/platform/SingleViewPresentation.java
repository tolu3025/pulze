package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.app.Presentation;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final io.flutter.plugin.platform.a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private a rootView;
    private boolean startFocused;
    private final d state;
    private int viewId;

    private static class a extends FrameLayout {
    }

    private static class b extends ContextWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InputMethodManager f7868a;

        b(Context context) {
            this(context, null);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Context createDisplayContext(Display display) {
            return new b(super.createDisplayContext(display), this.f7868a);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            return "input_method".equals(str) ? this.f7868a : super.getSystemService(str);
        }

        private b(Context context, InputMethodManager inputMethodManager) {
            super(context);
            this.f7868a = inputMethodManager == null ? (InputMethodManager) context.getSystemService("input_method") : inputMethodManager;
        }
    }

    private static class c extends ContextWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final z f7869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WindowManager f7870b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f7871c;

        c(Context context, z zVar, Context context2) {
            super(context);
            this.f7869a = zVar;
            this.f7871c = context2;
        }

        private WindowManager a() {
            if (this.f7870b == null) {
                this.f7870b = this.f7869a;
            }
            return this.f7870b;
        }

        private boolean b() {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int i3 = 0; i3 < stackTrace.length && i3 < 11; i3++) {
                if (stackTrace[i3].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i3].getMethodName().equals("<init>")) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            return "window".equals(str) ? b() ? this.f7871c.getSystemService(str) : a() : super.getSystemService(str);
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private z f7872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private s f7873b;

        d() {
        }

        static /* synthetic */ j a(d dVar) {
            dVar.getClass();
            return null;
        }

        static /* synthetic */ j b(d dVar, j jVar) {
            dVar.getClass();
            return jVar;
        }
    }

    public SingleViewPresentation(Context context, Display display, io.flutter.plugin.platform.a aVar, d dVar, View.OnFocusChangeListener onFocusChangeListener, boolean z2) {
        super(new b(context), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.state = dVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z2;
    }

    public d detachState() {
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        return this.state;
    }

    public j getView() {
        d.a(this.state);
        return null;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        if (this.state.f7873b == null) {
            this.state.f7873b = new s(getContext());
        }
        if (this.state.f7872a == null) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            d dVar = this.state;
            dVar.f7872a = new z(windowManager, dVar.f7873b);
        }
        this.container = new FrameLayout(getContext());
        new c(getContext(), this.state.f7872a, this.outerContext);
        d.a(this.state);
        throw null;
    }

    public SingleViewPresentation(Context context, Display display, j jVar, io.flutter.plugin.platform.a aVar, int i3, View.OnFocusChangeListener onFocusChangeListener) {
        super(new b(context), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.viewId = i3;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        d dVar = new d();
        this.state = dVar;
        d.b(dVar, jVar);
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }
}
