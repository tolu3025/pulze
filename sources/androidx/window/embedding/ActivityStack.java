package androidx.window.embedding;

import android.app.Activity;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityStack {
    private final List<Activity> activities;
    private final boolean isEmpty;

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityStack(List<? extends Activity> activities, boolean z2) {
        m.e(activities, "activities");
        this.activities = activities;
        this.isEmpty = z2;
    }

    public final boolean contains(Activity activity) {
        m.e(activity, "activity");
        return this.activities.contains(activity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityStack)) {
            return false;
        }
        ActivityStack activityStack = (ActivityStack) obj;
        return (m.a(this.activities, activityStack.activities) || this.isEmpty == activityStack.isEmpty) ? false : true;
    }

    public final List<Activity> getActivities$window_release() {
        return this.activities;
    }

    public int hashCode() {
        return ((this.isEmpty ? 1 : 0) * 31) + this.activities.hashCode();
    }

    public final boolean isEmpty() {
        return this.isEmpty;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ActivityStack{");
        sb.append(m.k("activities=", getActivities$window_release()));
        sb.append("isEmpty=" + this.isEmpty + '}');
        String string = sb.toString();
        m.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public /* synthetic */ ActivityStack(List list, boolean z2, int i3, kotlin.jvm.internal.h hVar) {
        this(list, (i3 & 2) != 0 ? false : z2);
    }
}
