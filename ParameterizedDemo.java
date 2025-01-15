public class ParameterizedDemo {

    String name;
    String branch;
    String Domainname;

    ParameterizedDemo(String name, String branch, String Domainname) {
        this.name = name;
        this.branch = branch;
        this.Domainname = Domainname;
    }

    public static void main(String[] args) {
        ParameterizedDemo obj = new ParameterizedDemo("Karan", "Computer", "Java Full stack");
        System.out.println(
                "Name:" + obj.name + " " + "\nDepartment:" + obj.branch + " " + "\nDomain name:" + obj.Domainname);
    }
}
