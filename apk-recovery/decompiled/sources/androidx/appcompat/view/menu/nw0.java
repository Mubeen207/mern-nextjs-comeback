package androidx.appcompat.view.menu;

import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import androidx.appcompat.view.menu.mw0;
import androidx.appcompat.view.menu.nd0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
/* loaded from: classes.dex */
public class nw0 implements mw0.b, SpellCheckerSession.SpellCheckerSessionListener {
    public final mw0 a;
    public final TextServicesManager b;
    public SpellCheckerSession c;
    public nd0.d d;

    public nw0(TextServicesManager textServicesManager, mw0 mw0Var) {
        this.b = textServicesManager;
        this.a = mw0Var;
        mw0Var.b(this);
    }

    @Override // androidx.appcompat.view.menu.mw0.b
    public void a(String str, String str2, nd0.d dVar) {
        if (this.d != null) {
            dVar.b("error", "Previous spell check request still pending.", null);
            return;
        }
        this.d = dVar;
        c(str, str2);
    }

    public void b() {
        this.a.b(null);
        SpellCheckerSession spellCheckerSession = this.c;
        if (spellCheckerSession != null) {
            spellCheckerSession.close();
        }
    }

    public void c(String str, String str2) {
        Locale b = w90.b(str);
        if (this.c == null) {
            this.c = this.b.newSpellCheckerSession(null, b, this, true);
        }
        this.c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.d.c(new ArrayList());
            this.d = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        if (sentenceSuggestionsInfo == null) {
            this.d.c(new ArrayList());
            this.d = null;
            return;
        }
        for (int i = 0; i < sentenceSuggestionsInfo.getSuggestionsCount(); i++) {
            SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                HashMap hashMap = new HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i) + offsetAt;
                hashMap.put("startIndex", Integer.valueOf(offsetAt));
                hashMap.put("endIndex", Integer.valueOf(lengthAt));
                ArrayList arrayList2 = new ArrayList();
                boolean z = false;
                for (int i2 = 0; i2 < suggestionsCount; i2++) {
                    String suggestionAt = suggestionsInfoAt.getSuggestionAt(i2);
                    if (!suggestionAt.equals("")) {
                        arrayList2.add(suggestionAt);
                        z = true;
                    }
                }
                if (z) {
                    hashMap.put("suggestions", arrayList2);
                    arrayList.add(hashMap);
                }
            }
        }
        this.d.c(arrayList);
        this.d = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
