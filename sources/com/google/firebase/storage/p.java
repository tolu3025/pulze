package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.storage.H;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import k0.C0992f;

/* JADX INFO: loaded from: classes.dex */
public class p implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f6602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0771f f6603b;

    class a implements OnFailureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TaskCompletionSource f6604a;

        a(TaskCompletionSource taskCompletionSource) {
            this.f6604a = taskCompletionSource;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            this.f6604a.setException(C0779n.e(exc, 0));
        }
    }

    class b implements OnSuccessListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TaskCompletionSource f6606a;

        b(TaskCompletionSource taskCompletionSource) {
            this.f6606a = taskCompletionSource;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(H.d dVar) {
            if (this.f6606a.getTask().isComplete()) {
                return;
            }
            Log.e("StorageReference", "getBytes 'succeeded', but failed to set a Result.");
            this.f6606a.setException(C0779n.c(Status.f5314m));
        }
    }

    class c implements H.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f6608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TaskCompletionSource f6609b;

        c(long j3, TaskCompletionSource taskCompletionSource) {
            this.f6608a = j3;
            this.f6609b = taskCompletionSource;
        }

        @Override // com.google.firebase.storage.H.b
        public void a(H.d dVar, InputStream inputStream) throws IOException {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[16384];
                int i3 = 0;
                while (true) {
                    int i4 = inputStream.read(bArr, 0, 16384);
                    if (i4 == -1) {
                        byteArrayOutputStream.flush();
                        this.f6609b.setResult(byteArrayOutputStream.toByteArray());
                        inputStream.close();
                        return;
                    } else {
                        i3 += i4;
                        if (i3 > this.f6608a) {
                            Log.e("StorageReference", "the maximum allowed buffer size was exceeded.");
                            throw new IndexOutOfBoundsException("the maximum allowed buffer size was exceeded.");
                        }
                        byteArrayOutputStream.write(bArr, 0, i4);
                    }
                }
            } catch (Throwable th) {
                inputStream.close();
                throw th;
            }
        }
    }

    class d implements Continuation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f6611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f6612b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f6613c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TaskCompletionSource f6614d;

        d(List list, List list2, Executor executor, TaskCompletionSource taskCompletionSource) {
            this.f6611a = list;
            this.f6612b = list2;
            this.f6613c = executor;
            this.f6614d = taskCompletionSource;
        }

        @Override // com.google.android.gms.tasks.Continuation
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Task then(Task task) {
            if (task.isSuccessful()) {
                C0775j c0775j = (C0775j) task.getResult();
                this.f6611a.addAll(c0775j.d());
                this.f6612b.addAll(c0775j.b());
                if (c0775j.c() != null) {
                    p.this.x(null, c0775j.c()).continueWithTask(this.f6613c, this);
                } else {
                    this.f6614d.setResult(new C0775j(this.f6611a, this.f6612b, null));
                }
            } else {
                this.f6614d.setException(task.getException());
            }
            return Tasks.forResult(null);
        }
    }

    p(Uri uri, C0771f c0771f) {
        AbstractC0643s.b(uri != null, "storageUri cannot be null");
        AbstractC0643s.b(c0771f != null, "FirebaseApp cannot be null");
        this.f6602a = uri;
        this.f6603b = c0771f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task x(Integer num, String str) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        G.b().f(new RunnableC0776k(this, num, str, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public N A(Uri uri) {
        AbstractC0643s.b(uri != null, "uri cannot be null");
        N n3 = new N(this, null, uri, null);
        n3.b0();
        return n3;
    }

    public N B(Uri uri, o oVar) {
        AbstractC0643s.b(uri != null, "uri cannot be null");
        AbstractC0643s.b(oVar != null, "metadata cannot be null");
        N n3 = new N(this, oVar, uri, null);
        n3.b0();
        return n3;
    }

    public Task C(o oVar) {
        AbstractC0643s.k(oVar);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        G.b().f(new M(this, taskCompletionSource, oVar));
        return taskCompletionSource.getTask();
    }

    public p e(String str) {
        AbstractC0643s.b(!TextUtils.isEmpty(str), "childName cannot be null or empty");
        return new p(this.f6602a.buildUpon().appendEncodedPath(P0.d.b(P0.d.a(str))).build(), this.f6603b);
    }

    public boolean equals(Object obj) {
        if (obj instanceof p) {
            return ((p) obj).toString().equals(toString());
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(p pVar) {
        return this.f6602a.compareTo(pVar.f6602a);
    }

    public Task h() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        G.b().f(new RunnableC0769d(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public int hashCode() {
        return toString().hashCode();
    }

    C0992f i() {
        return s().a();
    }

    public String j() {
        return this.f6602a.getAuthority();
    }

    public Task k(long j3) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        H h3 = new H(this);
        h3.r0(new c(j3, taskCompletionSource)).addOnSuccessListener(new b(taskCompletionSource)).addOnFailureListener(new a(taskCompletionSource));
        h3.b0();
        return taskCompletionSource.getTask();
    }

    public Task l() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        G.b().f(new RunnableC0773h(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public C0770e m(Uri uri) {
        C0770e c0770e = new C0770e(this, uri);
        c0770e.b0();
        return c0770e;
    }

    public Task n() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        G.b().f(new RunnableC0774i(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public String o() {
        String path = this.f6602a.getPath();
        int iLastIndexOf = path.lastIndexOf(47);
        return iLastIndexOf != -1 ? path.substring(iLastIndexOf + 1) : path;
    }

    public p p() {
        String path = this.f6602a.getPath();
        if (TextUtils.isEmpty(path)) {
            return null;
        }
        if (path.equals("/")) {
            return null;
        }
        int iLastIndexOf = path.lastIndexOf(47);
        return new p(this.f6602a.buildUpon().path(iLastIndexOf != -1 ? path.substring(0, iLastIndexOf) : "/").build(), this.f6603b);
    }

    public String q() {
        return this.f6602a.getPath();
    }

    public p r() {
        return new p(this.f6602a.buildUpon().path("").build(), this.f6603b);
    }

    public C0771f s() {
        return this.f6603b;
    }

    P0.h t() {
        return new P0.h(this.f6602a, this.f6603b.e());
    }

    public String toString() {
        return "gs://" + this.f6602a.getAuthority() + this.f6602a.getEncodedPath();
    }

    public Task u(int i3) {
        AbstractC0643s.b(i3 > 0, "maxResults must be greater than zero");
        AbstractC0643s.b(i3 <= 1000, "maxResults must be at most 1000");
        return x(Integer.valueOf(i3), null);
    }

    public Task v(int i3, String str) {
        AbstractC0643s.b(i3 > 0, "maxResults must be greater than zero");
        AbstractC0643s.b(i3 <= 1000, "maxResults must be at most 1000");
        AbstractC0643s.b(str != null, "pageToken must be non-null to resume a previous list() operation");
        return x(Integer.valueOf(i3), str);
    }

    public Task w() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Executor executorA = G.b().a();
        x(null, null).continueWithTask(executorA, new d(arrayList, arrayList2, executorA, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public N y(byte[] bArr) {
        AbstractC0643s.b(bArr != null, "bytes cannot be null");
        N n3 = new N(this, null, bArr);
        n3.b0();
        return n3;
    }

    public N z(byte[] bArr, o oVar) {
        AbstractC0643s.b(bArr != null, "bytes cannot be null");
        AbstractC0643s.b(oVar != null, "metadata cannot be null");
        N n3 = new N(this, oVar, bArr);
        n3.b0();
        return n3;
    }
}
