public class MySqlPersonRepository implements PersonRepository {

    @Override
    public void savePerson(Person person) {
        System.out.println("Save person ok...");
    }
}