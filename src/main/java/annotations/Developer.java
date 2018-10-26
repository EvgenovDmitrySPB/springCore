package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Developer {
    private String name;
    private Integer experience;
    private String specialty;

    // Аннотации @Required применяется к методам-сеттерам и означает,
    // что значение метода должно быть установлено в XML-файле.
    // Если этого не будет сделано, то мы получим
    // BeanInitializationException.

    //Аннотация @Autowired обеспечивает контроль над тем,
    // где и как автосвязывание должны быть осуществленно.
    // Мы можем использовать @Autowired как для методов,
    // так и для конструкторов. В примере, приведённом ниже
    // мы рассмотрим применение этой аннотации к конструктору.

    //В реальной жизни может сложится ситуация, когда вы создаёте
    // несколько бинов одного и того же типа, но в конкретном случае
    // вам необходим конкретный бин. Для того, чтобы указать Spring,
    // какой именно бин вам необходим, применяется аннотация @Qualifier.

    @Autowired
    public Developer(String name, Integer experience, String specialty) {
        this.name = name;
        this.experience = experience;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    @Required //Может применяться к setter’ам.
    public void setName(String name) {
        this.name = name;
    }

    public Integer getExperience() {
        return experience;
    }

    @Required
    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Required
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @PostConstruct
    public void beanInit(){
        System.out.println("Developer.beanInit");
    }

    @PreDestroy
    public void beanDestroy(){
        System.out.println("Developer.beanDestroy");
    }

    @Override
    public String toString() {
        return "Developer{" + '\n' +
                "name='" + name + ", " + '\n' +
                "experience=" + experience + "," + '\n' +
                "specialty='" + specialty +
                '}' + '\n';
    }
}
