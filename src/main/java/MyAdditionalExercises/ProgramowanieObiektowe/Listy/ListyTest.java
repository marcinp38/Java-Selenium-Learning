package MyAdditionalExercises.ProgramowanieObiektowe.Listy;

import MyAdditionalExercises.ProgramowanieObiektowe.Dokument.PdfDocument;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListyTest {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Pawel");
        names.add("Kasia");
        names.add("Ola");
        names.add("Pawel");

        System.out.println(names.get(2));
        System.out.println(names.indexOf("Pawel"));
        System.out.println(names.lastIndexOf("Pawel"));
        System.out.println(names.contains("Krysia"));
        System.out.println(names.size());
        System.out.println(names.isEmpty());
        System.out.println();

        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println(numbers.get(1));
        System.out.println(numbers.indexOf(2));
        System.out.println(numbers.lastIndexOf(4));
        System.out.println(numbers.contains(8));
        System.out.println(numbers.size());
        System.out.println(numbers.isEmpty());
        System.out.println();

        List<String> diffNames = new ArrayList<>();
        diffNames.addAll(names);

        List<PdfDocument> pdfDocuments = new ArrayList<>();
        pdfDocuments.add(new PdfDocument());

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println();
        for (String name:names) {
            System.out.println(name);
        }

    }

}
