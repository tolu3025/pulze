package x;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: renamed from: x.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1269a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f11713f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static C1269a f11714g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f11715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f11716b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f11717c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList f11718d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f11719e;

    /* JADX INFO: renamed from: x.a$a, reason: collision with other inner class name */
    class HandlerC0189a extends Handler {
        HandlerC0189a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                C1269a.this.a();
            }
        }
    }

    /* JADX INFO: renamed from: x.a$b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Intent f11721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ArrayList f11722b;

        b(Intent intent, ArrayList arrayList) {
            this.f11721a = intent;
            this.f11722b = arrayList;
        }
    }

    /* JADX INFO: renamed from: x.a$c */
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final IntentFilter f11723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final BroadcastReceiver f11724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f11725c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f11726d;

        c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f11723a = intentFilter;
            this.f11724b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f11724b);
            sb.append(" filter=");
            sb.append(this.f11723a);
            if (this.f11726d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private C1269a(Context context) {
        this.f11715a = context;
        this.f11719e = new HandlerC0189a(context.getMainLooper());
    }

    public static C1269a b(Context context) {
        C1269a c1269a;
        synchronized (f11713f) {
            try {
                if (f11714g == null) {
                    f11714g = new C1269a(context.getApplicationContext());
                }
                c1269a = f11714g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1269a;
    }

    void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f11716b) {
                try {
                    size = this.f11718d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    this.f11718d.toArray(bVarArr);
                    this.f11718d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i3 = 0; i3 < size; i3++) {
                b bVar = bVarArr[i3];
                int size2 = bVar.f11722b.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    c cVar = (c) bVar.f11722b.get(i4);
                    if (!cVar.f11726d) {
                        cVar.f11724b.onReceive(this.f11715a, bVar.f11721a);
                    }
                }
            }
        }
    }

    public void c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f11716b) {
            try {
                c cVar = new c(intentFilter, broadcastReceiver);
                ArrayList arrayList = (ArrayList) this.f11716b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f11716b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(cVar);
                for (int i3 = 0; i3 < intentFilter.countActions(); i3++) {
                    String action = intentFilter.getAction(i3);
                    ArrayList arrayList2 = (ArrayList) this.f11717c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f11717c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean d(Intent intent) {
        int i3;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        synchronized (this.f11716b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f11715a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z2 = (intent.getFlags() & 8) != 0;
                if (z2) {
                    Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList3 = (ArrayList) this.f11717c.get(intent.getAction());
                if (arrayList3 != null) {
                    if (z2) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList3);
                    }
                    ArrayList arrayList4 = null;
                    int i4 = 0;
                    while (i4 < arrayList3.size()) {
                        c cVar = (c) arrayList3.get(i4);
                        if (z2) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + cVar.f11723a);
                        }
                        if (cVar.f11725c) {
                            if (z2) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            i3 = i4;
                            arrayList2 = arrayList3;
                            str = action;
                            str2 = strResolveTypeIfNeeded;
                            arrayList = arrayList4;
                        } else {
                            i3 = i4;
                            str = action;
                            arrayList = arrayList4;
                            arrayList2 = arrayList3;
                            str2 = strResolveTypeIfNeeded;
                            int iMatch = cVar.f11723a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (iMatch >= 0) {
                                if (z2) {
                                    Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                                }
                                arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                                arrayList4.add(cVar);
                                cVar.f11725c = true;
                                i4 = i3 + 1;
                                action = str;
                                arrayList3 = arrayList2;
                                strResolveTypeIfNeeded = str2;
                            } else if (z2) {
                                Log.v("LocalBroadcastManager", "  Filter did not match: " + (iMatch != -4 ? iMatch != -3 ? iMatch != -2 ? iMatch != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                            }
                        }
                        arrayList4 = arrayList;
                        i4 = i3 + 1;
                        action = str;
                        arrayList3 = arrayList2;
                        strResolveTypeIfNeeded = str2;
                    }
                    ArrayList arrayList5 = arrayList4;
                    if (arrayList5 != null) {
                        for (int i5 = 0; i5 < arrayList5.size(); i5++) {
                            ((c) arrayList5.get(i5)).f11725c = false;
                        }
                        this.f11718d.add(new b(intent, arrayList5));
                        if (!this.f11719e.hasMessages(1)) {
                            this.f11719e.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f11716b) {
            try {
                ArrayList arrayList = (ArrayList) this.f11716b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    c cVar = (c) arrayList.get(size);
                    cVar.f11726d = true;
                    for (int i3 = 0; i3 < cVar.f11723a.countActions(); i3++) {
                        String action = cVar.f11723a.getAction(i3);
                        ArrayList arrayList2 = (ArrayList) this.f11717c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                c cVar2 = (c) arrayList2.get(size2);
                                if (cVar2.f11724b == broadcastReceiver) {
                                    cVar2.f11726d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f11717c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
