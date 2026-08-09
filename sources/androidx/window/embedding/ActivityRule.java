package androidx.window.embedding;

import J1.x;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityRule extends EmbeddingRule {
    private final boolean alwaysExpand;
    private final Set<ActivityFilter> filters;

    public ActivityRule(Set<ActivityFilter> filters, boolean z2) {
        m.e(filters, "filters");
        this.alwaysExpand = z2;
        this.filters = x.a0(filters);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityRule)) {
            return false;
        }
        ActivityRule activityRule = (ActivityRule) obj;
        return m.a(this.filters, activityRule.filters) && this.alwaysExpand == activityRule.alwaysExpand;
    }

    public final boolean getAlwaysExpand() {
        return this.alwaysExpand;
    }

    public final Set<ActivityFilter> getFilters() {
        return this.filters;
    }

    public int hashCode() {
        return (this.filters.hashCode() * 31) + a.a(this.alwaysExpand);
    }

    public final ActivityRule plus$window_release(ActivityFilter filter) {
        m.e(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        return new ActivityRule(x.a0(linkedHashSet), this.alwaysExpand);
    }

    public /* synthetic */ ActivityRule(Set set, boolean z2, int i3, kotlin.jvm.internal.h hVar) {
        this(set, (i3 & 2) != 0 ? false : z2);
    }
}
