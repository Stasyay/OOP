public class SaveAs implements Savable{

    private Report report;

    private User user;

    public SaveAs(Report report, User user) {
        this.user = user;
        this.report = report;
    }

    @Override
    public void SaveAsXML() {
        System.out.println(report.getReport() + " save as XML: " + user.getName());

    }

    @Override
    public void SaveAsXLSX() {
        System.out.println(report.getReport() + " save as XLSX: " + user.getName());

    }

}
