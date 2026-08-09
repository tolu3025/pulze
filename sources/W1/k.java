package w1;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    public interface a {
        Boolean a(String str);

        Boolean b(String str, Long l3);

        Map c(String str, List list);

        Boolean d(String str, String str2);

        Boolean e(String str, List list);

        Boolean f(String str, List list);

        Boolean g(String str, Boolean bool);

        Boolean h(String str, Double d3);
    }

    protected static ArrayList a(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }
}
