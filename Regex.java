import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Regex {
    private List<String> strings;
    private String regex;

    public Regex() {
        strings = new ArrayList<>();
        regex = "^(?!-)(?!.*--)([a-zA-Z0-9-]+\\.)*[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}(?<!-)$|^(?!0)(?!.*[.]0)(?!.*[.]0[.])((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
    }

    public List<String> getStrings() {
        return strings;
    }

    public String getString(int index) {
        return strings.get(index);
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }

    public void addString(String s) {
        strings.add(s);
    }

    public void addStrings(String[] st) {
        for (String s : st) {
            strings.add(s);
        }
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public boolean match(int index) {
        return strings.get(index).matches(regex);
    }

    public boolean match(String s) {
        return s.matches(regex);
    }
}
