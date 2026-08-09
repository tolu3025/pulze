package com.google.android.recaptcha.internal;

import I1.g;
import I1.i;
import I1.u;
import J1.x;
import android.app.Application;
import android.webkit.WebView;
import c2.AbstractC0566i;
import c2.InterfaceC0595x;
import c2.W0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class zzja extends zze {
    public InterfaceC0595x zza;
    public zzfo zzb;
    private final zzek zzc;
    private zzsc zzf;
    private final zzek zzj;
    private final g zzk;
    private final g zzl;
    private final g zzm;
    private final g zzn;
    private final g zzo;
    private zzen zzp;
    private final zzbi zzq;
    private final Map zzd = zzjb.zza();
    private final Map zze = new LinkedHashMap();
    private final zzcb zzg = new zzcb(zzje.zza);
    private final zzjh zzh = zzjh.zzc();
    private final zzij zzi = new zzij(this);

    public zzja(zzek zzekVar, zzbi zzbiVar) {
        this.zzc = zzekVar;
        this.zzq = zzbiVar;
        zzek zzekVarZza = zzekVar.zza();
        zzekVarZza.zzc(zzekVar.zzd());
        this.zzj = zzekVarZza;
        int i3 = zzav.zza;
        this.zzk = i.a(zzis.zza);
        this.zzl = i.a(zzit.zza);
        this.zzm = i.a(zziu.zza);
        this.zzn = i.a(zziv.zza);
        this.zzo = i.a(zziw.zza);
    }

    private final Application zzD() {
        return (Application) this.zzo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzE(com.google.android.recaptcha.internal.zzsc r8, M1.d r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzim
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.internal.zzim r0 = (com.google.android.recaptcha.internal.zzim) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzim r0 = new com.google.android.recaptcha.internal.zzim
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.zza
            java.lang.Object r1 = N1.b.e()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.google.android.recaptcha.internal.zzja r8 = r0.zzd
            I1.o.b(r9)     // Catch: com.google.android.recaptcha.internal.zzbd -> L2b
            goto L4e
        L2b:
            r9 = move-exception
            goto L67
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            I1.o.b(r9)
            I1.g r9 = r7.zzn     // Catch: com.google.android.recaptcha.internal.zzbd -> L64
            java.lang.Object r9 = r9.getValue()     // Catch: com.google.android.recaptcha.internal.zzbd -> L64
            com.google.android.recaptcha.internal.zzff r9 = (com.google.android.recaptcha.internal.zzff) r9     // Catch: com.google.android.recaptcha.internal.zzbd -> L64
            com.google.android.recaptcha.internal.zzek r2 = r7.zzj     // Catch: com.google.android.recaptcha.internal.zzbd -> L64
            r0.zzd = r7     // Catch: com.google.android.recaptcha.internal.zzbd -> L64
            r0.zzc = r3     // Catch: com.google.android.recaptcha.internal.zzbd -> L64
            java.lang.Object r9 = r9.zzd(r8, r2, r0)     // Catch: com.google.android.recaptcha.internal.zzbd -> L64
            if (r9 != r1) goto L4d
            return r1
        L4d:
            r8 = r7
        L4e:
            java.lang.String r9 = (java.lang.String) r9     // Catch: com.google.android.recaptcha.internal.zzbd -> L2b
            com.google.android.recaptcha.internal.zzbi r0 = r8.zzq     // Catch: com.google.android.recaptcha.internal.zzbd -> L2b
            c2.N r1 = r0.zzb()     // Catch: com.google.android.recaptcha.internal.zzbd -> L2b
            com.google.android.recaptcha.internal.zzin r4 = new com.google.android.recaptcha.internal.zzin     // Catch: com.google.android.recaptcha.internal.zzbd -> L2b
            r0 = 0
            r4.<init>(r8, r9, r0)     // Catch: com.google.android.recaptcha.internal.zzbd -> L2b
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            c2.AbstractC0566i.d(r1, r2, r3, r4, r5, r6)     // Catch: com.google.android.recaptcha.internal.zzbd -> L2b
            goto L6e
        L64:
            r8 = move-exception
            r9 = r8
            r8 = r7
        L67:
            c2.x r8 = r8.zzA()
            r8.r(r9)
        L6e:
            I1.u r8 = I1.u.f2419a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzE(com.google.android.recaptcha.internal.zzsc, M1.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzF(java.lang.String r9, M1.d r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.recaptcha.internal.zzio
            if (r0 == 0) goto L13
            r0 = r10
            com.google.android.recaptcha.internal.zzio r0 = (com.google.android.recaptcha.internal.zzio) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzio r0 = new com.google.android.recaptcha.internal.zzio
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.zza
            java.lang.Object r1 = N1.b.e()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.String r9 = r0.zzf
            java.lang.String r1 = r0.zze
            com.google.android.recaptcha.internal.zzja r0 = r0.zzd
            I1.o.b(r10)     // Catch: java.lang.Exception -> L31
            r3 = r9
            r4 = r1
            goto L66
        L31:
            r9 = move-exception
            goto L75
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            I1.o.b(r10)
            com.google.android.recaptcha.internal.zzek r10 = r8.zzj
            r2 = 26
            com.google.android.recaptcha.internal.zzen r10 = r10.zzf(r2)
            r8.zzp = r10
            I1.g r10 = r8.zzl     // Catch: java.lang.Exception -> L73
            java.lang.Object r10 = r10.getValue()     // Catch: java.lang.Exception -> L73
            com.google.android.recaptcha.internal.zzbr r10 = (com.google.android.recaptcha.internal.zzbr) r10     // Catch: java.lang.Exception -> L73
            java.lang.String r10 = r10.zza()     // Catch: java.lang.Exception -> L73
            r0.zzd = r8     // Catch: java.lang.Exception -> L73
            r0.zze = r9     // Catch: java.lang.Exception -> L73
            r0.zzf = r10     // Catch: java.lang.Exception -> L73
            r0.zzc = r3     // Catch: java.lang.Exception -> L73
            java.lang.Object r0 = r8.zzw(r0)     // Catch: java.lang.Exception -> L73
            if (r0 == r1) goto L72
            r4 = r9
            r3 = r10
            r10 = r0
            r0 = r8
        L66:
            r2 = r10
            android.webkit.WebView r2 = (android.webkit.WebView) r2     // Catch: java.lang.Exception -> L31
            java.lang.String r5 = "text/html"
            java.lang.String r6 = "utf-8"
            r7 = 0
            r2.loadDataWithBaseURL(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L31
            goto L93
        L72:
            return r1
        L73:
            r9 = move-exception
            r0 = r8
        L75:
            com.google.android.recaptcha.internal.zzbd r10 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r1 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r2 = com.google.android.recaptcha.internal.zzba.zzU
            java.lang.String r9 = r9.getMessage()
            r10.<init>(r1, r2, r9)
            com.google.android.recaptcha.internal.zzen r9 = r0.zzp
            if (r9 == 0) goto L89
            r9.zzb(r10)
        L89:
            r9 = 0
            r0.zzp = r9
            c2.x r9 = r0.zzA()
            r9.r(r10)
        L93:
            I1.u r9 = I1.u.f2419a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzF(java.lang.String, M1.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzG(java.lang.String r9, M1.d r10) throws java.lang.Throwable {
        /*
            r8 = this;
            r0 = 1
            r1 = 2
            boolean r2 = r10 instanceof com.google.android.recaptcha.internal.zzix
            if (r2 == 0) goto L15
            r2 = r10
            com.google.android.recaptcha.internal.zzix r2 = (com.google.android.recaptcha.internal.zzix) r2
            int r3 = r2.zzc
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L15
            int r3 = r3 - r4
            r2.zzc = r3
            goto L1a
        L15:
            com.google.android.recaptcha.internal.zzix r2 = new com.google.android.recaptcha.internal.zzix
            r2.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r2.zza
            java.lang.Object r3 = N1.b.e()
            int r4 = r2.zzc
            if (r4 == 0) goto L40
            if (r4 == r0) goto L38
            if (r4 != r1) goto L30
            java.lang.String r9 = r2.zze
            com.google.android.recaptcha.internal.zzja r1 = r2.zzd
            I1.o.b(r10)
            goto L7f
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.String r9 = r2.zze
            com.google.android.recaptcha.internal.zzja r4 = r2.zzd
            I1.o.b(r10)
            goto L62
        L40:
            I1.o.b(r10)
            com.google.android.recaptcha.internal.zzcb r10 = r8.zzg
            r4 = 3
            com.google.android.recaptcha.internal.zzje[] r4 = new com.google.android.recaptcha.internal.zzje[r4]
            com.google.android.recaptcha.internal.zzje r5 = com.google.android.recaptcha.internal.zzje.zzd
            r6 = 0
            r4[r6] = r5
            com.google.android.recaptcha.internal.zzje r5 = com.google.android.recaptcha.internal.zzje.zzc
            r4[r0] = r5
            com.google.android.recaptcha.internal.zzje r5 = com.google.android.recaptcha.internal.zzje.zzb
            r4[r1] = r5
            r2.zzd = r8
            r2.zze = r9
            r2.zzc = r0
            java.lang.Object r10 = r10.zzb(r4, r2)
            if (r10 == r3) goto La6
            r4 = r8
        L62:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L6d
            I1.u r9 = I1.u.f2419a
            return r9
        L6d:
            com.google.android.recaptcha.internal.zzcb r10 = r4.zzg
            com.google.android.recaptcha.internal.zzje r5 = com.google.android.recaptcha.internal.zzje.zzb
            r2.zzd = r4
            r2.zze = r9
            r2.zzc = r1
            java.lang.Object r10 = r10.zzc(r5, r2)
            if (r10 != r3) goto L7e
            goto La6
        L7e:
            r1 = r4
        L7f:
            r10 = 0
            c2.x r0 = c2.AbstractC0599z.b(r10, r0, r10)
            r1.zza = r0
            com.google.android.recaptcha.internal.zzek r0 = r1.zzj
            r0.zzc(r9)
            r9 = 42
            com.google.android.recaptcha.internal.zzen r9 = r0.zzf(r9)
            com.google.android.recaptcha.internal.zzbi r0 = r1.zzq
            c2.N r2 = r0.zza()
            com.google.android.recaptcha.internal.zziz r5 = new com.google.android.recaptcha.internal.zziz
            r5.<init>(r1, r9, r10)
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            c2.AbstractC0566i.d(r2, r3, r4, r5, r6, r7)
            I1.u r9 = I1.u.f2419a
            return r9
        La6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzG(java.lang.String, M1.d):java.lang.Object");
    }

    public static final /* synthetic */ zzfk zzp(zzja zzjaVar) {
        return (zzfk) zzjaVar.zzm.getValue();
    }

    public final InterfaceC0595x zzA() {
        InterfaceC0595x interfaceC0595x = this.zza;
        if (interfaceC0595x != null) {
            return interfaceC0595x;
        }
        return null;
    }

    public final zzft zzC(zzsc zzscVar, zzcg zzcgVar, WebView webView) {
        zzfw zzfwVar = new zzfw(webView, this.zzq.zzb());
        zzhy zzhyVar = new zzhy();
        zzhyVar.zzb(x.W(zzscVar.zzP()));
        zzgf zzgfVar = new zzgf(zzfwVar, zzcgVar, new zzbo());
        zzhz zzhzVar = new zzhz(zzhyVar, new zzhw());
        zzgfVar.zze(3, zzD());
        zzgfVar.zze(5, zzig.zza());
        zzgfVar.zze(6, new zzia(zzD()));
        zzgfVar.zze(7, new zzic());
        zzgfVar.zze(8, new zzii(zzD()));
        zzgfVar.zze(9, new zzid(zzD()));
        zzgfVar.zze(10, new zzib(zzD()));
        return new zzft(this.zzq.zzd(), zzgfVar, zzhzVar, zzfn.zza());
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final zzen zza(String str) {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(str);
        return zzekVar.zzf(33);
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final zzen zzb() {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(zzekVar.zzd());
        return zzekVar.zzf(32);
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzd(String str, M1.d dVar) {
        zzsh zzshVarZzf = zzsi.zzf();
        zzshVarZzf.zze(str);
        return zzshVarZzf.zzk();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.lang.Object zzf(java.lang.String r18, M1.d r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzf(java.lang.String, M1.d):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzg(zzbd zzbdVar, M1.d dVar) {
        if (m.a(zzbdVar.zza(), zzba.zzb)) {
            zzen zzenVar = this.zzp;
            if (zzenVar != null) {
                zzenVar.zzb(zzbdVar);
            }
            this.zzp = null;
        }
        return u.f2419a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (zzG(r6, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        if (r6.zzc(r7, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.lang.Object zzh(com.google.android.recaptcha.internal.zzsc r6, M1.d r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzir
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzir r0 = (com.google.android.recaptcha.internal.zzir) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzir r0 = new com.google.android.recaptcha.internal.zzir
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.zza
            java.lang.Object r1 = N1.b.e()
            int r2 = r0.zzc
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            I1.o.b(r7)
            goto L5e
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            I1.o.b(r7)
            goto L74
        L38:
            I1.o.b(r7)
            boolean r7 = r6.zzT()
            if (r7 == 0) goto L67
            boolean r7 = r6.zzR()
            if (r7 == 0) goto L67
            boolean r7 = r6.zzQ()
            if (r7 != 0) goto L4e
            goto L67
        L4e:
            r5.zzf = r6
            com.google.android.recaptcha.internal.zzek r6 = r5.zzc
            java.lang.String r6 = r6.zzd()
            r0.zzc = r3
            java.lang.Object r6 = r5.zzG(r6, r0)
            if (r6 == r1) goto L73
        L5e:
            I1.n$a r6 = I1.n.f2411b
            I1.u r6 = I1.u.f2419a
        L62:
            java.lang.Object r6 = I1.n.b(r6)
            return r6
        L67:
            com.google.android.recaptcha.internal.zzcb r6 = r5.zzg
            com.google.android.recaptcha.internal.zzje r7 = com.google.android.recaptcha.internal.zzje.zzd
            r0.zzc = r4
            java.lang.Object r6 = r6.zzc(r7, r0)
            if (r6 != r1) goto L74
        L73:
            return r1
        L74:
            I1.n$a r6 = I1.n.f2411b
            com.google.android.recaptcha.internal.zzbd r6 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r7 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r0 = com.google.android.recaptcha.internal.zzba.zzav
            r1 = 0
            r6.<init>(r7, r0, r1)
            java.lang.Object r6 = I1.o.a(r6)
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzh(com.google.android.recaptcha.internal.zzsc, M1.d):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzi(String str, long j3, Exception exc, M1.d dVar) {
        exc.getMessage();
        InterfaceC0595x interfaceC0595x = (InterfaceC0595x) this.zze.remove(str);
        if (interfaceC0595x != null) {
            kotlin.coroutines.jvm.internal.b.a(interfaceC0595x.r(exc));
        }
        return u.f2419a;
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzj(Exception exc, M1.d dVar) {
        return ((exc instanceof W0) && this.zzi.zza() == null) ? new zzbd(zzbb.zzc, zzba.zzH, null) : zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzV, exc.getMessage()));
    }

    public final zzcb zzm() {
        return this.zzg;
    }

    public final zzij zzq() {
        return this.zzi;
    }

    public final Object zzw(M1.d dVar) {
        return AbstractC0566i.g(this.zzq.zzb().e(), new zzjc((zzjd) this.zzk.getValue(), zzD(), null), dVar);
    }

    public final Object zzx(M1.d dVar) {
        Object objG = AbstractC0566i.g(this.zzq.zzb().e(), new zzil(this, null), dVar);
        return objG == N1.d.e() ? objG : u.f2419a;
    }
}
