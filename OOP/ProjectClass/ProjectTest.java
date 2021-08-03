public class ProjectTest{
    public static void main(String[] args){

        Project name = new Project();
        Project name1 = new Project("Bob");
        Project name2 = new Project("Bob", "HELLLLOOOO");

        System.out.println(name.elevatorPitch());
        System.out.println(name1.elevatorPitch());
        System.out.println(name2.elevatorPitch());
    }
}