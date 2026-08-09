package androidx.core.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.AbstractC0476c;
import androidx.lifecycle.AbstractC0516e;
import androidx.lifecycle.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends Activity implements androidx.lifecycle.i, AbstractC0476c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.collection.f f3775a = new androidx.collection.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.lifecycle.j f3776b = new androidx.lifecycle.j(this);

    public AbstractC0516e a() {
        return this.f3776b;
    }

    @Override // androidx.core.view.AbstractC0476c.a
    public boolean c(KeyEvent event) {
        kotlin.jvm.internal.m.e(event, "event");
        return super.dispatchKeyEvent(event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        kotlin.jvm.internal.m.e(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView, "window.decorView");
        if (AbstractC0476c.d(decorView, event)) {
            return true;
        }
        return AbstractC0476c.e(this, decorView, this, event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        kotlin.jvm.internal.m.e(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView, "window.decorView");
        if (AbstractC0476c.d(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p.f4762a.b(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.m.e(outState, "outState");
        this.f3776b.m(AbstractC0516e.b.CREATED);
        super.onSaveInstanceState(outState);
    }
}
