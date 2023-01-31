package RentACarProject.strategy;

import RentACarProject.Car;
import RentACarProject.Customer;
import RentACarProject.Person;

public class BmwRentStrategyIml implements IRentStrategy{
    @Override
    public void rentACar(Car car, Customer customer) {
        System.out.println("Bmw Kiralama");

    }
}
