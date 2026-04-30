public class ServicePerson {

    private final PersonRepository personRepository;

    public ServicePerson(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void savePerson(Person person) {
        personRepository.savePerson(person);
    }
}