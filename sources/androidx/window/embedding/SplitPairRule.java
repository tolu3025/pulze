package androidx.window.embedding;

import J1.x;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class SplitPairRule extends SplitRule {
    private final boolean clearTop;
    private final Set<SplitPairFilter> filters;
    private final boolean finishPrimaryWithSecondary;
    private final boolean finishSecondaryWithPrimary;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitPairRule(Set<SplitPairFilter> filters, boolean z2, boolean z3, boolean z4, int i3, int i4, float f3, int i5) {
        super(i3, i4, f3, i5);
        m.e(filters, "filters");
        this.finishPrimaryWithSecondary = z2;
        this.finishSecondaryWithPrimary = z3;
        this.clearTop = z4;
        this.filters = x.a0(filters);
    }

    @Override // androidx.window.embedding.SplitRule
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPairRule) || !super.equals(obj)) {
            return false;
        }
        SplitPairRule splitPairRule = (SplitPairRule) obj;
        return m.a(this.filters, splitPairRule.filters) && this.finishPrimaryWithSecondary == splitPairRule.finishPrimaryWithSecondary && this.finishSecondaryWithPrimary == splitPairRule.finishSecondaryWithPrimary && this.clearTop == splitPairRule.clearTop;
    }

    public final boolean getClearTop() {
        return this.clearTop;
    }

    public final Set<SplitPairFilter> getFilters() {
        return this.filters;
    }

    public final boolean getFinishPrimaryWithSecondary() {
        return this.finishPrimaryWithSecondary;
    }

    public final boolean getFinishSecondaryWithPrimary() {
        return this.finishSecondaryWithPrimary;
    }

    @Override // androidx.window.embedding.SplitRule
    public int hashCode() {
        return (((((((super.hashCode() * 31) + this.filters.hashCode()) * 31) + a.a(this.finishPrimaryWithSecondary)) * 31) + a.a(this.finishSecondaryWithPrimary)) * 31) + a.a(this.clearTop);
    }

    public final SplitPairRule plus$window_release(SplitPairFilter filter) {
        m.e(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        return new SplitPairRule(x.a0(linkedHashSet), this.finishPrimaryWithSecondary, this.finishSecondaryWithPrimary, this.clearTop, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
    }

    public /* synthetic */ SplitPairRule(Set set, boolean z2, boolean z3, boolean z4, int i3, int i4, float f3, int i5, int i6, kotlin.jvm.internal.h hVar) {
        this(set, (i6 & 2) != 0 ? false : z2, (i6 & 4) != 0 ? true : z3, (i6 & 8) != 0 ? false : z4, (i6 & 16) != 0 ? 0 : i3, (i6 & 32) == 0 ? i4 : 0, (i6 & 64) != 0 ? 0.5f : f3, (i6 & 128) != 0 ? 3 : i5);
    }
}
