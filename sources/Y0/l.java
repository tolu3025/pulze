package Y0;

/* JADX INFO: loaded from: classes.dex */
public class l extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3332b;

    public l(String str) {
        super("error parsing regexp: " + str);
        this.f3331a = str;
        this.f3332b = "";
    }

    public l(String str, String str2) {
        super("error parsing regexp: " + str + ": `" + str2 + "`");
        this.f3331a = str;
        this.f3332b = str2;
    }
}
