package dev.archimedes.component;

import org.springframework.stereotype.Service;

@Service
public class AddressService {

    public Address getAddress(String houseNo, String street, String district, String state, int pinCode) {
        return new Address(houseNo, street, district, state, pinCode);
    }

}
