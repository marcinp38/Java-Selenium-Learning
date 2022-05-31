package MyAdditionalExercises.ProgramowanieObiektowe.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {

//        operacje pozwalajace stworzyc strumien (kolekcje, tablice, listy, typy prymitywne...

        List<String> names = Arrays.asList("Tom", "John", "Matt", "Paul");

        Stream<String> streamNames = names.stream();
        Stream<Integer> streamInt = Arrays.asList(new Integer[]{1, 2}).stream();
        DoubleStream doubleStream = DoubleStream.of(3, 3, 2, 1, 2, 4);
        IntStream intStream = IntStream.range(1, 100);

//        Przetwarzanie danych
//        filter - filtrowanie danych  - warunek za pomoca lambdy zeby zostac w strumieniu
//        map - zmienia element na cos innego
//        limit - zwaraca okreslona ilosc elementow
//        peek - pozwala przeprowadzic operacje na kazdym elemencie
        List<String> modifiedNames =
                streamNames.filter(el -> el.startsWith("T"))
                .map(el -> el.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(modifiedNames.get(0));
        System.out.println(modifiedNames.size());
//        Operacje konczace strumien:
//        forEach - wykonanie akcji dla kazdego z elementow strumienia
//        count - zwraca ilosc elementow w strumieniu
//        allMatch - sprawdza czy elementy spelniaja jakis warunek
//        collect - zwraca nowy typ na podstawie strumienia

       long count = intStream.filter(el -> el > 20)
                .map(el-> el*2)
                .count();

        System.out.println(count);
    }
}
