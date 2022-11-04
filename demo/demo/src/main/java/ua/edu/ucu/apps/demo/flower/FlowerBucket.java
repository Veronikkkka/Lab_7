package ua.edu.ucu.apps.demo.flower;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class FlowerBucket extends Item {
    List<Flower> flower_list = new ArrayList<>();
    public void add(Flower f){
        flower_list.add(f);
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
