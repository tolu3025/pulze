package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class SplitPairFilter {
    private final ComponentName primaryActivityName;
    private final String secondaryActivityIntentAction;
    private final ComponentName secondaryActivityName;

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SplitPairFilter(android.content.ComponentName r18, android.content.ComponentName r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.SplitPairFilter.<init>(android.content.ComponentName, android.content.ComponentName, java.lang.String):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPairFilter)) {
            return false;
        }
        SplitPairFilter splitPairFilter = (SplitPairFilter) obj;
        return m.a(this.primaryActivityName, splitPairFilter.primaryActivityName) && m.a(this.secondaryActivityName, splitPairFilter.secondaryActivityName) && m.a(this.secondaryActivityIntentAction, splitPairFilter.secondaryActivityIntentAction);
    }

    public final ComponentName getPrimaryActivityName() {
        return this.primaryActivityName;
    }

    public final String getSecondaryActivityIntentAction() {
        return this.secondaryActivityIntentAction;
    }

    public final ComponentName getSecondaryActivityName() {
        return this.secondaryActivityName;
    }

    public int hashCode() {
        int iHashCode = ((this.primaryActivityName.hashCode() * 31) + this.secondaryActivityName.hashCode()) * 31;
        String str = this.secondaryActivityIntentAction;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean matchesActivityIntentPair(Activity primaryActivity, Intent secondaryActivityIntent) {
        m.e(primaryActivity, "primaryActivity");
        m.e(secondaryActivityIntent, "secondaryActivityIntent");
        ComponentName componentName = primaryActivity.getComponentName();
        MatcherUtils matcherUtils = MatcherUtils.INSTANCE;
        if (!matcherUtils.areComponentsMatching$window_release(componentName, this.primaryActivityName) || !matcherUtils.areComponentsMatching$window_release(secondaryActivityIntent.getComponent(), this.secondaryActivityName)) {
            return false;
        }
        String str = this.secondaryActivityIntentAction;
        return str == null || m.a(str, secondaryActivityIntent.getAction());
    }

    public final boolean matchesActivityPair(Activity primaryActivity, Activity secondaryActivity) {
        m.e(primaryActivity, "primaryActivity");
        m.e(secondaryActivity, "secondaryActivity");
        MatcherUtils matcherUtils = MatcherUtils.INSTANCE;
        boolean z2 = false;
        boolean z3 = matcherUtils.areComponentsMatching$window_release(primaryActivity.getComponentName(), this.primaryActivityName) && matcherUtils.areComponentsMatching$window_release(secondaryActivity.getComponentName(), this.secondaryActivityName);
        if (secondaryActivity.getIntent() == null) {
            return z3;
        }
        if (z3) {
            Intent intent = secondaryActivity.getIntent();
            m.d(intent, "secondaryActivity.intent");
            if (matchesActivityIntentPair(primaryActivity, intent)) {
                z2 = true;
            }
        }
        return z2;
    }

    public String toString() {
        return "SplitPairFilter{primaryActivityName=" + this.primaryActivityName + ", secondaryActivityName=" + this.secondaryActivityName + ", secondaryActivityAction=" + ((Object) this.secondaryActivityIntentAction) + '}';
    }
}
