public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        PersonRepository repo = new MySqlPersonRepository();
        ServicePerson sp = new ServicePerson(repo);
        sp.savePerson(person);
    }
}
