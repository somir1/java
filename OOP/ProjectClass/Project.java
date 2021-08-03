public class Project{
        // Attribute
        private String name;
        private String description;

    // // constructor doesn not need to return 
    public Project (String nameInput, String descriptionInput){
        this.name = nameInput;
        this.description = descriptionInput;
    }

    public Project(String nameInput){
        this.name = nameInput;
        this.description = "Hi there";
    }


    public Project(){
        this.name = "Samir";
        this.description = "Hi there what do you want";
        }

    public String elevatorPitch(){

        return String.format("Hi my name is %s and %s",name, description);
    }

}