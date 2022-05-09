package runtime;

import AstGenerator.AstInfo;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;

public class Replace {
    public static void execReplace(ArrayList<ParserRuleContext> src, String text) {
        for (ParserRuleContext prc: src) {
            AstInfo.replace(prc, text);
        }
    }
}
