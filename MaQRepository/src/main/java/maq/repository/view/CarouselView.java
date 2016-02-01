
package maq.repository.view;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import maq.repository.car.Car;


@ManagedBean
@ViewScoped
public class CarouselView implements Serializable {
     
    private ArrayList<Car> cars;
     
    private Car selectedCar;
     
     
    @PostConstruct
    public void init() {
        cars = new ArrayList<Car>();
        cars.add(new Car("model", 1111, "manu", "#000000"));
         cars.add(new Car("modexl", 31111, "manud", "#000F00"));
          cars.add(new Car("model", 1111, "manu", "#000000"));
         cars.add(new Car("modexl", 31111, "manud", "#000F00"));
    }
 
    public List<Car> getCars() {
        return cars;
    }
 
 
    public Car getSelectedCar() {
        return selectedCar;
    }
 
    public void setSelectedCar(Car selectedCar) {
        this.selectedCar = selectedCar;
    }
}