package k0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import kotlin.jvm.internal.s;

/* JADX INFO: renamed from: k0.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1004r implements Comparable, Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f9482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f9481c = new b(null);
    public static final Parcelable.Creator<C1004r> CREATOR = new a();

    /* JADX INFO: renamed from: k0.r$a */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1004r createFromParcel(Parcel source) {
            kotlin.jvm.internal.m.e(source, "source");
            return new C1004r(source.readLong(), source.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1004r[] newArray(int i3) {
            return new C1004r[i3];
        }
    }

    /* JADX INFO: renamed from: k0.r$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final I1.m d(Date date) {
            Long lValueOf;
            long j3 = 1000;
            long time = date.getTime() / j3;
            int time2 = (int) ((date.getTime() % j3) * ((long) 1000000));
            if (time2 < 0) {
                lValueOf = Long.valueOf(time - 1);
                time2 += 1000000000;
            } else {
                lValueOf = Long.valueOf(time);
            }
            return I1.q.a(lValueOf, Integer.valueOf(time2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(long j3, int i3) {
            if (i3 < 0 || i3 >= 1000000000) {
                throw new IllegalArgumentException(("Timestamp nanoseconds out of range: " + i3).toString());
            }
            if (-62135596800L > j3 || j3 >= 253402300800L) {
                throw new IllegalArgumentException(("Timestamp seconds out of range: " + j3).toString());
            }
        }

        public final C1004r c() {
            return new C1004r(new Date());
        }
    }

    public C1004r(long j3, int i3) {
        f9481c.e(j3, i3);
        this.f9482a = j3;
        this.f9483b = i3;
    }

    public static final C1004r m() {
        return f9481c.c();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C1004r) && compareTo((C1004r) obj) == 0);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compareTo(C1004r other) {
        kotlin.jvm.internal.m.e(other, "other");
        return L1.b.b(this, other, new s() { // from class: k0.r.c
            @Override // kotlin.jvm.internal.s, Z1.g
            public Object get(Object obj) {
                return Long.valueOf(((C1004r) obj).l());
            }
        }, new s() { // from class: k0.r.d
            @Override // kotlin.jvm.internal.s, Z1.g
            public Object get(Object obj) {
                return Integer.valueOf(((C1004r) obj).i());
            }
        });
    }

    public int hashCode() {
        long j3 = this.f9482a;
        return (((((int) j3) * 1369) + ((int) (j3 >> 32))) * 37) + this.f9483b;
    }

    public final int i() {
        return this.f9483b;
    }

    public final long l() {
        return this.f9482a;
    }

    public final Date p() {
        return new Date((this.f9482a * ((long) 1000)) + ((long) (this.f9483b / 1000000)));
    }

    public String toString() {
        return "Timestamp(seconds=" + this.f9482a + ", nanoseconds=" + this.f9483b + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i3) {
        kotlin.jvm.internal.m.e(dest, "dest");
        dest.writeLong(this.f9482a);
        dest.writeInt(this.f9483b);
    }

    public C1004r(Date date) {
        kotlin.jvm.internal.m.e(date, "date");
        b bVar = f9481c;
        I1.m mVarD = bVar.d(date);
        long jLongValue = ((Number) mVarD.a()).longValue();
        int iIntValue = ((Number) mVarD.b()).intValue();
        bVar.e(jLongValue, iIntValue);
        this.f9482a = jLongValue;
        this.f9483b = iIntValue;
    }
}
