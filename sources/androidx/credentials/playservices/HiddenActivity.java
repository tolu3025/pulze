package androidx.credentials.playservices;

import G.C0319b;
import G.C0320c;
import G.f;
import G.g;
import G.i;
import G.j;
import I1.u;
import U1.l;
import Y.C0463u;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.common.api.a;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import n.AbstractC1035a;

/* JADX INFO: loaded from: classes.dex */
public class HiddenActivity extends Activity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f3969c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ResultReceiver f3970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f3971b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    static final class b extends n implements l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f3973b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i3) {
            super(1);
            this.f3973b = i3;
        }

        public final void b(C0320c c0320c) {
            try {
                HiddenActivity.this.f3971b = true;
                HiddenActivity.this.startIntentSenderForResult(c0320c.s().getIntentSender(), this.f3973b, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e3) {
                HiddenActivity hiddenActivity = HiddenActivity.this;
                ResultReceiver resultReceiver = hiddenActivity.f3970a;
                m.b(resultReceiver);
                hiddenActivity.y(resultReceiver, "GET_UNKNOWN", "During begin sign in, one tap ui intent sender failure: " + e3.getMessage());
            }
        }

        @Override // U1.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C0320c) obj);
            return u.f2419a;
        }
    }

    static final class c extends n implements l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f3975b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i3) {
            super(1);
            this.f3975b = i3;
        }

        public final void b(j jVar) {
            try {
                HiddenActivity.this.f3971b = true;
                HiddenActivity.this.startIntentSenderForResult(jVar.s().getIntentSender(), this.f3975b, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e3) {
                HiddenActivity hiddenActivity = HiddenActivity.this;
                ResultReceiver resultReceiver = hiddenActivity.f3970a;
                m.b(resultReceiver);
                hiddenActivity.y(resultReceiver, "CREATE_UNKNOWN", "During save password, found UI intent sender failure: " + e3.getMessage());
            }
        }

        @Override // U1.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((j) obj);
            return u.f2419a;
        }
    }

    static final class d extends n implements l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f3977b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i3) {
            super(1);
            this.f3977b = i3;
        }

        public final void b(PendingIntent result) {
            m.e(result, "result");
            try {
                HiddenActivity.this.f3971b = true;
                HiddenActivity.this.startIntentSenderForResult(result.getIntentSender(), this.f3977b, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e3) {
                HiddenActivity hiddenActivity = HiddenActivity.this;
                ResultReceiver resultReceiver = hiddenActivity.f3970a;
                m.b(resultReceiver);
                hiddenActivity.y(resultReceiver, "CREATE_UNKNOWN", "During public key credential, found IntentSender failure on public key creation: " + e3.getMessage());
            }
        }

        @Override // U1.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((PendingIntent) obj);
            return u.f2419a;
        }
    }

    static final class e extends n implements l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f3979b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i3) {
            super(1);
            this.f3979b = i3;
        }

        public final void b(PendingIntent pendingIntent) {
            try {
                HiddenActivity.this.f3971b = true;
                HiddenActivity.this.startIntentSenderForResult(pendingIntent.getIntentSender(), this.f3979b, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e3) {
                HiddenActivity hiddenActivity = HiddenActivity.this;
                ResultReceiver resultReceiver = hiddenActivity.f3970a;
                m.b(resultReceiver);
                hiddenActivity.y(resultReceiver, "GET_UNKNOWN", "During get sign-in intent, one tap ui intent sender failure: " + e3.getMessage());
            }
        }

        @Override // U1.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((PendingIntent) obj);
            return u.f2419a;
        }
    }

    private final void l() {
        Task taskAddOnFailureListener;
        C0319b c0319b = (C0319b) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (c0319b != null) {
            Task taskBeginSignIn = g.b(this).beginSignIn(c0319b);
            final b bVar = new b(intExtra);
            taskAddOnFailureListener = taskBeginSignIn.addOnSuccessListener(new OnSuccessListener() { // from class: m.g
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    HiddenActivity.m(bVar, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: m.h
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    HiddenActivity.n(this.f9835a, exc);
                }
            });
        } else {
            taskAddOnFailureListener = null;
        }
        if (taskAddOnFailureListener == null) {
            Log.i("HiddenActivity", "During begin sign in, params is null, nothing to launch for begin sign in");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(l tmp0, Object obj) {
        m.e(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(HiddenActivity this$0, Exception e3) {
        m.e(this$0, "this$0");
        m.e(e3, "e");
        String str = ((e3 instanceof com.google.android.gms.common.api.b) && AbstractC1035a.f9907a.a().contains(Integer.valueOf(((com.google.android.gms.common.api.b) e3).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
        ResultReceiver resultReceiver = this$0.f3970a;
        m.b(resultReceiver);
        this$0.y(resultReceiver, str, "During begin sign in, failure response from one tap: " + e3.getMessage());
    }

    private final void o() {
        Task taskAddOnFailureListener;
        i iVar = (i) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (iVar != null) {
            Task taskSavePassword = g.a(this).savePassword(iVar);
            final c cVar = new c(intExtra);
            taskAddOnFailureListener = taskSavePassword.addOnSuccessListener(new OnSuccessListener() { // from class: m.c
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    HiddenActivity.p(cVar, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: m.d
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    HiddenActivity.q(this.f9831a, exc);
                }
            });
        } else {
            taskAddOnFailureListener = null;
        }
        if (taskAddOnFailureListener == null) {
            Log.i("HiddenActivity", "During save password, params is null, nothing to launch for create password");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(l tmp0, Object obj) {
        m.e(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(HiddenActivity this$0, Exception e3) {
        m.e(this$0, "this$0");
        m.e(e3, "e");
        String str = ((e3 instanceof com.google.android.gms.common.api.b) && AbstractC1035a.f9907a.a().contains(Integer.valueOf(((com.google.android.gms.common.api.b) e3).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
        ResultReceiver resultReceiver = this$0.f3970a;
        m.b(resultReceiver);
        this$0.y(resultReceiver, str, "During save password, found password failure response from one tap " + e3.getMessage());
    }

    private final void r() {
        Task taskAddOnFailureListener;
        C0463u c0463u = (C0463u) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (c0463u != null) {
            Task taskE = W.a.a(this).e(c0463u);
            final d dVar = new d(intExtra);
            taskAddOnFailureListener = taskE.addOnSuccessListener(new OnSuccessListener() { // from class: m.a
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    HiddenActivity.s(dVar, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: m.b
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    HiddenActivity.t(this.f9829a, exc);
                }
            });
        } else {
            taskAddOnFailureListener = null;
        }
        if (taskAddOnFailureListener == null) {
            Log.w("HiddenActivity", "During create public key credential, request is null, so nothing to launch for public key credentials");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(l tmp0, Object obj) {
        m.e(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(HiddenActivity this$0, Exception e3) {
        m.e(this$0, "this$0");
        m.e(e3, "e");
        String str = ((e3 instanceof com.google.android.gms.common.api.b) && AbstractC1035a.f9907a.a().contains(Integer.valueOf(((com.google.android.gms.common.api.b) e3).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
        ResultReceiver resultReceiver = this$0.f3970a;
        m.b(resultReceiver);
        this$0.y(resultReceiver, str, "During create public key credential, fido registration failure: " + e3.getMessage());
    }

    private final void u() {
        Task taskAddOnFailureListener;
        f fVar = (f) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (fVar != null) {
            Task signInIntent = g.b(this).getSignInIntent(fVar);
            final e eVar = new e(intExtra);
            taskAddOnFailureListener = signInIntent.addOnSuccessListener(new OnSuccessListener() { // from class: m.e
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    HiddenActivity.v(eVar, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: m.f
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    HiddenActivity.w(this.f9833a, exc);
                }
            });
        } else {
            taskAddOnFailureListener = null;
        }
        if (taskAddOnFailureListener == null) {
            Log.i("HiddenActivity", "During get sign-in intent, params is null, nothing to launch for get sign-in intent");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(l tmp0, Object obj) {
        m.e(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(HiddenActivity this$0, Exception e3) {
        m.e(this$0, "this$0");
        m.e(e3, "e");
        String str = ((e3 instanceof com.google.android.gms.common.api.b) && AbstractC1035a.f9907a.a().contains(Integer.valueOf(((com.google.android.gms.common.api.b) e3).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
        ResultReceiver resultReceiver = this$0.f3970a;
        m.b(resultReceiver);
        this$0.y(resultReceiver, str, "During get sign-in intent, failure response from one tap: " + e3.getMessage());
    }

    private final void x(Bundle bundle) {
        if (bundle != null) {
            this.f3971b = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(ResultReceiver resultReceiver, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", str);
        bundle.putString("EXCEPTION_MESSAGE", str2);
        resultReceiver.send(a.e.API_PRIORITY_OTHER, bundle);
        finish();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i3, int i4, Intent intent) {
        super.onActivityResult(i3, i4, intent);
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", false);
        bundle.putInt("ACTIVITY_REQUEST_CODE", i3);
        bundle.putParcelable("RESULT_DATA", intent);
        ResultReceiver resultReceiver = this.f3970a;
        if (resultReceiver != null) {
            resultReceiver.send(i4, bundle);
        }
        this.f3971b = false;
        finish();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra("TYPE");
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.f3970a = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        x(bundle);
        if (this.f3971b) {
            return;
        }
        if (stringExtra != null) {
            switch (stringExtra.hashCode()) {
                case -441061071:
                    if (stringExtra.equals("BEGIN_SIGN_IN")) {
                        l();
                        return;
                    }
                    break;
                case 15545322:
                    if (stringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                        r();
                        return;
                    }
                    break;
                case 1246634622:
                    if (stringExtra.equals("CREATE_PASSWORD")) {
                        o();
                        return;
                    }
                    break;
                case 1980564212:
                    if (stringExtra.equals("SIGN_IN_INTENT")) {
                        u();
                        return;
                    }
                    break;
            }
        }
        Log.w("HiddenActivity", "Activity handed an unsupported type");
        finish();
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        m.e(outState, "outState");
        outState.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.f3971b);
        super.onSaveInstanceState(outState);
    }
}
