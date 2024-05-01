import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Die Klasse Regex verwaltet eine Liste von Strings und ein Regex-Pattern
 * zur Überprüfung der Strings auf Übereinstimmung mit dem Muster.
 * @author Bernhard Aichinger-Ganas
 * @version 2024-05-01
 */
public class Regex {
    private List<String> strings;
    private String regex;

    /**
     * Konstruktor der Klasse.
     * Initialisiert die Liste und setzt den regulären Ausdruck für die Hostnamen und IP-Adressen Validierung.
     */
    public Regex() {
        strings = new ArrayList<>();
        regex = "^(?!-)(?!.*--)([a-zA-Z0-9-]+\\.)*[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}(?<!-)$|^(?:(?:25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\.){3}(?:25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])$";
    }

    /**
     * Gibt die Liste der gespeicherten Strings zurück.
     * @return Liste der Strings.
     */
    public List<String> getStrings() {
        return strings;
    }

    /**
     * Gibt einen String aus der Liste an einem bestimmten Index zurück.
     * @param index Der Index des Strings in der Liste.
     * @return String an der angegebenen Position.
     */
    public String getString(int index) {
        return strings.get(index);
    }

    /**
     * Setzt die Liste der Strings auf die übergebene Liste.
     * @param strings Die neue Liste von Strings.
     */
    public void setStrings(List<String> strings) {
        this.strings = strings;
    }

    /**
     * Fügt einen neuen String zur Liste hinzu.
     * @param s Der hinzuzufügende String.
     */
    public void addString(String s) {
        strings.add(s);
    }

    /**
     * Fügt ein Array von Strings zur Liste hinzu.
     * @param st Das Array von Strings, das hinzugefügt wird.
     */
    public void addStrings(String[] st) {
        for (String s : st) {
            strings.add(s);
        }
    }

    /**
     * Gibt den aktuellen regulären Ausdruck zurück.
     * @return Der aktuell gesetzte reguläre Ausdruck.
     */
    public String getRegex() {
        return regex;
    }

    /**
     * Setzt den regulären Ausdruck für die Validierung.
     * @param regex Der zu setzende reguläre Ausdruck.
     */
    public void setRegex(String regex) {
        this.regex = regex;
    }

    /**
     * Prüft, ob der String an einem bestimmten Index in der Liste mit dem regulären Ausdruck übereinstimmt.
     * @param index Index des zu prüfenden Strings.
     * @return true, wenn der String mit dem Regex übereinstimmt, sonst false.
     */
    public boolean match(int index) {
        return strings.get(index).matches(regex);
    }

    /**
     * Prüft, ob ein gegebener String mit dem regulären Ausdruck übereinstimmt.
     * @param s Der zu prüfende String.
     * @return true, wenn der String mit dem Regex übereinstimmt, sonst false.
     */
    public boolean match(String s) {
        return s.matches(regex);
    }
}
