package androidx.activity;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public static final void a(View view, r onBackPressedDispatcherOwner) {
        kotlin.jvm.internal.m.e(view, "<this>");
        kotlin.jvm.internal.m.e(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(s.f3698b, onBackPressedDispatcherOwner);
    }
}
