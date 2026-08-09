package v1;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    public interface a {
        List a(b bVar);

        String b();

        String c();

        String d();

        List e();

        String f();

        String g();
    }

    public enum b {
        ROOT(0),
        MUSIC(1),
        PODCASTS(2),
        RINGTONES(3),
        ALARMS(4),
        NOTIFICATIONS(5),
        PICTURES(6),
        MOVIES(7),
        DOWNLOADS(8),
        DCIM(9),
        DOCUMENTS(10);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f11518a;

        b(int i3) {
            this.f11518a = i3;
        }
    }

    protected static ArrayList a(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }
}
