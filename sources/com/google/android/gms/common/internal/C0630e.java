package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import b0.C0519a;
import c.AbstractC0527b;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0630e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Account f5527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f5528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f5529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f5530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f5531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final View f5532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f5533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f5534h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C0519a f5535i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f5536j;

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Account f5537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.collection.b f5538b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f5539c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f5540d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final C0519a f5541e = C0519a.f4923o;

        public C0630e a() {
            return new C0630e(this.f5537a, this.f5538b, null, 0, null, this.f5539c, this.f5540d, this.f5541e, false);
        }

        public a b(String str) {
            this.f5539c = str;
            return this;
        }

        public final a c(Account account) {
            this.f5537a = account;
            return this;
        }

        public final a d(Collection collection) {
            if (this.f5538b == null) {
                this.f5538b = new androidx.collection.b();
            }
            this.f5538b.addAll(collection);
            return this;
        }

        public final a e(String str) {
            this.f5540d = str;
            return this;
        }
    }

    public C0630e(Account account, Set set, Map map, int i3, View view, String str, String str2, C0519a c0519a, boolean z2) {
        this.f5527a = account;
        Set setEmptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f5528b = setEmptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f5530d = map;
        this.f5532f = view;
        this.f5531e = i3;
        this.f5533g = str;
        this.f5534h = str2;
        this.f5535i = c0519a == null ? C0519a.f4923o : c0519a;
        HashSet hashSet = new HashSet(setEmptySet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            AbstractC0527b.a(it.next());
            throw null;
        }
        this.f5529c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f5527a;
    }

    public String b() {
        Account account = this.f5527a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public Account c() {
        Account account = this.f5527a;
        return account != null ? account : new Account(AbstractC0629d.DEFAULT_ACCOUNT, "com.google");
    }

    public Set d() {
        return this.f5529c;
    }

    public Set e(com.google.android.gms.common.api.a aVar) {
        AbstractC0527b.a(this.f5530d.get(aVar));
        return this.f5528b;
    }

    public String f() {
        return this.f5533g;
    }

    public Set g() {
        return this.f5528b;
    }

    public final String h() {
        return this.f5534h;
    }

    public final C0519a i() {
        return this.f5535i;
    }

    public final Integer j() {
        return this.f5536j;
    }

    public final void k(Integer num) {
        this.f5536j = num;
    }
}
