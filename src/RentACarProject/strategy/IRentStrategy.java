package RentACarProject.strategy;

import RentACarProject.Car;
import RentACarProject.Customer;

public interface IRentStrategy {
    void rentACar(Car car, Customer customer);
}
