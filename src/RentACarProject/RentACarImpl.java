package RentACarProject;

import RentACarProject.strategy.IRentStrategy;

public class RentACarImpl implements IRentACar{

    IRentStrategy iRentStrategy;

    @Override
    public void rentaCar(Car car, Customer customer) {
        iRentStrategy.rentACar(car, customer);
    }
    public RentACarImpl(IRentStrategy iRentStrategy) {
        this.iRentStrategy = iRentStrategy;
    }
}
