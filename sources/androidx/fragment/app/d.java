package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.a;
import androidx.lifecycle.AbstractC0516e;
import androidx.lifecycle.C;
import androidx.lifecycle.D;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends ComponentActivity implements a.c {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    boolean f4499D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    boolean f4500E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    boolean f4502G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    boolean f4503H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    boolean f4504I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    int f4505J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    androidx.collection.g f4506K;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    final f f4497B = f.b(new a());

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final androidx.lifecycle.j f4498C = new androidx.lifecycle.j(this);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    boolean f4501F = true;

    class a extends h implements D, androidx.activity.r {
        public a() {
            super(d.this);
        }

        @Override // androidx.lifecycle.i
        public AbstractC0516e a() {
            return d.this.f4498C;
        }

        @Override // androidx.fragment.app.e
        public View c(int i3) {
            return d.this.findViewById(i3);
        }

        @Override // androidx.fragment.app.e
        public boolean d() {
            Window window = d.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.lifecycle.D
        public C e() {
            return d.this.e();
        }

        @Override // androidx.fragment.app.h
        public void i(Fragment fragment) {
            d.this.M(fragment);
        }

        @Override // androidx.activity.r
        public OnBackPressedDispatcher j() {
            return d.this.j();
        }

        @Override // androidx.fragment.app.h
        public void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            d.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.h
        public LayoutInflater n() {
            return d.this.getLayoutInflater().cloneInContext(d.this);
        }

        @Override // androidx.fragment.app.h
        public int o() {
            Window window = d.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.h
        public boolean p() {
            return d.this.getWindow() != null;
        }

        @Override // androidx.fragment.app.h
        public boolean q(Fragment fragment) {
            return !d.this.isFinishing();
        }

        @Override // androidx.fragment.app.h
        public void r(Fragment fragment, Intent intent, int i3, Bundle bundle) {
            d.this.P(fragment, intent, i3, bundle);
        }

        @Override // androidx.fragment.app.h
        public void s() {
            d.this.Q();
        }

        @Override // androidx.fragment.app.h
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public d m() {
            return d.this;
        }
    }

    private int F(Fragment fragment) {
        if (this.f4506K.k() >= 65534) {
            throw new IllegalStateException("Too many pending Fragment activity results.");
        }
        while (this.f4506K.g(this.f4505J) >= 0) {
            this.f4505J = (this.f4505J + 1) % 65534;
        }
        int i3 = this.f4505J;
        this.f4506K.i(i3, fragment.f4429e);
        this.f4505J = (this.f4505J + 1) % 65534;
        return i3;
    }

    static void G(int i3) {
        if ((i3 & (-65536)) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    private void K() {
        while (L(I(), AbstractC0516e.b.CREATED)) {
        }
    }

    private static boolean L(i iVar, AbstractC0516e.b bVar) {
        boolean zL = false;
        for (Fragment fragment : iVar.f()) {
            if (fragment != null) {
                if (fragment.a().b().e(AbstractC0516e.b.STARTED)) {
                    fragment.f4420X.m(bVar);
                    zL = true;
                }
                if (fragment.x() != null) {
                    zL |= L(fragment.q(), bVar);
                }
            }
        }
        return zL;
    }

    final View H(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f4497B.w(view, str, context, attributeSet);
    }

    public i I() {
        return this.f4497B.u();
    }

    public androidx.loader.app.a J() {
        return androidx.loader.app.a.b(this);
    }

    public void M(Fragment fragment) {
    }

    protected boolean N(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    protected void O() {
        this.f4498C.h(AbstractC0516e.a.ON_RESUME);
        this.f4497B.p();
    }

    public void P(Fragment fragment, Intent intent, int i3, Bundle bundle) {
        this.f4504I = true;
        try {
            if (i3 == -1) {
                androidx.core.app.a.m(this, intent, -1, bundle);
            } else {
                G(i3);
                androidx.core.app.a.m(this, intent, ((F(fragment) + 1) << 16) + (i3 & 65535), bundle);
            }
        } finally {
            this.f4504I = false;
        }
    }

    public void Q() {
        invalidateOptionsMenu();
    }

    @Override // androidx.core.app.a.c
    public final void b(int i3) {
        if (this.f4502G || i3 == -1) {
            return;
        }
        G(i3);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f4499D);
        printWriter.print(" mResumed=");
        printWriter.print(this.f4500E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f4501F);
        if (getApplication() != null) {
            androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f4497B.u().b(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i3, int i4, Intent intent) {
        this.f4497B.v();
        int i5 = i3 >> 16;
        if (i5 == 0) {
            androidx.core.app.a.k();
            super.onActivityResult(i3, i4, intent);
            return;
        }
        int i6 = i5 - 1;
        String str = (String) this.f4506K.d(i6);
        this.f4506K.j(i6);
        if (str == null) {
            Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            return;
        }
        Fragment fragmentT = this.f4497B.t(str);
        if (fragmentT != null) {
            fragmentT.W(i3 & 65535, i4, intent);
            return;
        }
        Log.w("FragmentActivity", "Activity result no fragment exists for who: " + str);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f4497B.v();
        this.f4497B.d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.d, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.f4497B.a(null);
        if (bundle != null) {
            this.f4497B.x(bundle.getParcelable("android:support:fragments"));
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f4505J = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f4506K = new androidx.collection.g(intArray.length);
                    for (int i3 = 0; i3 < intArray.length; i3++) {
                        this.f4506K.i(intArray[i3], stringArray[i3]);
                    }
                }
            }
        }
        if (this.f4506K == null) {
            this.f4506K = new androidx.collection.g();
            this.f4505J = 0;
        }
        super.onCreate(bundle);
        this.f4498C.h(AbstractC0516e.a.ON_CREATE);
        this.f4497B.f();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i3, Menu menu) {
        return i3 == 0 ? super.onCreatePanelMenu(i3, menu) | this.f4497B.g(menu, getMenuInflater()) : super.onCreatePanelMenu(i3, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewH = H(view, str, context, attributeSet);
        return viewH == null ? super.onCreateView(view, str, context, attributeSet) : viewH;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f4497B.h();
        this.f4498C.h(AbstractC0516e.a.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f4497B.i();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        if (super.onMenuItemSelected(i3, menuItem)) {
            return true;
        }
        if (i3 == 0) {
            return this.f4497B.k(menuItem);
        }
        if (i3 != 6) {
            return false;
        }
        return this.f4497B.e(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z2) {
        this.f4497B.j(z2);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f4497B.v();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i3, Menu menu) {
        if (i3 == 0) {
            this.f4497B.l(menu);
        }
        super.onPanelClosed(i3, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f4500E = false;
        this.f4497B.m();
        this.f4498C.h(AbstractC0516e.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z2) {
        this.f4497B.n(z2);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        O();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i3, View view, Menu menu) {
        return i3 == 0 ? N(view, menu) | this.f4497B.o(menu) : super.onPreparePanel(i3, view, menu);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        this.f4497B.v();
        int i4 = (i3 >> 16) & 65535;
        if (i4 != 0) {
            int i5 = i4 - 1;
            String str = (String) this.f4506K.d(i5);
            this.f4506K.j(i5);
            if (str == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment fragmentT = this.f4497B.t(str);
            if (fragmentT != null) {
                fragmentT.v0(i3 & 65535, strArr, iArr);
                return;
            }
            Log.w("FragmentActivity", "Activity result no fragment exists for who: " + str);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f4500E = true;
        this.f4497B.v();
        this.f4497B.s();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.d, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        K();
        this.f4498C.h(AbstractC0516e.a.ON_STOP);
        Parcelable parcelableY = this.f4497B.y();
        if (parcelableY != null) {
            bundle.putParcelable("android:support:fragments", parcelableY);
        }
        if (this.f4506K.k() > 0) {
            bundle.putInt("android:support:next_request_index", this.f4505J);
            int[] iArr = new int[this.f4506K.k()];
            String[] strArr = new String[this.f4506K.k()];
            for (int i3 = 0; i3 < this.f4506K.k(); i3++) {
                iArr[i3] = this.f4506K.h(i3);
                strArr[i3] = (String) this.f4506K.l(i3);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f4501F = false;
        if (!this.f4499D) {
            this.f4499D = true;
            this.f4497B.c();
        }
        this.f4497B.v();
        this.f4497B.s();
        this.f4498C.h(AbstractC0516e.a.ON_START);
        this.f4497B.q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f4497B.v();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f4501F = true;
        K();
        this.f4497B.r();
        this.f4498C.h(AbstractC0516e.a.ON_STOP);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i3) {
        if (!this.f4504I && i3 != -1) {
            G(i3);
        }
        super.startActivityForResult(intent, i3);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i3, Intent intent, int i4, int i5, int i6) {
        if (!this.f4503H && i3 != -1) {
            G(i3);
        }
        super.startIntentSenderForResult(intentSender, i3, intent, i4, i5, i6);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewH = H(null, str, context, attributeSet);
        return viewH == null ? super.onCreateView(str, context, attributeSet) : viewH;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i3, Bundle bundle) {
        if (!this.f4504I && i3 != -1) {
            G(i3);
        }
        super.startActivityForResult(intent, i3, bundle);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i3, Intent intent, int i4, int i5, int i6, Bundle bundle) {
        if (!this.f4503H && i3 != -1) {
            G(i3);
        }
        super.startIntentSenderForResult(intentSender, i3, intent, i4, i5, i6, bundle);
    }
}
