package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.n;
import androidx.lifecycle.AbstractC0516e;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int[] f4470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList f4471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int[] f4472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int[] f4473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f4474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f4475f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final String f4476l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final int f4477m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final int f4478n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final CharSequence f4479o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final int f4480p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final CharSequence f4481q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final ArrayList f4482r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final ArrayList f4483s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final boolean f4484t;

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i3) {
            return new b[i3];
        }
    }

    public b(Parcel parcel) {
        this.f4470a = parcel.createIntArray();
        this.f4471b = parcel.createStringArrayList();
        this.f4472c = parcel.createIntArray();
        this.f4473d = parcel.createIntArray();
        this.f4474e = parcel.readInt();
        this.f4475f = parcel.readInt();
        this.f4476l = parcel.readString();
        this.f4477m = parcel.readInt();
        this.f4478n = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f4479o = (CharSequence) creator.createFromParcel(parcel);
        this.f4480p = parcel.readInt();
        this.f4481q = (CharSequence) creator.createFromParcel(parcel);
        this.f4482r = parcel.createStringArrayList();
        this.f4483s = parcel.createStringArrayList();
        this.f4484t = parcel.readInt() != 0;
    }

    public androidx.fragment.app.a a(j jVar) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(jVar);
        int i3 = 0;
        int i4 = 0;
        while (i3 < this.f4470a.length) {
            n.a aVar2 = new n.a();
            int i5 = i3 + 1;
            aVar2.f4625a = this.f4470a[i3];
            if (j.f4517M) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i4 + " base fragment #" + this.f4470a[i5]);
            }
            String str = (String) this.f4471b.get(i4);
            aVar2.f4626b = str != null ? (Fragment) jVar.f4536l.get(str) : null;
            aVar2.f4631g = AbstractC0516e.b.values()[this.f4472c[i4]];
            aVar2.f4632h = AbstractC0516e.b.values()[this.f4473d[i4]];
            int[] iArr = this.f4470a;
            int i6 = iArr[i5];
            aVar2.f4627c = i6;
            int i7 = iArr[i3 + 2];
            aVar2.f4628d = i7;
            int i8 = i3 + 4;
            int i9 = iArr[i3 + 3];
            aVar2.f4629e = i9;
            i3 += 5;
            int i10 = iArr[i8];
            aVar2.f4630f = i10;
            aVar.f4608b = i6;
            aVar.f4609c = i7;
            aVar.f4610d = i9;
            aVar.f4611e = i10;
            aVar.c(aVar2);
            i4++;
        }
        aVar.f4612f = this.f4474e;
        aVar.f4613g = this.f4475f;
        aVar.f4616j = this.f4476l;
        aVar.f4469u = this.f4477m;
        aVar.f4614h = true;
        aVar.f4617k = this.f4478n;
        aVar.f4618l = this.f4479o;
        aVar.f4619m = this.f4480p;
        aVar.f4620n = this.f4481q;
        aVar.f4621o = this.f4482r;
        aVar.f4622p = this.f4483s;
        aVar.f4623q = this.f4484t;
        aVar.h(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeIntArray(this.f4470a);
        parcel.writeStringList(this.f4471b);
        parcel.writeIntArray(this.f4472c);
        parcel.writeIntArray(this.f4473d);
        parcel.writeInt(this.f4474e);
        parcel.writeInt(this.f4475f);
        parcel.writeString(this.f4476l);
        parcel.writeInt(this.f4477m);
        parcel.writeInt(this.f4478n);
        TextUtils.writeToParcel(this.f4479o, parcel, 0);
        parcel.writeInt(this.f4480p);
        TextUtils.writeToParcel(this.f4481q, parcel, 0);
        parcel.writeStringList(this.f4482r);
        parcel.writeStringList(this.f4483s);
        parcel.writeInt(this.f4484t ? 1 : 0);
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f4607a.size();
        this.f4470a = new int[size * 5];
        if (!aVar.f4614h) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f4471b = new ArrayList(size);
        this.f4472c = new int[size];
        this.f4473d = new int[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            n.a aVar2 = (n.a) aVar.f4607a.get(i4);
            int i5 = i3 + 1;
            this.f4470a[i3] = aVar2.f4625a;
            ArrayList arrayList = this.f4471b;
            Fragment fragment = aVar2.f4626b;
            arrayList.add(fragment != null ? fragment.f4429e : null);
            int[] iArr = this.f4470a;
            iArr[i5] = aVar2.f4627c;
            iArr[i3 + 2] = aVar2.f4628d;
            int i6 = i3 + 4;
            iArr[i3 + 3] = aVar2.f4629e;
            i3 += 5;
            iArr[i6] = aVar2.f4630f;
            this.f4472c[i4] = aVar2.f4631g.ordinal();
            this.f4473d[i4] = aVar2.f4632h.ordinal();
        }
        this.f4474e = aVar.f4612f;
        this.f4475f = aVar.f4613g;
        this.f4476l = aVar.f4616j;
        this.f4477m = aVar.f4469u;
        this.f4478n = aVar.f4617k;
        this.f4479o = aVar.f4618l;
        this.f4480p = aVar.f4619m;
        this.f4481q = aVar.f4620n;
        this.f4482r = aVar.f4621o;
        this.f4483s = aVar.f4622p;
        this.f4484t = aVar.f4623q;
    }
}
