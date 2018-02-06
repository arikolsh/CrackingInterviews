package problemsolving.ibit;

import org.junit.Test;

import java.util.ArrayList;

public class PrettyJson {
    public ArrayList<String> prettyJSON(String A) {
        int indentCount = 0;
        ArrayList<String> res = new ArrayList<String>();
        StringBuilder currLine = new StringBuilder();
        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if (c == '{' || c == '[') {
                if (currLine.toString().trim().length() > 0)
                    res.add(currLine.toString());
                res.add(getIndent(indentCount) + c);
                indentCount++;
                currLine = new StringBuilder(getIndent(indentCount));
            } else if (c == ',') {
                res.add(currLine.toString() + c);
                currLine = new StringBuilder(getIndent(indentCount));
            } else if (c == '}' || c == ']') {
                indentCount--;
                if (currLine.toString().trim().length() > 0)
                    res.add(currLine.toString());
                currLine = new StringBuilder(getIndent(indentCount)+c);
            } else {
                currLine.append(c);
            }
        }
        if (currLine.toString().trim().length() > 0)
            res.add(currLine.toString());
        return res;
    }

    public String getIndent(int indentCount) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < indentCount; i++) strBuilder.append("\t");
        return strBuilder.toString();
    }

    @Test
    public void t() {
        String js = "{A:\"B\",C:{D:\"E\",F:{G:\"H\",I:\"J\"}}}";
        String js2 = "[\"foo\",{\"bar\":[\"baz\",null,1.0,2]}]";
        for (String row : prettyJSON(js2)) {
            System.out.println(row);
        }
    }
}
