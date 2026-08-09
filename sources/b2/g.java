package b2;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static void a(Appendable appendable, Object obj, U1.l lVar) {
        CharSequence charSequenceValueOf;
        kotlin.jvm.internal.m.e(appendable, "<this>");
        if (lVar == null) {
            if (obj != null && !(obj instanceof CharSequence)) {
                if (obj instanceof Character) {
                    appendable.append(((Character) obj).charValue());
                    return;
                }
                charSequenceValueOf = String.valueOf(obj);
            }
            appendable.append(charSequenceValueOf);
        }
        obj = lVar.invoke(obj);
        charSequenceValueOf = (CharSequence) obj;
        appendable.append(charSequenceValueOf);
    }
}
