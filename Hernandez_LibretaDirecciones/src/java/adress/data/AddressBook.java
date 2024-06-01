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

    public void addAdressEntry(AddressEntry newEntry) {
        if (isNotDuplicated(newEntry)) {
            adressBook.add(newEntry);
            sortAddressBook();
        }
    }

    public void searchAddressEntry() {}

    public void deleteAddressEntry() {}

    public void showAddressBook() {
        for (int i = 0; i < adressBook.size(); i++) {
            System.out.print((i+1) + ": ");
            System.out.println(adressBook.get(i));
        }
    }

    public ArrayList<AddressEntry> getAdressBook() {
        return adressBook;
    }

    public AddressEntry generateAddressEntryFromUserInput() {

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

    private boolean isNumericDataValid(String data) {
        return data != null && data.matches("\\d+");
    }

    private boolean isDataNotEmpty(String data) {
        return data != null && !data.trim().isEmpty();
    }

    private boolean isNotDuplicated(AddressEntry entry) {
        boolean comparingNames;
        boolean comparingLastNames;
        boolean comparingStreets;
        boolean comparingCities;
        boolean comparingStates;
        boolean comparingZips;
        boolean comparingEmails;
        boolean comparingPhoneNumbers;

        for (AddressEntry existingEntry : adressBook) {
            comparingNames = existingEntry.getName().equalsIgnoreCase(entry.getName());
            comparingLastNames = existingEntry.getLastName().equalsIgnoreCase(entry.getLastName());
            comparingStreets = existingEntry.getStreet().equalsIgnoreCase(entry.getStreet());
            comparingCities = existingEntry.getCity().equalsIgnoreCase(entry.getCity());
            comparingStates = existingEntry.getState().equalsIgnoreCase(entry.getState());
            comparingZips = existingEntry.getZip().equalsIgnoreCase(entry.getZip());
            comparingEmails = existingEntry.getEmail().equalsIgnoreCase(entry.getEmail());
            comparingPhoneNumbers = existingEntry.getPhoneNumber().equalsIgnoreCase(entry.getPhoneNumber());

            if (comparingNames && comparingLastNames && comparingStreets && comparingCities && comparingStates && comparingZips && comparingEmails && comparingPhoneNumbers) {
                return false;
            }
        }
        return true;
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
