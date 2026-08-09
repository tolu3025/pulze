package androidx.window.embedding;

import J1.x;
import android.content.Intent;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class SplitPlaceholderRule extends SplitRule {
    private final Set<ActivityFilter> filters;
    private final Intent placeholderIntent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitPlaceholderRule(Set<ActivityFilter> filters, Intent placeholderIntent, int i3, int i4, float f3, int i5) {
        super(i3, i4, f3, i5);
        m.e(filters, "filters");
        m.e(placeholderIntent, "placeholderIntent");
        this.placeholderIntent = placeholderIntent;
        this.filters = x.a0(filters);
    }

    @Override // androidx.window.embedding.SplitRule
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPlaceholderRule) || !super.equals(obj) || !super.equals(obj)) {
            return false;
        }
        SplitPlaceholderRule splitPlaceholderRule = (SplitPlaceholderRule) obj;
        return m.a(this.filters, splitPlaceholderRule.filters) && m.a(this.placeholderIntent, splitPlaceholderRule.placeholderIntent);
    }

    public final Set<ActivityFilter> getFilters() {
        return this.filters;
    }

    public final Intent getPlaceholderIntent() {
        return this.placeholderIntent;
    }

    @Override // androidx.window.embedding.SplitRule
    public int hashCode() {
        return (((super.hashCode() * 31) + this.filters.hashCode()) * 31) + this.placeholderIntent.hashCode();
    }

    public final SplitPlaceholderRule plus$window_release(ActivityFilter filter) {
        m.e(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        return new SplitPlaceholderRule(x.a0(linkedHashSet), this.placeholderIntent, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
    }

    public /* synthetic */ SplitPlaceholderRule(Set set, Intent intent, int i3, int i4, float f3, int i5, int i6, kotlin.jvm.internal.h hVar) {
        this(set, intent, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? 0.5f : f3, (i6 & 32) != 0 ? 3 : i5);
    }
}
