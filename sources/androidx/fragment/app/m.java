package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.AbstractC0516e;

/* JADX INFO: loaded from: classes.dex */
final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f4593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f4594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f4595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f4596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f4597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f4598f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final boolean f4599l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final boolean f4600m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final boolean f4601n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final Bundle f4602o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final boolean f4603p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final int f4604q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Bundle f4605r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Fragment f4606s;

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i3) {
            return new m[i3];
        }
    }

    m(Parcel parcel) {
        this.f4593a = parcel.readString();
        this.f4594b = parcel.readString();
        this.f4595c = parcel.readInt() != 0;
        this.f4596d = parcel.readInt();
        this.f4597e = parcel.readInt();
        this.f4598f = parcel.readString();
        this.f4599l = parcel.readInt() != 0;
        this.f4600m = parcel.readInt() != 0;
        this.f4601n = parcel.readInt() != 0;
        this.f4602o = parcel.readBundle();
        this.f4603p = parcel.readInt() != 0;
        this.f4605r = parcel.readBundle();
        this.f4604q = parcel.readInt();
    }

    public Fragment a(ClassLoader classLoader, g gVar) {
        Fragment fragment;
        Bundle bundle;
        if (this.f4606s == null) {
            Bundle bundle2 = this.f4602o;
            if (bundle2 != null) {
                bundle2.setClassLoader(classLoader);
            }
            Fragment fragmentA = gVar.a(classLoader, this.f4593a);
            this.f4606s = fragmentA;
            fragmentA.h1(this.f4602o);
            Bundle bundle3 = this.f4605r;
            if (bundle3 != null) {
                bundle3.setClassLoader(classLoader);
                fragment = this.f4606s;
                bundle = this.f4605r;
            } else {
                fragment = this.f4606s;
                bundle = new Bundle();
            }
            fragment.f4425b = bundle;
            Fragment fragment2 = this.f4606s;
            fragment2.f4429e = this.f4594b;
            fragment2.f4437r = this.f4595c;
            fragment2.f4439t = true;
            fragment2.f4397A = this.f4596d;
            fragment2.f4398B = this.f4597e;
            fragment2.f4399C = this.f4598f;
            fragment2.f4402F = this.f4599l;
            fragment2.f4436q = this.f4600m;
            fragment2.f4401E = this.f4601n;
            fragment2.f4400D = this.f4603p;
            fragment2.f4419W = AbstractC0516e.b.values()[this.f4604q];
            if (j.f4517M) {
                Log.v("FragmentManager", "Instantiated fragment " + this.f4606s);
            }
        }
        return this.f4606s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f4593a);
        sb.append(" (");
        sb.append(this.f4594b);
        sb.append(")}:");
        if (this.f4595c) {
            sb.append(" fromLayout");
        }
        if (this.f4597e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f4597e));
        }
        String str = this.f4598f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f4598f);
        }
        if (this.f4599l) {
            sb.append(" retainInstance");
        }
        if (this.f4600m) {
            sb.append(" removing");
        }
        if (this.f4601n) {
            sb.append(" detached");
        }
        if (this.f4603p) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f4593a);
        parcel.writeString(this.f4594b);
        parcel.writeInt(this.f4595c ? 1 : 0);
        parcel.writeInt(this.f4596d);
        parcel.writeInt(this.f4597e);
        parcel.writeString(this.f4598f);
        parcel.writeInt(this.f4599l ? 1 : 0);
        parcel.writeInt(this.f4600m ? 1 : 0);
        parcel.writeInt(this.f4601n ? 1 : 0);
        parcel.writeBundle(this.f4602o);
        parcel.writeInt(this.f4603p ? 1 : 0);
        parcel.writeBundle(this.f4605r);
        parcel.writeInt(this.f4604q);
    }

    m(Fragment fragment) {
        this.f4593a = fragment.getClass().getName();
        this.f4594b = fragment.f4429e;
        this.f4595c = fragment.f4437r;
        this.f4596d = fragment.f4397A;
        this.f4597e = fragment.f4398B;
        this.f4598f = fragment.f4399C;
        this.f4599l = fragment.f4402F;
        this.f4600m = fragment.f4436q;
        this.f4601n = fragment.f4401E;
        this.f4602o = fragment.f4430f;
        this.f4603p = fragment.f4400D;
        this.f4604q = fragment.f4419W.ordinal();
    }
}
