package com.google.android.gms.common.api;

import M.C0415c;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.InterfaceC0606f;
import com.google.android.gms.common.api.internal.InterfaceC0614n;
import com.google.android.gms.common.internal.AbstractC0629d;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.common.internal.C0630e;
import com.google.android.gms.common.internal.InterfaceC0636k;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0106a f5323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f5324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5325c;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0106a extends e {
        @Deprecated
        public f buildClient(Context context, Looper looper, C0630e c0630e, Object obj, f.a aVar, f.b bVar) {
            return buildClient(context, looper, c0630e, obj, (InterfaceC0606f) aVar, (InterfaceC0614n) bVar);
        }

        public f buildClient(Context context, Looper looper, C0630e c0630e, Object obj, InterfaceC0606f interfaceC0606f, InterfaceC0614n interfaceC0614n) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c {
    }

    public interface d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final C0107a f5326j = new C0107a(null);

        /* JADX INFO: renamed from: com.google.android.gms.common.api.a$d$a, reason: collision with other inner class name */
        public static final class C0107a implements d {
            /* synthetic */ C0107a(byte[] bArr) {
            }
        }
    }

    public static abstract class e {
        public static final int API_PRIORITY_GAMES = 1;
        public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
        public static final int API_PRIORITY_PLUS = 2;

        public List<Scope> getImpliedScopes(Object obj) {
            return Collections.emptyList();
        }

        public int getPriority() {
            return API_PRIORITY_OTHER;
        }
    }

    public interface f extends b {
        void connect(AbstractC0629d.c cVar);

        void disconnect();

        void disconnect(String str);

        C0415c[] getAvailableFeatures();

        String getEndpointPackageName();

        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(InterfaceC0636k interfaceC0636k, Set set);

        Set getScopesForConnectionlessNonSignIn();

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(AbstractC0629d.e eVar);

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    public static final class g extends c {
    }

    public a(String str, AbstractC0106a abstractC0106a, g gVar) {
        AbstractC0643s.l(abstractC0106a, "Cannot construct an Api with a null ClientBuilder");
        AbstractC0643s.l(gVar, "Cannot construct an Api with a null ClientKey");
        this.f5325c = str;
        this.f5323a = abstractC0106a;
        this.f5324b = gVar;
    }

    public final AbstractC0106a a() {
        return this.f5323a;
    }

    public final c b() {
        return this.f5324b;
    }

    public final String c() {
        return this.f5325c;
    }
}
