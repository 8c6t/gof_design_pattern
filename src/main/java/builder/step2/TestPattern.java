package builder.step2;

import java.time.LocalDate;
import java.time.Month;

public class TestPattern {

    public static void main(String[] args) {
        Person p1 = Person.builder()
                .firstName("FirstName")
                .lastName("LastName")
                .addressOne("AddressOne")
                .addressTwo("AddressTwo")
                .birthDate(LocalDate.of(1986, Month.AUGUST, 6))
                .sex("male")
                .driverLicense(true)
                .married(false)
                .build();

        System.out.println(p1.getAddressOne());
    }

}
