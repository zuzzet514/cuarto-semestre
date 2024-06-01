package adress.data;

/* acá están cada list.Permite varias operaciones como buscar/encontrar, agregar y eliminar AddressEntries. Es el libro
que contiene páginas (AdressEntry)
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class AddressBook {
    private ArrayList<AddressEntry> adressBook = new ArrayList<>();

    private InputReader reader = new InputReader();

    public void addAdressEntry() {
        AddressEntry newEntry = readAddressEntry();
        adressBook.add(newEntry);
        sortAddressBook();
    }

    public void addAddressEntryFromFile() {}

    public void searchAddressEntry() {}

    public void deleteAddressEntry() {}

    public void showAddressBook() {}


    public ArrayList<AddressEntry> getAdressBook() {
        return adressBook;
    }

    private boolean isNumericDataValid(String data) {
        return data != null && data.matches("\\d+");
    }

    private boolean isDataNotEmpty(String data) {
        return data != null && !data.trim().isEmpty();
    }
    private AddressEntry readAddressEntry() {

        AddressEntry newAddressEntry = new AddressEntry();

        String name;
        String lastName;
        String street;
        String city;
        String state;
        String zip;
        String email;
        String phoneNumber;

        name = reader.readData("Name", this::isDataNotEmpty);
        lastName = reader.readData("Last name", this::isDataNotEmpty);
        street = reader.readData("Street",this::isDataNotEmpty);
        city = reader.readData("City", this::isDataNotEmpty);
        state = reader.readData("State", this::isDataNotEmpty);
        zip = reader.readData("ZIP", this::isNumericDataValid);
        email = reader.readData("Email", this::isDataNotEmpty);
        phoneNumber = reader.readData("Phone number", this::isNumericDataValid);

        newAddressEntry.setName(name);
        newAddressEntry.setLastName(lastName);
        newAddressEntry.setStreet(street);
        newAddressEntry.setCity(city);
        newAddressEntry.setState(state);
        newAddressEntry.setZip(zip);
        newAddressEntry.setEmail(email);
        newAddressEntry.setPhoneNumber(phoneNumber);

        return newAddressEntry;
    }

    private void sortAddressBook() {
        Collections.sort(adressBook, new Comparator<AddressEntry>() {
            @Override
            public int compare(AddressEntry e1, AddressEntry e2) {
                return e1.getLastName().compareToIgnoreCase(e2.getLastName());
            }
        });
    }




}
