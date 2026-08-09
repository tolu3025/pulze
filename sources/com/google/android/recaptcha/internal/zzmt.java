package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzmt {
    private static final zzmt zzb = new zzmt(true);
    final zzpe zza = new zzoz();
    private boolean zzc;
    private boolean zzd;

    private zzmt() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zza(com.google.android.recaptcha.internal.zzms r4, java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzmt.zza(com.google.android.recaptcha.internal.zzms, java.lang.Object):int");
    }

    public static zzmt zzd() {
        return zzb;
    }

    private static Object zzl(Object obj) {
        if (obj instanceof zzon) {
            return ((zzon) obj).zzd();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void zzm(Map.Entry entry) {
        zzms zzmsVar = (zzms) entry.getKey();
        Object value = entry.getValue();
        boolean z2 = value instanceof zzns;
        zzmsVar.zzg();
        if (zzmsVar.zze() != zzpx.MESSAGE) {
            if (z2) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.put(zzmsVar, zzl(value));
            return;
        }
        Object objZze = zze(zzmsVar);
        if (objZze == null) {
            this.zza.put(zzmsVar, zzl(value));
            if (z2) {
                this.zzd = true;
                return;
            }
            return;
        }
        if (z2) {
            throw null;
        }
        this.zza.put(zzmsVar, objZze instanceof zzon ? zzmsVar.zzc((zzon) objZze, (zzon) value) : zzmsVar.zzb(((zzoi) objZze).zzae(), (zzoi) value).zzk());
    }

    private static boolean zzn(Map.Entry entry) {
        zzms zzmsVar = (zzms) entry.getKey();
        if (zzmsVar.zze() != zzpx.MESSAGE) {
            return true;
        }
        zzmsVar.zzg();
        Object value = entry.getValue();
        if (value instanceof zzoj) {
            return ((zzoj) value).zzp();
        }
        if (value instanceof zzns) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzo(Map.Entry entry) {
        int i3;
        int iZzA;
        int iZzA2;
        zzms zzmsVar = (zzms) entry.getKey();
        Object value = entry.getValue();
        if (zzmsVar.zze() != zzpx.MESSAGE) {
            return zza(zzmsVar, value);
        }
        zzmsVar.zzg();
        zzmsVar.zzf();
        boolean z2 = value instanceof zzns;
        int iZza = ((zzms) entry.getKey()).zza();
        if (z2) {
            int iZzA3 = zzln.zzA(8);
            i3 = iZzA3 + iZzA3;
            iZzA = zzln.zzA(16) + zzln.zzA(iZza);
            int iZzA4 = zzln.zzA(24);
            int iZza2 = ((zzns) value).zza();
            iZzA2 = iZzA4 + zzln.zzA(iZza2) + iZza2;
        } else {
            int iZzA5 = zzln.zzA(8);
            i3 = iZzA5 + iZzA5;
            iZzA = zzln.zzA(16) + zzln.zzA(iZza);
            iZzA2 = zzln.zzA(24) + zzln.zzx((zzoi) value);
        }
        return i3 + iZzA + iZzA2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzmt) {
            return this.zza.equals(((zzmt) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzb() {
        int iZzc = this.zza.zzc();
        int iZzo = 0;
        for (int i3 = 0; i3 < iZzc; i3++) {
            iZzo += zzo(this.zza.zzg(i3));
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            iZzo += zzo((Map.Entry) it.next());
        }
        return iZzo;
    }

    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzmt clone() {
        zzmt zzmtVar = new zzmt();
        int iZzc = this.zza.zzc();
        for (int i3 = 0; i3 < iZzc; i3++) {
            Map.Entry entryZzg = this.zza.zzg(i3);
            zzmtVar.zzi((zzms) ((zzpa) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzd()) {
            zzmtVar.zzi((zzms) entry.getKey(), entry.getValue());
        }
        zzmtVar.zzd = this.zzd;
        return zzmtVar;
    }

    public final Object zze(zzms zzmsVar) {
        Object obj = this.zza.get(zzmsVar);
        if (!(obj instanceof zzns)) {
            return obj;
        }
        throw null;
    }

    public final Iterator zzf() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zznq(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        int iZzc = this.zza.zzc();
        for (int i3 = 0; i3 < iZzc; i3++) {
            Object value = this.zza.zzg(i3).getValue();
            if (value instanceof zznd) {
                ((zznd) value).zzG();
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zznd) {
                ((zznd) value2).zzG();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzmt zzmtVar) {
        int iZzc = zzmtVar.zza.zzc();
        for (int i3 = 0; i3 < iZzc; i3++) {
            zzm(zzmtVar.zza.zzg(i3));
        }
        Iterator it = zzmtVar.zza.zzd().iterator();
        while (it.hasNext()) {
            zzm((Map.Entry) it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if ((r7 instanceof com.google.android.recaptcha.internal.zznf) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if ((r7 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        if (r1 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if ((r7 instanceof com.google.android.recaptcha.internal.zzns) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(com.google.android.recaptcha.internal.zzms r6, java.lang.Object r7) {
        /*
            r5 = this;
            r0 = 1
            r6.zzg()
            com.google.android.recaptcha.internal.zzpw r1 = r6.zzd()
            byte[] r2 = com.google.android.recaptcha.internal.zznl.zzb
            r7.getClass()
            com.google.android.recaptcha.internal.zzpw r2 = com.google.android.recaptcha.internal.zzpw.zza
            com.google.android.recaptcha.internal.zzpx r2 = com.google.android.recaptcha.internal.zzpx.INT
            com.google.android.recaptcha.internal.zzpx r1 = r1.zza()
            int r1 = r1.ordinal()
            switch(r1) {
                case 0: goto L47;
                case 1: goto L44;
                case 2: goto L41;
                case 3: goto L3e;
                case 4: goto L3b;
                case 5: goto L38;
                case 6: goto L2f;
                case 7: goto L26;
                case 8: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L57
        L1d:
            boolean r1 = r7 instanceof com.google.android.recaptcha.internal.zzoi
            if (r1 != 0) goto L4b
            boolean r1 = r7 instanceof com.google.android.recaptcha.internal.zzns
            if (r1 == 0) goto L57
            goto L4b
        L26:
            boolean r1 = r7 instanceof java.lang.Integer
            if (r1 != 0) goto L4b
            boolean r1 = r7 instanceof com.google.android.recaptcha.internal.zznf
            if (r1 == 0) goto L57
            goto L4b
        L2f:
            boolean r1 = r7 instanceof com.google.android.recaptcha.internal.zzle
            if (r1 != 0) goto L4b
            boolean r1 = r7 instanceof byte[]
            if (r1 == 0) goto L57
            goto L4b
        L38:
            boolean r1 = r7 instanceof java.lang.String
            goto L49
        L3b:
            boolean r1 = r7 instanceof java.lang.Boolean
            goto L49
        L3e:
            boolean r1 = r7 instanceof java.lang.Double
            goto L49
        L41:
            boolean r1 = r7 instanceof java.lang.Float
            goto L49
        L44:
            boolean r1 = r7 instanceof java.lang.Long
            goto L49
        L47:
            boolean r1 = r7 instanceof java.lang.Integer
        L49:
            if (r1 == 0) goto L57
        L4b:
            boolean r1 = r7 instanceof com.google.android.recaptcha.internal.zzns
            if (r1 == 0) goto L51
            r5.zzd = r0
        L51:
            com.google.android.recaptcha.internal.zzpe r0 = r5.zza
            r0.put(r6, r7)
            return
        L57:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            int r2 = r6.zza()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.recaptcha.internal.zzpw r6 = r6.zzd()
            com.google.android.recaptcha.internal.zzpx r6 = r6.zza()
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r2
            r3[r0] = r6
            r6 = 2
            r3[r6] = r7
            java.lang.String r6 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r6 = java.lang.String.format(r6, r3)
            r1.<init>(r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzmt.zzi(com.google.android.recaptcha.internal.zzms, java.lang.Object):void");
    }

    public final boolean zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        int iZzc = this.zza.zzc();
        for (int i3 = 0; i3 < iZzc; i3++) {
            if (!zzn(this.zza.zzg(i3))) {
                return false;
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            if (!zzn((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzmt(boolean z2) {
        zzg();
        zzg();
    }
}
