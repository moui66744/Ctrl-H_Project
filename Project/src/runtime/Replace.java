package runtime;

import AstGenerator.AstInfo;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;

public class Replace {
    public static void execReplace(List<ParserRuleContext> src, String text) {
        for (ParserRuleContext prc: src) {
//            AstInfo.replace(prc, text);
        }
    }
}
