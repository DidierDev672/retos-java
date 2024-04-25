package Four;

import java.util.ArrayList;
import java.util.List;

/* 
 * Crea una clase `Casa` con atributos como `dirección` y `tamaño`. Luego, crea una clase
 * `Familia` con un atributos `miembros`, que es una lista de objetos de la clase `Person`. Agrega
 * un método para contar cuantas personas hay en la familia
*/

class House {
    String address;
    int size;
    Family family;

    public House(String address, int size, Family family) {
        this.address = address;
        this.size = size;
        this.family = family;
    }

    @Override
    public String toString() {
        return "Casa{" +
                ", address='" + this.address + '\'' +
                ", size='" + this.size + '\'' +
                ", Family='" + this.family +
                '}';

    }
}

class Family {
    String name;
    Member member;

    public Family(String name, Member member) {
        this.name = name;
        this.member = member;
    }

    @Override
    public String toString() {
        return "Family{" +
                "name='" + this.name + '\'' +
                ", member='" + this.member + '\'' +
                '}';
    }
}

class Member {
    String name;
    String lastName;
    int age;
    String phone;
    String email;

    public Member(String name, String lastName, int age, String phone, String email) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Member={" +
                ", name=" + this.name + '\'' +
                ", lastName='" + this.lastName + '\'' +
                ", age='" + this.age + '\'' +
                ", phone='" + this.phone + '\'' +
                ", email='" + this.email + '\'' +
                '}';
    }
}

public class Four {
    public static void main(String[] args) {
        List<Family> families = new ArrayList<>();
        List<Member> members = new ArrayList<>();

        Member member = new Member("Didier", "Arias Espejo", 27, "3232834033", "ariasdev672@gmail.com");
        members.add(member);
        Family family = new Family("Arias Espejo", member);
        families.add(family);

        List<House> houses = new ArrayList<>();
        House house = new House("Calle 6A # 3 A 40", 3, family);
        houses.add(house);

        System.out.println(house.toString());
    }
}
