package adress.data;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest {

    private final InputStream originalSystemIn = System.in;
    String name = "Zuzzet";
    String lastName = "Hernández";
    String street = "Oaxaca";
    String city = "Cosoleacaque";
    String state = "Veracruz";
    String zip = "96344";
    String email = "z@gmail.com";
    String phoneNumber = "9221951336";

    String nameVersionTwo = "Elisa";
    String lastNameVersionTwo = "Suárez";
    String streetVersionTwo = "Oaxaca";
    String cityVersionTwo = "Cosoleacaque";
    String stateVersionTwo = "Veracruz";
    String zipVersionTwo = "96344";
    String emailVersionTwo = "elisa@gmail.com";
    String phoneNumberVersionTwo = "9221951336";

    @BeforeEach
    void setUp() {
        System.out.println("Setting up test...");
    }

    @AfterEach
    void tearDown() {
        System.setIn(originalSystemIn);
        System.out.println("Tear down test...");
    }

    @Test
    void testAddressEntryWithValidData() {
        String simulatedInput = name + "\n" + lastName + "\n" + street + "\n" + city + "\n" + state + "\n" + zip + "\n" + email + "\n" + phoneNumber + "\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        AddressBook addressBook = new AddressBook();
        addressBook.addAdressEntry();

        ArrayList<AddressEntry> addressBookEntries = addressBook.getAdressBook();
        AddressEntry lastEntry = addressBookEntries.get(addressBookEntries.size() - 1);

        assertEquals(name, lastEntry.getName());
        assertEquals(lastName, lastEntry.getLastName());
        assertEquals(street, lastEntry.getStreet());
        assertEquals(city, lastEntry.getCity());
        assertEquals(state, lastEntry.getState());
        assertEquals(zip, lastEntry.getZip());
        assertEquals(email, lastEntry.getEmail());
        assertEquals(phoneNumber, lastEntry.getPhoneNumber());

    }

    @Test
    void testAddressEntryWithInvalidDataThenValidData() {
        String simulatedInput = "\n" + name + "\n" + "\n" + lastName + "\n" +  "\n" + street + "\n" + city + "\n" + state +
                "\n" + "\n" + zip + "\n" + email + "\n" + "\n" + phoneNumber + "\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        AddressBook addressBook = new AddressBook();
        addressBook.addAdressEntry();

        ArrayList<AddressEntry> addressBookEntries = addressBook.getAdressBook();
        AddressEntry lastEntry = addressBookEntries.get(addressBookEntries.size() - 1);

        assertEquals(name, lastEntry.getName());
        assertEquals(lastName, lastEntry.getLastName());
        assertEquals(street, lastEntry.getStreet());
        assertEquals(city, lastEntry.getCity());
        assertEquals(state, lastEntry.getState());
        assertEquals(zip, lastEntry.getZip());
        assertEquals(email, lastEntry.getEmail());
        assertEquals(phoneNumber, lastEntry.getPhoneNumber());
    }

    @Test
    void testAddAddressEntryAndSorting() {
        String simulatedInput1 = name + "\n" + lastName + "\n" + street + "\n" + city + "\n" + state + "\n" + zip + "\n" + email + "\n" + phoneNumber + "\n";
        String simulatedInput2 = nameVersionTwo + "\n" + lastNameVersionTwo + "\n" + streetVersionTwo + "\n" + cityVersionTwo + "\n" + stateVersionTwo + "\n" + zipVersionTwo + "\n" + emailVersionTwo + "\n" + phoneNumberVersionTwo + "\n";

        AddressBook addressBook = new AddressBook();

        ByteArrayInputStream inputStream1 = new ByteArrayInputStream(simulatedInput1.getBytes());
        System.setIn(inputStream1);
        addressBook.addAdressEntry();
        System.out.println("First address entry added.");

        ByteArrayInputStream inputStream2 = new ByteArrayInputStream(simulatedInput2.getBytes());
        System.setIn(inputStream2);
        addressBook.addAdressEntry();
        System.out.println("Second address entry added.");

        ArrayList<AddressEntry> entries = addressBook.getAdressBook();

        assertEquals(2, entries.size());

        AddressEntry firstEntry = entries.get(0);
        AddressEntry secondEntry = entries.get(1);

        assertTrue(firstEntry.getLastName().compareTo(secondEntry.getLastName()) < 0);
        System.out.println("testAddAddressEntryAndSorting completed successfully.");

    }

}