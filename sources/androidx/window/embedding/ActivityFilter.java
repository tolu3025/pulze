package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import b2.p;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityFilter {
    private final ComponentName componentName;
    private final String intentAction;

    public ActivityFilter(ComponentName componentName, String str) {
        m.e(componentName, "componentName");
        this.componentName = componentName;
        this.intentAction = str;
        String packageName = componentName.getPackageName();
        m.d(packageName, "componentName.packageName");
        String className = componentName.getClassName();
        m.d(className, "componentName.className");
        boolean z2 = true;
        if (!(packageName.length() > 0)) {
            throw new IllegalArgumentException("Package name must not be empty".toString());
        }
        if (!(className.length() > 0)) {
            throw new IllegalArgumentException("Activity class name must not be empty.".toString());
        }
        if (!(!p.s(packageName, "*", false, 2, null) || p.A(packageName, "*", 0, false, 6, null) == packageName.length() - 1)) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
        }
        if (p.s(className, "*", false, 2, null) && p.A(className, "*", 0, false, 6, null) != className.length() - 1) {
            z2 = false;
        }
        if (!z2) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityFilter)) {
            return false;
        }
        ActivityFilter activityFilter = (ActivityFilter) obj;
        return m.a(this.componentName, activityFilter.componentName) && m.a(this.intentAction, activityFilter.intentAction);
    }

    public final ComponentName getComponentName() {
        return this.componentName;
    }

    public final String getIntentAction() {
        return this.intentAction;
    }

    public int hashCode() {
        int iHashCode = this.componentName.hashCode() * 31;
        String str = this.intentAction;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean matchesActivity(Activity activity) {
        m.e(activity, "activity");
        if (MatcherUtils.INSTANCE.areActivityOrIntentComponentsMatching$window_release(activity, this.componentName)) {
            String str = this.intentAction;
            if (str != null) {
                Intent intent = activity.getIntent();
                if (m.a(str, intent == null ? null : intent.getAction())) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean matchesIntent(Intent intent) {
        m.e(intent, "intent");
        if (!MatcherUtils.INSTANCE.areComponentsMatching$window_release(intent.getComponent(), this.componentName)) {
            return false;
        }
        String str = this.intentAction;
        return str == null || m.a(str, intent.getAction());
    }

    public String toString() {
        return "ActivityFilter(componentName=" + this.componentName + ", intentAction=" + ((Object) this.intentAction) + ')';
    }
}
