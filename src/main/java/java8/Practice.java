package java8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice {
    public int sum_of_integers(List<Integer> numbers) {
        IntStream stream =  numbers.stream().mapToInt(Integer::intValue);
        return stream.reduce(0, Integer::sum);
    }

    public int sum_of_list_of_lists(List<List<Integer>> numbers) {
        return sum_of_integers(numbers.stream().flatMap(List::stream).collect(Collectors.toList()));
    }

    public int sum_of_integers_from_one_to_hundred() {
        IntStream stream = IntStream.range(1, 101);
        return stream.reduce(0, Integer::sum);
    }

    public List<String> filter_all_the_names_starting_with_h(List<String> names) {
        List<String> hNames = names.stream().filter((s) -> s.startsWith("H")).collect(Collectors.toList());
        return hNames;
    }

    public int find_max(List<Integer> numbers) {
        IntStream stream =  numbers.stream().mapToInt(Integer::intValue);
        return stream.reduce(0, Integer::max);
    }

    public int find_max_in_a_list_of_list(List<List<Integer>> numbers) {
        return find_max(numbers.stream().flatMap(List::stream).collect(Collectors.toList()));
    }

    public String find_max_from_strings(List<String> numbers) {
        IntStream stream =  numbers.stream().mapToInt(Integer::valueOf);
        return "" + stream.reduce(0, Integer::max);
    }

    public List<Integer> create_integer_list(int... numbers) {
        return Arrays.stream(numbers).boxed().collect(Collectors.toList());
    }

    public List<String> create_string_list(List<Integer> numbersInt) {
        return numbersInt.stream().map(String::valueOf).collect(Collectors.toList());
    }

    public int average_of_integers(List<Integer> numbers) {
        IntStream stream =  numbers.stream().mapToInt(Integer::valueOf);
        return stream.reduce(0, Integer::sum) / numbers.size();
    }

    public List<Person> sort_by_age(List<Person> persons) {
        persons.sort((person1, person2) -> person1.age.compareTo(person2.age));;
        return persons;
    }

    public List<String> get_the_names(List<Person> persons) {
        List<String> names = new ArrayList<String>();
        persons.stream().forEach(e -> names.add(e.name));
        return names;
    }

    public List<Person> make_persons_younger(List<Person> persons, int age) {
        persons.forEach(person -> person.age -= age);
        return persons;
    }

    public List<Person> find_younger_than(List<Person> persons, int age) {
        return persons.stream().filter(person -> person.age <= age).collect(Collectors.toList());
    }
}
