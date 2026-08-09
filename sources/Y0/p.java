package Y0;

import Y0.o;

/* JADX INFO: loaded from: classes.dex */
abstract class p {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3381a;

        static {
            int[] iArr = new int[o.b.values().length];
            f3381a = iArr;
            try {
                iArr[o.b.CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3381a[o.b.CONCAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3381a[o.b.ALTERNATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3381a[o.b.STAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3381a[o.b.PLUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3381a[o.b.QUEST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3381a[o.b.REPEAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    static Y0.o a(
    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    private static o b(o.b bVar, int i3, o oVar, o oVar2) {
        o.b bVar2 = oVar.f3349a;
        if (bVar2 == o.b.EMPTY_MATCH) {
            return oVar;
        }
        if (bVar == bVar2 && (i3 & 32) == (oVar.f3350b & 32)) {
            return oVar;
        }
        if (oVar2 != null && oVar2.f3349a == bVar && (oVar2.f3350b & 32) == (i3 & 32) && oVar == oVar2.f3351c[0]) {
            return oVar2;
        }
        o oVar3 = new o(bVar);
        oVar3.f3350b = i3;
        oVar3.f3351c = new o[]{oVar};
        return oVar3;
    }
}
