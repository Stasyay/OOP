public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");

        Report report = new Report("Report3");

        SaveAs saveAs = new SaveAs(report, user);
        saveAs.SaveAsXML();
        saveAs.SaveAsXLSX();

        Persister persister = new Persister(user);
        persister.save();
    }
}