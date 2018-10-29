package aop.aopXML;

public class Developer {
    private String name;
    private String specialty;
    private Integer experience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public void throwSomeMysticException(){
        System.out.println("We have some strange and mystic exception here:");
        throw new ClassCastException();
    }

    @Override
    public String toString() {
        return "Developer{ \n" +
                "name='" + name + "'," + '\n' +
                "specialty='" + specialty + "'," + '\n' +
                "experience=" + experience + '\n' +
                '}';
    }
}
