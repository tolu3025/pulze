package n0;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.AbstractC0643s;
import m0.AbstractC1027a;
import o0.C1041b;
import r0.x;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C1041b f9941b = new C1041b(j.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private x f9942a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9943a;

        static {
            int[] iArr = new int[b.values().length];
            f9943a = iArr;
            try {
                iArr[b.DEFAULT_APP_CHECK_TOKEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9943a[b.UNKNOWN_APP_CHECK_TOKEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    enum b {
        DEFAULT_APP_CHECK_TOKEN,
        UNKNOWN_APP_CHECK_TOKEN
    }

    public j(final Context context, String str) {
        AbstractC0643s.k(context);
        AbstractC0643s.e(str);
        final String str2 = String.format("com.google.firebase.appcheck.store.%s", str);
        this.f9942a = new x(new L0.b() { // from class: n0.i
            @Override // L0.b
            public final Object get() {
                return j.c(context, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object c(Context context, String str) {
        return context.getSharedPreferences(str, 0);
    }

    void b() {
        ((SharedPreferences) this.f9942a.get()).edit().remove("com.google.firebase.appcheck.APP_CHECK_TOKEN").remove("com.google.firebase.appcheck.TOKEN_TYPE").apply();
    }

    public AbstractC1027a d() {
        String string = ((SharedPreferences) this.f9942a.get()).getString("com.google.firebase.appcheck.TOKEN_TYPE", null);
        String string2 = ((SharedPreferences) this.f9942a.get()).getString("com.google.firebase.appcheck.APP_CHECK_TOKEN", null);
        if (string != null && string2 != null) {
            try {
                int i3 = a.f9943a[b.valueOf(string).ordinal()];
                if (i3 == 1) {
                    return C1036a.d(string2);
                }
                if (i3 == 2) {
                    return C1036a.c(string2);
                }
                f9941b.d("Reached unreachable section in #retrieveAppCheckToken()");
                return null;
            } catch (IllegalArgumentException e3) {
                f9941b.d("Failed to parse TokenType of stored token  with type [" + string + "] with exception: " + e3.getMessage());
                b();
            }
        }
        return null;
    }
}
