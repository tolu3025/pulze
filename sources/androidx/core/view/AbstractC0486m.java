package androidx.core.view;

import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.core.view.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0486m {

    /* JADX INFO: renamed from: androidx.core.view.m$a */
    static class a {
        static int a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        static boolean b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        static void c(ViewGroup viewGroup, boolean z2) {
            viewGroup.setTransitionGroup(z2);
        }
    }

    public static boolean a(ViewGroup viewGroup) {
        return a.b(viewGroup);
    }
}
